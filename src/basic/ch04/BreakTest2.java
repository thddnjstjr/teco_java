package basic.ch04;

public class BreakTest2 {

	public static void main(String[] args) {

		// for 문 대신에 while 문을 써서 코드 작성
		// 1부터 10까지 중에 7에서 멈춤
		int a = 1;
		while (a <11) {
			
			// 단독 if 구문은 - 수행이 될 수도 있고 안될 수도 있다.
			if ((a & 7) == 0) {
				// 중간에 멈추어라
				break;
			}
			System.out.println("a의 값 : " + a);
			a++;
		}

	} // end of main

} // end of class
