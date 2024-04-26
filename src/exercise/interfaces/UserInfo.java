package exercise.interfaces;

public class UserInfo {
// DTO 개념으로 바라볼수있다
	public static int SERIAL_NUM = 0;
	private int id;
	private String userName;
	private String pw;
	
	public UserInfo(String userName, String pw) {
		this.userName = userName;
		this.pw = pw;
	}
	
	public int getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public String getPw() {
		return pw;
	}
	@Override
	public String toString() {
		return  id + " , " + userName + " ," + pw;
	}
	
	
	
}
