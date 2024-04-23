package basic.exercis.test02;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 문제 1
		D d = new D();
		C c = new C();
		B b = new B();
		A a = new A();
		
		// 메서드 의존 주입
		d.setD(c);
		c.setC(b);
		b.setB(a);
		
		// 내부에서 객체를 생성하지 않고 외부에서
		// 객체를 주입한 후에 D에 getName()을 호출하시오
		
		// 외부에서 주입 받을 수 있도록 코드를 작성
		
		
		System.out.println(d.getD().getC().getB().getName());
 	}

}
