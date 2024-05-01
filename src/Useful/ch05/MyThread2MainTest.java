package Useful.ch05;

public class MyThread2MainTest {

	
	// 메인 작업자
	public static void main(String[] args) {
		
		System.out.println("main start");
		
		// 문제 MyThread2 를 메모리에 올리고
		// 그 안에 정의된 run() 메서드를 호출 하시오
		// 힌트 ---> Thread 문서를 반드시 확인 하시오.
		MyThread2 mythread2 = new MyThread2();
		// myThread2.run(); 일반 메서드 호출 임 !!
		
		// 새로운 작업자를 생성해서 위임 시킬때는 Thread 안에 있는 start() 메서드를 호출해야 된다.
		
		
		Thread thread = new Thread(mythread2);
		thread.start();
		// 결국 다른작업자에게 일을 위임하려면 쓰레드에 start() 를 호출 해야해!!
		
		
		System.out.println("메인 종료");
		
		
	} // 

}
