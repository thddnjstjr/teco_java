package Useful.ch03;

import javax.management.RuntimeErrorException;

public class NickName extends RuntimeException{
	
	private String nick;
	
	public String getNick() {
		return nick;
	}
	
	public void setNick(String nick) throws RuntimeException{
		if(nick == null) {
			throw new RuntimeException("닉네임을 입력해주세요");
		}
		if(nick.length() < 3) {
			throw new RuntimeException("닉네임은 3글자 이상이어야합니다");
		}
		if(nick.matches("^[~!@#$%^&*]$")) {
			throw new RuntimeException("닉네임에 특수문자는 들어갈수없습니다");
		}
		this.nick = nick;
	}
	
	
	
}
