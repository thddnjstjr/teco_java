package powerJava;

import java.util.Scanner;

public class Energy {

	public static void main(String[] args) {

		double energy;
		int weight;
		int speed;
		Scanner sc = new Scanner(System.in);
		System.out.println("물체의 무게를 입력하시오");
		weight = sc.nextInt();
		System.out.println("물체의 속도를 입력하시오");
		speed = sc.nextInt();
		energy = 0.5 * weight * speed * speed;
		System.out.println("물체의 에너지는 : " + energy + " 입니다.");
		
	}

}
