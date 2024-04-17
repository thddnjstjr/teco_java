package basic.ch08;

public class StudentMainTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("홍길동", 101, 3); // 객체 
		System.out.println(s1); // 주소값이 출력이 된다.
		s1.showInfo();
		
		// 연습문제
		// s2 참조 변수에 이름으로 학생을 메모리에 올리고
		// 호출해주세요
		System.out.println("----------------------");
		Student s2 = new Student("콜 파머", 19, 3);
		s2.showInfo();
		
		// 변수에 직접 접근해서 값을 초기화 해보세요
		System.out.println("----------------------");
		Student s3 = new Student(); // 기본 생성자로 메모리가 올림
		s3.name = "무드리크";
		s3.number = 17;
		s3.grade = 2;
		s3.showInfo();
		
		// 생성자를 여러개 만들어 줄 수 있다
		// 생성자 오버로딩이라고 한다.
		
	} // end of main

}
