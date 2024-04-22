package basic.ex13;

import java.util.Random;

public class LottoNumberMaker {

	private String version = "1.0.0";
	
	// main 함수
	public static void main(String[] args) {
		
		// 멤버 변수
		
		
		makeNumber();
		System.out.print(makeNumber()+ "\t");
		System.out.print(makeNumber()+ "\t");
		System.out.print(makeNumber()+ "\t");
		System.out.print(makeNumber()+ "\t");
		System.out.print(makeNumber()+ "\t");
		System.out.print(makeNumber()+ "\t");
		
	
	} // end of main
	
	// 인스턴스에 속하지 않는 함수 만들기
	public static int makeNumber() {
		// static 함수안에 멤버 변수를 사용할 수 없다.
		// 메모리가 뜨는 순서 !!
		// System.out.println("ver : " + version);
		// 자바 도구 -- 표준 API
		// 난수 발생기 -> 랜덤적인 값을 생성
		Random random = new Random();
		int resultNumber = random.nextInt(10) + 1; // 0 ~~~ 44
		return resultNumber;
	}
	
	// 인스턴스에 속하지 않는 함수 만들기
	public static int[] makeNumbers() {
		int[] numbers = new int[6];
		Random random = new Random();
		// 중복된 랜덤 1 ~ 45 숫자가 나온다면
		// 다시 반복문을 돌려서 중복 안되게 만들어야 한다.
		for(int i = 0; i< 6; i++) {
			int num = random.nextInt(45) +1;
			// for -> 중복된 숫자가 없도록 코드를 완성하시오
			//[0] 3.
			//[1] 3.
			numbers[i] = num;
			for(int j = 0; j<i;j++) {
				if(numbers[i] == numbers[j]) {
					i--;
					break;
				}
			}
		}
			
		
		return numbers;
	}
	
	
}
