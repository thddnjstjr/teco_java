package exercise;

import java.util.Scanner;

public class IfExercise {

	// 코드의 시작점
	public static void main(String[] args) {

		// 정수값 입력 받기 활용해서 코드의 흐름을 만들어 주세요.

		System.out.println("성적을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt(); // 정수 입력받기
		System.out.println("로깅 - 받은 값 확인: " + point);
		// 조건문을 완성하세요

		if (point <= 59) {
			System.out.println("F학점입니다");
		} else if (point < 70) {
			System.out.println("D학점입니다");
		} else if (point < 80) {
			System.out.println("C학점입니다");
		} else if (point < 90) {
			System.out.println("B학점입니다");
		} else
			System.out.println("A학점입니다");

		// 연습문제 2
		char grade = 'X';
		String message = "잘못된 입력입니다. 성적은 0에서 100사이로 입력해주세요.";
		// String a

		if (point < 0 || point > 100) {
			System.out.println(message);
		} else if (point >= 90 && point <= 100) {
			grade = 'A';
			message = "우수한 성적이네요! 계속 좋은 성적 유지하시길 바랍니다.";
			System.out.println(grade + "학점: " + message);
		} else if (point >= 80 && point < 90) {
			grade = 'B';
			message = "좋은 성적입니다.조금만 더 노력하면 A도 가능해요!";
			System.out.println(grade + "학점: " + message);
		} else if (point >= 70 && point < 80) {
			grade = 'C';
			message = " 괜찬은 성적이지만, 더 높은 등급을 위해 노력해봅시다";
			System.out.println(grade + "학점: " + message);
		} else if (point >= 60 && point < 70) {
			grade = 'D';
			message = " 학습에 더 집중할 필요가 있어요.도움이 필요하면 말해주세요";
			System.out.println(grade + "학점: " + message);
		} else {
			grade = 'F';
			message = " 불합격입니다.부족한 부분을 파악하고,추가 학습이 필요해요.";
			System.out.println(grade + "학점: " + message);
		}

		sc.close();

	} // end of main

} // end of class
