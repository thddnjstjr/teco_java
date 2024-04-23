package powerJava;

import java.util.Scanner;

public class Thunder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시간 간격을 입력하시오 : ");
		double time = sc.nextDouble();
		double space = time * 340;
		System.out.println("번개가 발생한곳 까지의 거리 : " + space + "m");
		

	}

}
