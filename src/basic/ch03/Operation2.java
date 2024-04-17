package basic.ch03;

public class Operation2 {

	public static void main(String[] args) {
		
		int result1 = 5 + 3;
		int result2 = 5 - 3;
		int result3 = 5 * 3;
		// 고민해볼 사항
		// int  result4 = 5 / 3;
		double result4 = 5.0 / 3.0;
		int result5 = 5 % 3;
		
		System.out.println("resule1 " + result1);
		System.out.println("resule2 " + result2);
		System.out.println("resule3 " + result3);
		System.out.println("resule4 " + result4);
		System.out.println("resule5 " + result5);
		
		
		// 문제
		// 1. (12 + 3) / 3 값을 화면에 출력해 보세요
		int a = (12+3) / 3;
				System.out.println(a);
				
		// 2. (25%2) 값을 화면에 출력해 보세요
		// 어떤 수를 2로 나누었을 때 나머지가 0이면 짝수 1이면 홀수
		int b=25%2;
		System.out.println("25 나누기 2의 나머지는 " + b);
		System.out.println("25 = 홀수");
		
		// 3. 15를 4로 나눈 후, 그 결과의 
		
		// 직접 산술 연산자 문제 만들기
		
		// 1. 어느날 햄버거집에서 6700원짜리 햄버거를
		// 40프로 할인행사를 시작했다
		// 철수는 햄버거를 반 친구들에게 30개를 사줬는데
		// 이날 철수는 얼마를 썼을까?
		int original_price = 6700;
		int discount_price = original_price * 60 /100;
		int paymoney = discount_price * 30;
		System.out.println("철수가 사용한 돈은" + paymoney+ "원");
		
		
		// 2. 겨울이는 강아지 네마리에게 고기 10개를 
		// 알맞게 배분해서 나눠줬다 그럼 남은 고기는 몇개일까?
		int meat = 10;
		int meat2 = meat % 4;
		System.out.println(meat2);
	} // end of main

} // end of class
