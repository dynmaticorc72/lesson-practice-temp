package tw.satisfaction.myproject.flowcontrolloop;

public class TestDiceEx1 {

	public static void main(String[] args) {
		int batNumber = 6; int count = 1;
		while (true) {
			int Dicepot = (int) (Math.random() * 6) + 1;
			
			System.out.println("Dicepot= " + Dicepot);
			if (Dicepot == batNumber) {
				if (count == 2) {
					System.out.println("You Win !");
					break;
				}
				count++;
			} else {
				System.out.println("Try Again.");
			}

		}

	}

}

/*
 * int batNumber = 6; while (true) { int Dicepot = (int) (Math.random() * 6) +
 * 1; System.out.println("Dicepot= " + Dicepot);
 * 
 * if (Dicepot == batNumber) { System.out.println("You Win !"); break; } else {
 * System.out.println("Try Again."); }
 * 
 * }
 */