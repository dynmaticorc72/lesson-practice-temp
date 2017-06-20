package tw.satisfaction.myproject.homework;

public class Lab_ArrayRandom {

	int[][] data = new int[42][2];

	public void random() {
		for (int u = 0; u < 42; u++) {
			data[u][0] = u + 1;
			// System.out.println(data[u][0]);
		}
		for (int i = 0; i < 100000; i++) {
			int x = (int) (Math.random() * 42 + 1);
			data[x - 1][1] = data[x - 1][1] + 1;
			// data[x - 1][1]++
			// System.out.println(data[x-1][1]);
		}
	}

	public void sort() {
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i][1] < data[j][1]) {
					int temp = data[i][1];
					data[i][1] = data[j][1];
					data[j][1] = temp;
					int temp2 = data[i][0];
					data[i][0] = data[j][0];
					data[j][0] = temp2;
				}
			}
		}
	}

	public void printResult() {
		this.random();
		System.out.println("Original Data:");
		System.out.println("----------------------");
		for (int j = 0; j < 42; j++) {
			System.out.println(data[j][0] + "\t" + data[j][1]);
		}
		System.out.println("----------------------");
		System.out.println("Sorted   Data:");
		System.out.println("----------------------");
		this.sort();
		for (int k = 0; k < data.length; k++) {
			System.out.println(data[k][0] + "\t" + data[k][1]);
		}

	}

	public static void main(String[] args) {

		Lab_ArrayRandom test = new Lab_ArrayRandom();
		test.printResult();
		test.sort();

	}

}
