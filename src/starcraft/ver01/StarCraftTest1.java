package starcraft.ver01;

import java.util.Scanner;

public class StarCraftTest1 {

	public static void main(String[] args) {
		
		final int ZEALOT = 1;
		final int MARIN = 2;
		final int ZERGLING = 3;
		final int GAME_END = 0;
		
		Hatchery hatChery1 = new Hatchery(1);
		Marin marine1= new Marin("마린1");
		Zergling zergling1 = hatChery1.createZergling("저글링1");
		Zergling zergling2 = hatChery1.createZergling("저글링2");
		System.out.println(zergling1.getName()+","+zergling2.getName()+" 생산중");
		System.out.println("남아있는 에그 갯수 : " + hatChery1.getEgg());
		
		
		GateWay gateway = new GateWay(1);
		GateWay gateway2 = new GateWay(2);
		Zealot zealot1 = gateway.createZealot("질럿1");
		Zealot zealot2 = gateway.createZealot("질럿2");
		System.out.println(zealot1.getName());
		System.out.println(zealot2.getName());
		System.out.println(gateway.getNumber() + " : " +gateway.getCount());
		System.out.println(gateway2.getNumber() + " : " +gateway2.getCount());
		System.out.println("-------------------------");
		Scanner sc = new Scanner(System.in);
		int unitChoice = -1;
		do {
			System.out.println("유닛을 선택하세요");
			System.out.println("1.질럿\t 2.마린 \t 3.저글링 \t 0.게임종료");
			unitChoice = sc.nextInt();
			if (unitChoice == ZEALOT) {
				System.out.println("질럿이 생산되었습니다.");
			} else if(unitChoice == MARIN) {
				
			} else if(unitChoice == ZERGLING) {
				
			} else {
				System.out.println("프로그램을 종료 합니다.");
				unitChoice = GAME_END;
			}
			
		} while(unitChoice != GAME_END);
	
		// while <--, do while
		// while --> 조건식을 확인하고 코드를 수행하는 녀석
		// do while --> 무조건 한번은 수행을 하고 다시 조건을 확인하는 녀석
		//do {
			// 반복 수행 구문 
		 //while(조건식);
		
		
		
		
		
		
		
	} // end of main

} // end of class
