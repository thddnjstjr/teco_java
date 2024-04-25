package basic.ch22;

public abstract class Calculator implements Calc{
	
	public double divide(double n1, double n2) {
		if(n1 == 0 || n2 == 0) {
			System.out.println("0으로 나눌수 없습니다");
			return 0.0;
			} 
			return n1 / n2;
	}
	
	
	
}
