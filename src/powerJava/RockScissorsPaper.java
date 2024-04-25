package powerJava;

import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		boolean winner = true;
		boolean draw;
		boolean win;
		boolean loose;
		while(winner) {
		System.out.println("가위바위보 게임입니다");
		System.out.println("무엇을 내시겠습니까?");
		System.out.println("1.가위 2.바위 3.보");
		int choice = sc.nextInt();
		int computer = random.nextInt(2)+1;
		if(choice == computer) {
			System.out.println("무승부 입니다.");
		//} else if (choice == (computer))
		
	}

}
}
}