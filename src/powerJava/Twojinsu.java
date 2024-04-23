package powerJava;

import java.util.Scanner;

public class Twojinsu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int jungsu = sc.nextInt();
		if (jungsu > 99) {
			System.out.println("두자리수 까지만 입력할수있습니다.");
		} else if (jungsu <1) {
			System.out.println("1이상의 정수를 입력하시오.");
		} else {
			
		}
		
		
		
	}

}
