package basic.exercis.test01;

public class MainTest1 {

	public static void main(String[] args) {
		D d = new D();
		System.out.println(d.c.b.a.getName());
		d.c.b.a.setName("홍길동");
		System.out.println(d.c.b.a.getName());
		
		

	}

}
