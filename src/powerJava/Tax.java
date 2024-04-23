package powerJava;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("건낸 돈을 입력하시오");
		int paymoney = sc.nextInt();
		System.out.println("받은 잔돈을 입력하시오");
		int changeMoney = sc.nextInt();
		System.out.println("건낸돈은 : " + paymoney + "원입니다");
		System.out.println("상품가격은 : " + (paymoney - changeMoney) + "원입니다");
		System.out.println("부가세는 : " + (paymoney - changeMoney)/10 + "원입니다");
		System.out.println("잔돈은 : " + changeMoney + "원입니다");
		
		
		
		
	}

}
