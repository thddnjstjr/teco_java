package basic.ch09;

import java.util.Scanner;

public class Fight {

	public static void main(String[] args) {

		Warrior garosh = new Warrior("가로쉬", 2, 400, 2);
		Magition jaina = new Magition("제이나", 3, 250, 1);
		Scanner sc = new Scanner(System.in);
		boolean garoshturn = true;
		boolean jainaturn = true;
		int allturn = 0;
		int order;
		System.out.println("가로쉬와 제이나가 최후의 싸움을 시작합니다.");
		Loop1: while (allturn < 20) {
			while (garoshturn) {
				System.out.println("\n가로쉬 턴 입니다 명령을 수행해주세요");
				System.out.print("1.회전베기 2.강하게 찍기 3.도망가기 4.현재 상태보기 5.기력회복하기(10) : ");
				order = sc.nextInt();
				if (order == 1) {
					if (garosh.maNa < 1) {
						System.out.println("\n기력이 부족합니다 시전할수없습니다!!");
						continue;
					}
					garosh.windslash(jaina);
					System.out.println("제이나에게 회전베기를 시전했습니다 \n 데미지  " + jaina.totalDamage + " 을 주었다 효과는 굉장했다");
					System.out.println("기력을 1소모했습니다");
					System.out.println("넘어가려면 아무거나 입력하시오");
					sc.next();
					break;
	
				} else if (order == 2) {
					if (garosh.maNa < 3) {
						System.out.println("\n기력이 부족합니다 시전할수없습니다!!");
						continue;
					}
					garosh.strongattack(jaina);
					System.out.println("제이나에게 강하게 찍기를 시전했습니다 \n 데미지  " + jaina.totalDamage + " 을 주었다 효과는 굉장했다");
					System.out.println("기력을 3소모했습니다");
					System.out.println("넘어가려면 아무거나 입력하시오");
					sc.next();
					break;
				} else if (order == 3) {
					System.out.println("도망갔습니다 게임을 종료합니다");
					break Loop1;
				} else if (order == 4) {
					garosh.showInfo();
					continue;
				} else if (order == 5) {
					garosh.chargeMana();
					System.out.println("기력을 10회복했습니다 이번턴은 쉽니다.");
					break;
				} else {
					System.out.println("잘못된 선택입니다 다시 선택해주세요");
					continue;
				}

			}
			if (jaina.MagitionHealth <= 0) {
				System.out.println("\n제이나가 죽었습니다 가로쉬가 승리하였습니다!!");
				break Loop1;
			}
			while (jainaturn) {
				System.out.println("\n제이나 턴 입니다 명령을 수행해주세요");
				System.out.print("1.비전 화살 2.화염구 3.도망가기 4.현재 상태보기 5.마나 회복하기(15) : ");
				order = sc.nextInt();
				if (order == 1) {
					if (jaina.maNa < 2) {
						System.out.println("\n마나가 부족합니다 시전할수없습니다");
						continue;
					}
					jaina.visionarrow(garosh);
					System.out.println("가로쉬에게 비전화살을 날렸습니다 \n 데미지  " + garosh.totalDamage + " 을 주었다 효과는 굉장했다");
					System.out.println("마나 30을 소모하셨습니다");
					System.out.println("넘어가려면 아무거나 입력하시오");
					sc.next();
					break;
				} else if (order == 2) {
					if (jaina.maNa < 6) {
						System.out.println("\n마나가 부족합니다 시전할수없습니다!!");
						continue;
					}
					jaina.fireball(garosh);
					System.out.println("가로쉬에게 화염구를 날렸습니다 \n 데미지 " + garosh.totalDamage + " 을 주었다 효과는 굉장했다");
					System.out.println("마나 70을 소모하였습니다.");
					System.out.println("넘어가려면 아무거나 입력하시오");
					sc.next();
					break;
				} else if (order == 3) {
					System.out.println("도망가기를 선택했습니다 게임이 종료됩니다.");
					break Loop1;
				} else if (order == 4) {
					jaina.showInfo();
				} else if (order == 5) {
					jaina.chargeMana();
					System.out.println("마나를 15회복했습니다 이번턴은 쉽니다.");
					break;
				} else {
					System.out.println("잘못된 선택입니다 다시 선택해주세요");
					continue;
				}

			}
			if (garosh.WarriorHealth <= 0) {
				System.out.println("\n가로쉬가 죽었습니다 제이나가 승리하였습니다!!");
				break Loop1;
			}
			allturn++;
		}

	}

}
