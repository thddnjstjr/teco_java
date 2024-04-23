package starcraft.ver02;

public class GateWay {

	private int gateWayNumber;
	private int count;
	
	// 기능 - 질럿 생산하는 기능을 만들어보자
	public GateWay(int gateWayNumber) {
		this.gateWayNumber = gateWayNumber;
		count = 0;
	}
	
	// 기능 - 질럿 생산하는 기능을 만들어 보세요
	public Zealot createZealot(String name) {
		count++;
		return new Zealot(name);
	}
	public int getCount() {
		return count;
	}
	public int getNumber() {
		return gateWayNumber;
	}
}
