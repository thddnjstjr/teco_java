package basic.ex13;

public class LottoGame3 {

	public static void main(String[] args) {
		 
		
		int gameNumber1 = LottoNumberMaker.makeNumber();
		
		// 1 , 1 다시 처리 
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();
		LottoNumberMaker rerole = new LottoNumberMaker();
		boolean go = true;
		for(int a=0;a<=10;a++) {
		for(int b=0;b<=100;b++) {
			if(gameNumber1 == gameNumber2) {
				gameNumber2 = rerole.makeNumber();
				continue;
			}
			if(gameNumber2 == gameNumber3) {
				gameNumber3 = rerole.makeNumber();
				continue;
			}
			if(gameNumber3 == gameNumber4) {
				gameNumber4 = rerole.makeNumber();
				continue;
			}
			if(gameNumber4 == gameNumber5) {
				gameNumber5 = rerole.makeNumber();
				continue;
			}
			if(gameNumber5 == gameNumber6) {
				gameNumber6 = rerole.makeNumber();
				b--;
				continue;
			}
		}
		}
		
		int tempBox = 0;
		// 테스트 값 :  5, 1, 9, 7, 2, 3
		for(int pass = 1; pass <= 6; pass++) {
		if(gameNumber1 > gameNumber2) {
			tempBox = gameNumber1;
			gameNumber1 = gameNumber2;
			gameNumber2 = tempBox;
		}
		if(gameNumber2 > gameNumber3) {
			tempBox = gameNumber2;
			gameNumber2 = gameNumber3;
			gameNumber3 = tempBox;
		}
		if(gameNumber3 > gameNumber4) {
			tempBox = gameNumber3;
			gameNumber3 = gameNumber4;
			gameNumber4 = tempBox;
		}
		if(gameNumber4 > gameNumber5) {
			tempBox = gameNumber4;
			gameNumber4 = gameNumber5;
			gameNumber5 = tempBox;
		}
		if(gameNumber5 > gameNumber6) {
			tempBox = gameNumber5;
			gameNumber5 = gameNumber6;
			gameNumber6 = tempBox;
		}
		}		

	
		

		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2+ "\t");
		System.out.print(gameNumber3+ "\t");
		System.out.print(gameNumber4 + "\t");
		System.out.print(gameNumber5+ "\t");
		System.out.print(gameNumber6 + "\t");
		
		
	} // end of main 
}
