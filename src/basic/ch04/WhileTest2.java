package basic.ch04;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {

		// 특정 조건일 때 반복문을 종료 시켜 보자.
		boolean flag = true; // 깃발
		int a = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 입력하시오 : ");
		int end = sc.nextInt();
		while (flag) {

			if (a == end) {
				flag = false;
				return;
			}
			System.out.println("a : " + a);

			a++;
		} // end of while

	} // end of main1

} // end of class
