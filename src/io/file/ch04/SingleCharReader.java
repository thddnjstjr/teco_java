package io.file.ch04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SingleCharReader {

	public static void main(String[] args) {
		
		// 문자 기반에 InputStreamReader 사용 방법
		// ** 중요 **
		// InputStreamReader 는 한 바이트씩 데이터를 읽는 것이 아니라
		// 하나의 문자 단위로 읽음 !!!
		
		System.out.println("문자 하나를 입력 하세요");
		
		// try catch resource
		try (InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr)){
			
		String charData = br.readLine(); // 사용자가 키보드에 값을 입력할 때 까지 대기
		
		if(charData != null) {
			// -1 --> 파일 끝 (EOF) 가 아니라면 출력 ... 
			// char --> 2byte (한글은 2byte로 거의 모든 글자 표현이 가능하다)
			System.out.println("사용자가 입력한 값 : " + charData);
		}
			
		} catch (Exception e) {
			System.out.println("뭔가 잘못 되었습니다.");
			e.printStackTrace();
		}
		
	} // end of main
	
}
