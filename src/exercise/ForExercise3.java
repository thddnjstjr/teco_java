package exercise;

public class ForExercise3 {

	public static void main(String[] args) {
		int a;
		int b;
		for (a = 1; a < 5; a++) {
			for (b = 0; b < a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------------------------");

		for (a = 1; a < 10; a = a + 2) {
			for (b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------------------------");

		for (a = 1; a < 5; a++) {
			for (b = 4; b >= a; b--) {
				System.out.print("*");
			}
			System.out.println();
				
			}
		}
	}
      
}
