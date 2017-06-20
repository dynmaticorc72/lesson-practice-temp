package tw.satisfaction.myproject.oop.array;

public class Test2DimArrayEx1 {

	public static void main(String[] args) {
		int[][] data = { { 1, 2, 3 }, { 4, 5, 6, 9, 8 } };

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.printf("data[%d][%d] = %d\n", i, j, data[i][j]);
			}
		}

		for (int[] nums : data) {
			for (int value : nums) {
				System.out.println("value = " + value);

			}
		}

	}

}
