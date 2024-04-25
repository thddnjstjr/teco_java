package powerJava;

import java.util.Scanner;

public class If_Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int answer = sc.nextInt();
		if((answer % 2) == 0 ) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");
		}
		
		
		
		
		
	}

}
