package structure.ch06;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueUserIDSystem {

	private HashSet<String> userIDs;
	private Scanner sc;
	public UniqueUserIDSystem() {
		this.userIDs = new HashSet<String>();
	}
	// 사용자 ID 등록 기능
	// 정상적으로 들어가면 true
	// 중복 발생하면 false
	public boolean registerUserID(String userId) {
		return userIDs.add(userId);
	}
	// 시스템 실행
	public void run() {
		// 동작 - 스캐너 활용
		// 실행 흐름 만들기 --> while , if
		// 결과 -> 정상 유저 등로
		//      -> 이미 등록된 사용자 입니다.
		sc = new Scanner(System.in);
		while(true) {
		System.out.println("이름을 등록하십시오 : ");
		String id = sc.next();
		boolean isRegistered = registerUserID(id);
		if(isRegistered) {
			System.out.println("정상등록 완료 : " + id);
		} else {
			System.out.println("이미 등록된 사용자 입니다. : " + id);
		}
		}
	}
	
	public static void main(String[] args) {
		UniqueUserIDSystem system = new UniqueUserIDSystem();
		system.run();
		
	} // end of main
	
	
	
	
	
	
	
}
