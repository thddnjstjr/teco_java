package basic.ex13;

public class LottoGames {

	public static void main(String[] args) {
		int[] result = LottoNumberMaker.makeNumbers();
		for(int i =0; i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
}
