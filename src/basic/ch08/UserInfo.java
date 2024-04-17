package basic.ch08;

public class UserInfo {
	
	public String userId;
	public String userPassword;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	// 생성자 오버로딩이란
	// 생성자의 개수가 여러개 있다
	
	// 기본 생성자 형태 만들어 보기
	public UserInfo() {}
	
	public UserInfo(String id) {
		userId = id;
	}
	
	public UserInfo(String id,String inputUserName) {
		userId = id;
		userName = inputUserName;
	}
	
	// 연습 문제 - 생성자를 만들수있는
	// 1 - 매개변수 3개를 받는 생성자를 만들어 주세요.
	public UserInfo(String id,String inputUserName,String pwd) {
		userId = id;
		userName = inputUserName;
		userPassword = pwd;
	}
	// 2 - 매개변수 4개를 받는 생성자를 만들어 주세요
	public UserInfo(String id,String inputUserName,String pwd, String address) {
		userId = id;
		userName = inputUserName;
		userPassword = pwd;
		userAddress = address;
	}
	// 3 - 매개변수 5개를 받는 생성자를 만들어 주세요
	public UserInfo(String id,String inputUserName,String pwd, String address, String PN) {
		userId = id;
		userName = inputUserName;
		userPassword = pwd;
		userAddress = address;
		phoneNumber = PN;
	}
	
	
	
} // end of class
