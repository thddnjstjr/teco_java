package ch06;

// 자바의 모든 코드는 class XXX {} 블로안에 코드를 작성하기로 약속 되어 있다.
public class Function1 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int sum;
		add(10, 10);
		int result2 = calcSum(1, 100);
		System.out.println(result2);
	} // end of main

	static int add(int n1, int n2) {
		int result;
		result = n1 + n2;
		return result;
	}

	// 연습 문제
	// 함수를 수정 -- 파라메터 정수 2개 받을 수 있도록 설계
	// s1, s2 -->
	// 1, 10 ---> 55
	// 7, 200 --->
	int result2 = calcSum(7, 200);

	static int calcSum(int x, int y) {
		int sum = 0;
		int i;
		for (i = x; i <= y; i++) { // 횟수 100번 동작 하는 녀석

			sum = sum + i; // 0 = 0 + 1

		}
		return sum;
	}

} // end of class

// int a ; 사용못함