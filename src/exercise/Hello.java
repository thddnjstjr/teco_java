package exercise;

public class Hello {

	static void greet(String name) {
		System.out.println("안녕하세요 , " + name + "님!");

	}

	static int square(int x) {
		int result;
		result = x * x;
		return result;
	}

	static boolean checkAdult(int age) {
		boolean sum1;
		sum1 = age >= 18;
		return sum1;
	}

	static String signOfNumber(int num) {
		String a = "positive";
		String b = "negative";
		String c = "zero";
		if (num < 0) {
			return b;
		} else if (num == 0) {
			return c;
		} else {
			return a;
		}

	}

	static int findMax(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else  {
			return num2;
		}
	}

	

	public static void main(String[] args) {
		greet("송원석");
		System.out.println(square(3));
		System.out.println(checkAdult(17));
		System.out.println(signOfNumber(-1));
		System.out.println(findMax(5,1));
	}
}
