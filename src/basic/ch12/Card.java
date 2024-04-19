package basic.ch12;

public class Card {

	private String bankName;
	static int cardNumber = 4523415;
	int userNumber;
	String userName;
	public Card(String n) {
		userName = n;
		userNumber= Card.cardNumber;
		Card.cardNumber++;
	}
	public void changeName(String n) {
		userName = n;
	}
	
	// 코드 테스트 (메인 함수)
	public static void main(String[] args) {
		Card user1 = new Card("송원석");
		Card user2 = new Card("변영준");
		
		System.out.println(user1.userName+user1.userNumber);
		System.out.println(user2.userNumber);
		
	} // end of main
	
} // end of class
