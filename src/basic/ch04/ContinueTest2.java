package basic.ch04;

public class ContinueTest2 {

	public static void main(String[] args) {

		// 1부터 100까지 숫자 중에 3의 배수를 출력 하세요

		// 1 ~ 100 --> 반복적인 패턴이 확인
		// 만약 3의 배수라면 화면에 숫자를 출력하세요
		// 반복문은 while 을 사용해 주세요
		int a = 1;
		boolean flag = true;
		// 풀이 - 2 : 특정 조건이 되었을 때 반복문을 멈추어라
		while (flag) {
			if (a % 3 == 0) {
				System.out.println("3의 배수 : " + a);
			}
			// 특정 조건 --> 멈추기
			if (a == 40) {
				flag = false;
				// i == 100
			}
			a++; // i == 101
		}

		// 풀이 - 1
//		while (a < 101) {
//			if (a % 3 == 0) {
//				System.out.println("3의 배수 : " + a);
//			}
//			a++;
//		}
	} // end of main

} // end of class
