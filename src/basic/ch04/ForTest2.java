package basic.ch04;

public class ForTest2 {

	public static void main(String[] args) {
		

		// 화면에 구구단 2단을 출력 하시오.
		int a=1;
		for(a=1; a<10; a++) {
			System.out.println("2 x "+ a + " = " + (2 * a));
		}
			
		//화면에 구구단 3단을 출력하시오.
		// 변수의 효용 ( 언제든 접근해서 활용 가능)
	    
		for(a=1; a<10; a++) {
			System.out.println("2 x "+ a + " = " + (2 * a));
		}
		// 구구단 5단을 출력 하시오
		int num =5;
		for(int i = 1; i < 10; i++) {
			System.out.println(num + " x "  +  i  + " = " + (num * i));
			
		}
		System.out.println("=------------------------------");
		// for 구문을 활용해서 6단을 출력 하시오
		num = 6;
		for(int i = 1; i < 10; i++) {
			System.out.println(num + " x "  +  i  + " = " + (num * i));
			
		}
		System.out.println("=------------------------------");
		// for 구문을 활용해서 7단을 출력 하시오
		num = 7;
		for(int i = 1; i < 10; i++) {
			System.out.println(num + " x "  +  i  + " = " + (num * i));
			
		}
		System.out.println("=------------------------------");
		// for 구문을 활용해서 8단을 출력 하시오
		num = 8;
		for(int i = 1; i < 10; i++) {
			System.out.println(num + " x "  +  i  + " = " + (num * i));
			
		}
		System.out.println("=------------------------------");
		// for 구문을 활용해서 9단을 출력 하시오
		num = 9;
		for(int i = 1; i < 10; i++) {
			System.out.println(num + " x "  +  i  + " = " + (num * i));
			
		}
	} // end of main

} // end of class
