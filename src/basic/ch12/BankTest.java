package basic.ch12;

public class BankTest {

	public static void main(String[] args) {
		Bank sws = new Bank("송원석");
		Bank kkh = new Bank("김근호");
		Bank bjy = new Bank("변준영");
		
		sws.login();
		kkh.login();
		bjy.login();
		
	}

}
