package exercise;

import java.util.Scanner;

public class WhileExercise1 {

	public static void main(String[] args) {

		// 1+2+3+4+5+6+7+8+9+10
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 입력하세요 : ");
		int c = sc.nextInt();
		boolean start = true;
		int b = 0;
		int a = 1;
		while (start) {
			b = b + a;
	
		
			if (a == c) {
				System.out.println("총 합입니다");
				start = false;
			}
			
			System.out.println("연산 ("+a+")"  + b);
			a++;
			
		}  // boolean 을 이용
		
		
	
		
	} // end of main

} // end of class
