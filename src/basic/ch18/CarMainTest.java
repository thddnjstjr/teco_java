package basic.ch18;

public class CarMainTest {

	public static void main(String[] args) {
		Car car = new Car();
		car.startCar();
		car.stopCar();
		
		// 엔진의 속성인 name 변수에 값을 초기화 해보자.
		car.engine.name = "V8";
		car.engine.price = 30000000;
		
		System.out.println(car.engine.name);
		System.out.println(car.engine.price);
	}

}
