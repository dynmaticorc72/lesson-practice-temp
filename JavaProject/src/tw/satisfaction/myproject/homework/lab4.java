package tw.satisfaction.myproject.homework;

public class lab4 {
	public static long fib(int x) {

		if (x <= 0) {
			return 0;
		} else if (x == 1 || x == 2) {
			return 1;
		} else {
			return fib(x - 1) + fib(x - 2);
		}
	}

	public static void main(String[] args) {

		for (int i = 0; i <= 47; i++) {
			System.out.println(fib(i));
		}

	}
	/*
	 * public static void forloop(int n) { int[] data = new int[n]; for (int i =
	 * 0; i < n; i++) { if (i == 0 || i == 1) { System.out.print(1 + " ");
	 * data[i] = 1; } else { System.out.print(data[i - 2] + data[i - 1] + " ");
	 * data[i] = data[i - 2] + data[i - 1]; } } }
	 */
}
