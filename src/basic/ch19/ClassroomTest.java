package basic.ch19;

public class ClassroomTest {

	public static void main(String[] args) {

		Classroom classroom = new Classroom("3학년4반");
		Student student1 = new Student("홍길동", 20);
		Student student2 = new Student("이순신", 24);
		classroom.addStudent(student1);
		classroom.addStudent(student2);
		classroom.showStudents();
		
		
		
	}

}
