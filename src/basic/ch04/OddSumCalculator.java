package basic.ch04;

import java.util.Scanner;

public class OddSumCalculator {

	public static void main(String[] args) {
		// 사용자의 입력값을 받아서 1 부터 x까지 숫자에 홀수를 덧셈하고 출력 하시오
		Scanner sc = new Scanner(System.in);
		System.err.println("정수값을 입력하세요 : ");
		int maxnumber = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= maxnumber;i += 2) {
			sum += i;
			System.out.println("sum : " + sum + "\n");
		}
		System.out.println(sum);
	} // end of main

} // end of class
