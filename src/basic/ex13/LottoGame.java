package basic.ex13;

public class LottoGame {

	public static void main(String[] args) {
		// static 변수 --> 클래스 변수라고도 불린다.
		int emptyBox;
		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();
		
		System.out.print(gameNumber1 +  "\t");
		System.out.print(gameNumber2 +  "\t");
		System.out.print(gameNumber3 +  "\t");
		System.out.print(gameNumber4 +  "\t");
		System.out.print(gameNumber5 +  "\t");
		System.out.print(gameNumber6 +  "\t");
		
		// 오름 차순으로 정렬해보기
		
		if(gameNumber1<gameNumber2) {
			if(gameNumber1<gameNumber3) {
				if(gameNumber1<gameNumber4) {
					if(gameNumber1<gameNumber5) {
						System.out.println((gameNumber1<gameNumber6) ? gameNumber1 : gameNumber6);
					}
				}
			}
		}
		System.out.print(gameNumber1 +  "\t");
		System.out.print(gameNumber2 +  "\t");
		
		
	} // end of main
	
	
}
