package ch05;

public class OrderTest {

	public static void main(String[] args) {
		
		Order order1 = new Order();
		
		order1.restaurant = "홍콩반점";
		order1.foodname = "고기짜장";
		order1.number = 1;
		order1.adress = "용호로243번길3 3층";
		System.out.println(order1.restaurant);
		System.out.println(order1.foodname);
		System.out.println(order1.number);
		System.out.println(order1.adress);
		
		

	}

}
