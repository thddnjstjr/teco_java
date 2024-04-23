package powerJava;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("구의 반지름을 입력하시오 : ");
		double circleRadius = sc.nextDouble();
		double pie = 3.1416;
		double circleVolume = ((circleRadius * circleRadius * circleRadius) /3.0) * 4.0;
		System.out.println(circleVolume);
		
	}

}
