package basic.ch11;

public class PersonTest {

	public static void main(String[] args) {
			
		Person person1 = new Person("홍길동", 100);
		Person personBox = person1;
		Person personBox2 = person1.getPerson();
		Person personLee = new Person("이순신", 101);
		System.out.println("----------------------------");
		// 위 코드까지는 Heap 메모리 영역에 객체가 2개 생성된 상태 이다.
		// 지역변수인 person1, personBoxm personBox2 는 같은 객체를 가르킨다.
		
		// 연습 문제 - 
		// setName 메소드를 만들어 주세요
		
		personBox2.setName("티모");
		person1.showInfo();
		person1.setAge(50);
		person1.getPerson();
		person1.showInfo();
		
	} // end of main

} // end of class 
