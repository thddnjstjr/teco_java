package powerJava;

import java.util.Scanner;

public class If_Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학점을 입력하시오");
		int score = sc.nextInt();
		if(score >90) {
			System.out.println("A학점 입니다.");
		} else if(score > 80) {
			System.out.println("B학점 입니다.");
		} else {
			System.out.println("c학점 입니다");
		}
		
		
		
		
	}

}
