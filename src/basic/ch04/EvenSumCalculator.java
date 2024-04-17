package basic.ch04;

import java.util.Scanner;

public class EvenSumCalculator {

	public static void main(String[] args) {
		
		// 
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값을 입력 하세요 : ");
		int maxNumber = sc.nextInt();
		// 1 <--       10 -> 2 + 4 + 6 + 8 + 10;
		int sum = 0;
		
		// 10
		// 반복적인 패턴이 확인 된다
		for(int i = 2; i <= maxNumber; i += 2) {
			
			sum += i;
			System.out.println("sum : " + sum + "\n");
		}
		
		System.out.println("sum : " + sum);
		
	
	} // end of main

} // end of class
