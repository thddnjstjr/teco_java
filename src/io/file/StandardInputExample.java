package io.file;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 문자 기반 스트림 + 보조 문자 기반 스트림 확인
// 한줄 입력 하면 종료 됨
// 여러줄 반복적으로 동작할 수 있도록 기능을 추가해주세요
public class StandardInputExample {

	public static void main(String[] args) {
		
		// 문자 기반 스트림 + 보조 문자 기반 스트림을 사용 한다. !!
		
		try(InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr)) {
			
			// isr -> 한 문자씩 읽는 기능 read() 가지고 있었다.
			// br -> 한번에 한 라인씩 읽을 수 있는 기능을 가지고 있다.
			System.out.println("더 많은 텍스트를 입력 하세요 (한줄 단위) -> 엔터");
			
			// isr.read(); --> 기능 확장인
			String inputUserData = br.readLine();
			System.out.println("입력 확인 : " + inputUserData);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
