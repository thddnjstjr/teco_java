package basic.ch18;

public class Computer {
	
	String name;
	int price;
	Cpu cpu;
	
	public Computer() {
		cpu = new Cpu();
		cpu.name = "AMD";
		cpu.price = 18000;
	}
	
	public void on() {
		cpu.booting();
		System.out.println("환영합니다");
	}
	
	public void off() {
		cpu.systemout();
		System.out.println("컴퓨터가 종료되었습니다.");
	}
}
