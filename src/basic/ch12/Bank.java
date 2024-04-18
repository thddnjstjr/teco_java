package basic.ch12;

import java.util.Random;

public class Bank {

	private String name;
	public  String person;
	static Random random = new Random();
	 int a = random.nextInt(9);
	       public Bank(String person) {
	    	   	name = "우리은행";
	    	   	this.person = person;
	       }
	       public void login() {
	    	   System.out.println(name+"에서 알립니다 "+ person + "님의 계좌번호는" + a+a+a+"-"+a+a+a+a+"-"+a+a + " 입니다" );
	       }
	       
	       public String getName() {
	    	   return name;
	       }
	       
	       
	       
	       
	       
}
