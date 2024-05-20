package io.file;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 문자 기반 스트림 + 보조 문자 기반 스트림 확인
// 한줄 입력 하면 종료 됨
// 여러줄 반복적으로 동작할 수 있도록 기능을 추가해주세요
public class StandardInputExample2 {

	public static void main(String[] args) {
		
		// 데이터를 통으로 관리 하고 싶다면 --> 자료구조 --> 적절한 자료 구조를 선택
		List<String> lines = new ArrayList<String>();
		
		System.out.println("여러줄을 입력하세요");
		System.out.println("입력하지않으면 종료됩니다");
		// 문자 기반 스트림 + 보조 문자 기반 스트림을 사용 한다. !!
		try(InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr)) {
			
			// isr -> 한 문자씩 읽는 기능 read() 가지고 있었다.
			// br -> 한번에 한 라인씩 읽을 수 있는 기능을 가지고 있다.
			String inputUserData;
			while((inputUserData = br.readLine()) != null && !inputUserData.isEmpty()) {
				
			lines.add(inputUserData);
			// System.out.println("입력 확인 : " + inputUserData);
			}
			
			for (String data : lines) {
				System.out.println(data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
