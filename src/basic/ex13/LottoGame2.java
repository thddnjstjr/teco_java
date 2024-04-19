package basic.ex13;

public class LottoGame2 {

	public static void main(String[] args) {
		// static 변수 --> 클래스 변수라고도 불린다.
		int one;
		int two;
		int	three;
		int four;
		int five;
		int six;
		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();
		
		
		// 전체 1~6 까지 나온 결과값을 오름 차순으로 정렬해보기
		
		// 반복문 사용 금지
		if(gameNumber1>gameNumber2) {
			two = gameNumber1;
			gameNumber1 = gameNumber2;
			gameNumber2 = two;
		} 
		if(gameNumber2>gameNumber3) {
			three = (gameNumber3>gameNumber2) ? gameNumber3 : gameNumber2;
			two = (gameNumber3>gameNumber2) ? gameNumber2 : gameNumber3;
			one = (gameNumber3>gameNumber1) ? gameNumber1 : gameNumber3;
			one = (two>one) ? one : two;
			two = (three>two) ? two : three;
			three = (three>one) ? three : one;
			gameNumber3 = three;
			gameNumber2 = two;
			gameNumber1 = one;
		}
		if(gameNumber3>gameNumber4) {
			four = (gameNumber4>gameNumber3) ? gameNumber4 : gameNumber3;
			three = (gameNumber4>gameNumber3) ? gameNumber3 : gameNumber4;
			two = (gameNumber4>gameNumber2) ? gameNumber2 : gameNumber4;
			one = (gameNumber4>gameNumber1) ? gameNumber1 : gameNumber4;
			one = (two>one) ? one : two;
			two = (three>two) ? two : three;
			three = (four>three) ? three : four;
			four = (four>one) ? four : one;
			gameNumber4 = four;
			gameNumber3 = three;
			gameNumber2 = two;
			gameNumber1 = one;
		}
		if(gameNumber4>gameNumber5) {
			five = (gameNumber5>gameNumber4) ? gameNumber5 : gameNumber4;
			four = (gameNumber5>gameNumber4) ? gameNumber4 : gameNumber5;
			three = (gameNumber5>gameNumber3) ? gameNumber3 : gameNumber5;
			two = (gameNumber5>gameNumber2) ? gameNumber2 : gameNumber5;
			one = (gameNumber5>gameNumber1) ? gameNumber1 : gameNumber5;
			one = (two>one) ? one : two;
			two = (three>two) ? two : three;
			three = (four>three) ? three : four;
			four = (four>five) ? four : five;
			five = (five>one) ? five : one;
			gameNumber5 = five;
			gameNumber4 = four;
			gameNumber3 = three;
			gameNumber2 = two;
			gameNumber1 = one;
		}
		if(gameNumber5>gameNumber6) {
			six = (gameNumber6>gameNumber5) ? gameNumber6 : gameNumber5;
			five = (gameNumber6>gameNumber5) ? gameNumber5 : gameNumber6;
			four = (gameNumber6>gameNumber4) ? gameNumber4 : gameNumber6;
			three = (gameNumber6>gameNumber3) ? gameNumber3 : gameNumber6;
			two = (gameNumber6>gameNumber2) ? gameNumber2 : gameNumber6;
			one = (gameNumber6>gameNumber1) ? gameNumber1 : gameNumber6;
			one = (two>one) ? one : two;
			two = (three>two) ? two : three;
			three = (four>three) ? three : four;
			four = (four>five) ? four : five;
			five = (five>six) ? five : six;
			six = (six>one) ? six : one;
			gameNumber6 = six;
			gameNumber5 = five;
			gameNumber4 = four;
			gameNumber3 = three;
			gameNumber2 = two;
			gameNumber1 = one;
		}
		
		
		System.out.print(gameNumber1 +  "\t");
		System.out.print(gameNumber2 +  "\t");
		System.out.print(gameNumber3 +  "\t");
		System.out.print(gameNumber4 +  "\t");
		System.out.print(gameNumber5 +  "\t");
		System.out.print(gameNumber6 +  "\t");
		
		
	} // end of main
	
	
}
