package basic.ch21;

public class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("모니터가 따로있습니다");
	}
	@Override
	public void typing() {
		System.out.println("타이핑이 편합니다");
	}
	
}
