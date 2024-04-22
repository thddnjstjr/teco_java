package exercise;

public class PhoneNumberList {

	private String name;
	private String number;
	private static int max = 0;

	public PhoneNumberList(String name, String number) {
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public static int getMax() {
		return max;
	}


}
