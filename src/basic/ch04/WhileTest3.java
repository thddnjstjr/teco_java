package basic.ch04;

public class WhileTest3 {

	public static void main(String[] args) {
		
		// 1부터 5까지 덧셈 연산을 하라
		// 1 + 2 + 3 + 4 + 
		
		int start = 1; // 시작값은 1
		int end = 5; // 5번 
		int sum = 0;
		
		// 첫번째 반복
		// 6번째
		//     6    <= 5 거짓 --> 반복문 종료
		boolean flag = true;
		while(flag) {
			if(start==end) {
				// 실행에 제어권을 반납한다.
				flag = false;
			}
		//1: 0     0      1  ==> sum : 1
		//2: 1  =  1  +   2  ==> sum : 3
		//3: 3  =  3  +   3  ==> sum : 6
			sum = sum + start;
			System.out.println("sum("+start+") : " + sum);
			
			start++; //1씪 증가
		}

	}

}
