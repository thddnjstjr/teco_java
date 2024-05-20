package Useful.ch06;

import java.util.ArrayList;

import exercise.toy.Product;

public class WaitNotifyExample {

	// 객체들간에 공유하는 데이터(자원)을 설계
	// static 이기 때문에 인스턴스들이 자원을 공유할 수 있다.
	private static ArrayList<Integer> sharedResource = new ArrayList<>();
	private static boolean isDataAvailable = false;

	// 정적 내부클래스 활용 - 생산자 만들어 보기
	static class Producer extends Thread {
		@Override
		public void run() {

			synchronized (sharedResource) {
				System.out.println("생산자는 data 생성 시작~ ");

				for (int i = 0; i < 10; i++) {
					sharedResource.add(i + 1);

					// 시각적 인지를 위해서 임의 코드 추가
					System.out.print(".");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println();
				// 작업이 다 끝나면 상태 변경 처리
				isDataAvailable = true;
				// sharedResource 쓸수 있도록 다른 작업자들에게 알려 주기 notify
				sharedResource.notify();
				
			} // 동기화 블록
		}
	}

	// 소비자 만들어 보기
	static class Consumer extends Thread {
		@Override
		public void run() {

			synchronized (sharedResource) {
				// 처음 시작이 false
				// false -> ! -> true -> 반복 수행이 됨
				while(!isDataAvailable) {
					System.out.println("고객은 데이터 생성까지 기다려 ...");
					try {
						sharedResource.wait(); // 대기 상태
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
				}
				
				// isDataAvailable <-- 생산자가 변수를 변경해 줌
				System.out.println("데이터가 생성 완료 되어서 사용 가능 함 ");
				System.out.println(sharedResource);
				
			} // 동기화 블록
			
			
		}
	}

	// 테스트 코드
	public static void main(String[] args) {
		
		Consumer consumer = new Consumer();
		Producer producer = new Producer();
		
		consumer.start(); // 소비자는 --> run() --> 동기화 블럭 --> wait(스레드 대기)
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		producer.start(); // 생산자가 스레드 시작
		// run() --> for (10번) -> list add () --> notify() 알려주고 있다.
		
		// 실행에 흐름을 잘 확인 --> 프로듀서-컨슈머 패턴
		
		
	} // end of main

}
