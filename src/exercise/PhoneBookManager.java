package exercise;

import java.util.Scanner;

public class PhoneBookManager {

	public static void main(String[] args) {
		PhoneNumberList[] pb = new PhoneNumberList[100];
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			for (int i = 0; i < pb.length; i++) {
				System.out.println("1.저장하기 2.조회하기 3.수정하기 4.삭제하기 5.선택조회 6.종료");
				String choice = sc.nextLine();
				if (choice.equals("1")) {
					if (PhoneNumberList.getMax() >= 100) {
						System.out.println("전화번호부가 가득찼습니다.");
						break;
					}
					System.out.println("이름을 입력해주세요");
					String name = sc.nextLine();
					System.out.println("번호를 입력해주세요");
					String number = sc.nextLine();
					save(name, number, pb);
					System.out.println("저장이 완료 되었습니다.");
				} else if (choice.equals("2")) {
					read(pb);
				} else if (choice.equals("3")) {
					System.out.println("수정을 원하시는 이름이나 전화번호를 입력해주세요");
					String newname = sc.nextLine();
					fix(newname, sc, pb);
				} else if (choice.equals("4")) {
					deleted(sc, pb);
				} else if (choice.equals("5")) {
					selected(sc, pb);
				} else if (choice.equals("6")) {
					System.out.println("시스템을 종료합니다");
					break;
				} else {
					System.out.println("다시 선택해주세요");
				}
			}
		}

	} // end of main
	public static void save(String name, String number, PhoneNumberList[] pb) {
		PhoneNumberList newpb = new PhoneNumberList(name, number);

		for (int i = 0; i < pb.length; i++) {
			if (pb[i] == null) {
				pb[i] = newpb;
				break;
			}
		}
	}

	public static void read(PhoneNumberList[] pb) {
		for (int i = 0; i < pb.length; i++) {
			if (pb[i] != null) {
				System.out.println(pb[i].getName());
				System.out.println(pb[i].getNumber());
			}
		}
	}

	public static void fix(String name, Scanner sc, PhoneNumberList[] pb) {
		boolean flag = true;
		for (int i = 0; i < pb.length; i++)
			if(pb[i] != null) {
			if (name.equals(pb[i].getName())) {
				System.out.println("바꾸실 이름을 입력해주세요");
				String newname = sc.nextLine();
				System.out.println("바꾸실 전화번호를 입력해주세요");
				String number = sc.nextLine();
				pb[i].setName(newname);
				pb[i].setNumber(number);
				System.out.println("수정되었습니다");
				flag = false;
				break;
			} else if (name.equals(pb[i].getNumber())) {
				System.out.println("바꾸실 이름을 입력해주세요");
				String newname = sc.nextLine();
				System.out.println("바꾸실 전화번호를 입력해주세요");
				String number = sc.nextLine();
				pb[i].setName(newname);
				pb[i].setNumber(number);
				System.out.println("수정되었습니다");
				flag = false;
				break;
			}
			} if(flag == true) {
		System.out.println("해당하는 이름이 없습니다.");
			}
	}

	public static void deleted(Scanner sc, PhoneNumberList[] pb) {
		boolean flag = true;
		System.out.println("삭제하실 전화번호나 이름을 입력해주세요");
		String delname = sc.nextLine();
		for (int i = 0; i < pb.length; i++) {
			if(pb[i] != null) {
			if (delname.equals(pb[i].getName())) {
				pb[i] = null;
				System.out.println("삭제되었습니다");
				flag = false;
				break;
			} else if (delname.equals(pb[i].getNumber())) {
				pb[i] = null;
				System.out.println("삭제되었습니다");
				flag = false;
				break;
			} 
			}
			}if(flag == true) {
		System.out.println("해당하는 이름이 없습니다.");
		}
	}
	


	public static void selected(Scanner sc, PhoneNumberList[] pb) {
		boolean flag = true;
		System.out.println("찾으시는 이름이나 전화번호를 입력해주세요");
		String search = sc.nextLine();
		for (int i = 0; i < pb.length; i++) {
			if(pb[i] != null) {
			if (search.equals(pb[i].getName())) {
				System.out.println(pb[i].getName());
				System.out.println(pb[i].getNumber());
				flag = false;
				break;
			} 
			}
		}
			if(flag == true) {
				System.out.println("해당하는 이름이 없습니다.");
			}
	
	}
} // end of class
