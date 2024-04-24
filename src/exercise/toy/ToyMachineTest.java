package exercise.toy;

import java.util.Scanner;

public class ToyMachineTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LionDoll lion = new LionDoll();
		TeddyBear bear = new TeddyBear();
		Fail fail = new Fail();
		Airpot air = new Airpot();
		ToyMachine toy = new ToyMachine();
		Product[] pro = new Product[10];
		int coin = 30;
		pro[0] = lion;
		pro[1] = bear;
		pro[2] = air;
		pro[3] = fail;
		pro[4] = fail;
		pro[5] = fail;
		pro[6] = fail;
		pro[7] = fail;
		pro[8] = fail;
		pro[9] = fail;
		boolean flag = true;
		while (flag) {
			System.out.println("당첨확률이 높은 인형뽑기 게임");
			System.out.println("남아있는 코인 : " + coin + "\n1회뽑기 : 1 , 10회뽑기 : 2");
			int choice = sc.nextInt();
			if (choice == 1) {
				toy.reset();
				if (toy.prize(pro) instanceof LionDoll) {
					if (toy.prize(pro).stock < 1) {
						System.out.println("재고가 없습니다 코인을 환불합니다");
						coin++;
					}
					else {
						((LionDoll) toy.prize(pro)).sound();
						System.out.println("재고가" + toy.prize(pro).stock + "개 남았습니다");
					}
				} else if (toy.prize(pro) instanceof TeddyBear) {
					if (toy.prize(pro).stock < 1) {
						System.out.println("재고가 없습니다 코인을 환불합니다");
						coin++;
					}
					else {
						((TeddyBear) toy.prize(pro)).sound();
						System.out.println("재고가" + toy.prize(pro).stock + "개 남았습니다");
					}
				} else if (toy.prize(pro) instanceof Airpot) {
					if (toy.prize(pro).stock < 1) {
						System.out.println("재고가 없습니다 코인을 환불합니다");
						coin++;
					}
					else {
						((Airpot) toy.prize(pro)).sound();
						System.out.println("재고가" + toy.prize(pro).stock + "개 남았습니다");
					}
				} else if (toy.prize(pro) instanceof Fail) {
					((Fail) toy.prize(pro)).sound();
					System.out.println("다시 뽑아주세요!! ");
					coin--;
					continue;
				}
				coin--;
			} else if (choice == 2) {
				for (int i = 0; i < 10; i++) {
					toy.reset();
					if (toy.prize(pro) instanceof LionDoll) {
						if (toy.prize(pro).stock < 1) {
							System.out.println("재고가 없습니다 코인을 환불합니다");
							coin++;
						} else {
							((LionDoll) toy.prize(pro)).sound();
							System.out.println("재고가" + toy.prize(pro).stock + "개 남았습니다");
						}
					} else if (toy.prize(pro) instanceof TeddyBear) {
						if (toy.prize(pro).stock < 1) {
							System.out.println("재고가 없습니다 코인을 환불합니다");
							coin++;
						} else {
							((TeddyBear) toy.prize(pro)).sound();
							System.out.println("재고가" + toy.prize(pro).stock + "개 남았습니다");
						}
					} else if (toy.prize(pro) instanceof Airpot) {
						if (toy.prize(pro).stock < 1) {
							System.out.println("재고가 없습니다 코인을 환불합니다");
							coin++;
						} else {
							((Airpot) toy.prize(pro)).sound();
							System.out.println("재고가" + toy.prize(pro).stock + "개 남았습니다");
						}
					} else if (toy.prize(pro) instanceof Fail) {
						((Fail) toy.prize(pro)).sound();
						System.out.println("다시 뽑아주세요!! ");
						coin--;
						continue;
					}
					coin--;
				}
			} else {
				System.out.println("잘못입력하셨습니다 다시 입력해주세요.\n");
			}
		}
	}

}
