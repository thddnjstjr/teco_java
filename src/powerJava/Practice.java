package powerJava;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 값을 입력하시오 : ");
		int x = sc.nextInt();
		System.out.println("두번째 값을 입력하시오 : ");
		int y = sc.nextInt();
		System.out.println("원하시는 서비스를 고르세요");
		System.out.println("1.두 수의 합 2.두 수의 차 3. 두 수의 곱 4. 두 수의 평균 5. 둘 중 큰 수 6. 둘 중 작은 수");
		int order = sc.nextInt();
		int bigger = (x>y)?x:y;
		if(order == 1) {
			System.out.println(x + y);
		} else if(order == 2) {
			if(x>y) {
			System.out.println(x - y);
			} else {
				System.out.println(y - x);
			}
		}
			else if(order == 3) {
				System.out.println(x * y);
			}
			else if(order == 4) {
				System.out.println((x + y)/2);
			}
			else if(order == 5) {
				System.out.println((x>y)?x:y);
			}
			else if(order == 6) {
				System.out.println((x<y)?x:y);
			} else {
				System.out.println("잘못입력하셨습니다 다시 입력해주세요");
			}
		
	}

}
