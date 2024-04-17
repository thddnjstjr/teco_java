package basic.ch09;

import java.util.Scanner;

public class GoingToSchool2 {

	public static void main(String[] args) {
		
		// 설계된 클래스를 가지고 본인이 의도한 대로 실행에 흐름을 만들어 보자.
		
		// 스캐너를 활용해서 1번을 누르면 버스를 태워서 실행에 흐름 만들기
		// 2번을 누르면 지하철 태우는 실행에 흐름을 만들어 보자.
		Bus bus = new Bus(100);
		Bus bus2 = new Bus(200);
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		Student s1 = new Student("티모" , 100_000);
		Student s2 = new Student("티모" , 100_000);
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		s1.showInfo();
		while(flag) {
		System.out.print("타고싶은 대중교통을 선택하세요 1.버스 2.지하철 : ");
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.println("버스를 선택하셨습니다.");
			s1.takeBus(bus);
			s1.showInfo();
			bus.showInfo();
	
		} else if(choice == 2) {
			System.out.println("지하철을 선택하셨습니다.");
			s1.takeSubway(subway1);
			s1.showInfo();
			subway1.showInfo();
			
		} else {
			System.out.println("잘못 선택하셨습니다 다시 선택해주세요");
		}
		}
		
	}

}
