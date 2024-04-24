package exercise.toy;

import java.util.Random;

// 클래스 - 인형뽑기
// 상품들이 존재 가능
// 사자인형, 곰인형, 에어팟
// 요구 조건
// 배열을 활용해서 객체들을 담아 주세요
public class ToyMachine {
	Random random = new Random();
	int prize = random.nextInt(10);
	
	public Product prize(Product[] p) {
		return p[prize];
	}
	public void reset() {
		prize = random.nextInt(10);
	}
	
	
	
}
