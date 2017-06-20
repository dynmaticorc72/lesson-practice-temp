package tw.satisfaction.myproject.homework;

public class practice {

	int[][] arr42 = new int[42][2];

	public void run42() {
		for (int i = 0; i < 42; i++) {
			arr42[i][0] = i + 1;
		}
		for (int j = 0; j < 100000; j++) {
			int x = (int) (Math.random() * 42 + 1);
			arr42[x - 1][1] = arr42[x - 1][1] + 1;
		}
	}

	public void sort() {
		for (int k = 0; k < arr42.length; k++) {
			for (int l = k + 1; l < arr42.length; l++) {
				int temp1;
				int temp2;
				if (arr42[k][1] < arr42[l][1]) {
					temp1 = arr42[k][1];
					arr42[k][1] = arr42[l][1];
					arr42[l][1] = temp1;
					temp2 = arr42[k][0];
					arr42[k][0] = arr42[l][0];
					arr42[l][0] = temp2;
				}
			}
		}
	}

	public void result() {
		run42();
		System.out.println("    Original | Data");
		System.out.println("-----------------------");
		for (int i = 1; i <= arr42.length; i++) {
			System.out.print("\t" + arr42[i - 1][0] + "\t" + arr42[i - 1][1]);
			if (i % 7 == 0) {
				System.out.println();
			}
		}

		/*
		 * for(int j=0;j<6;j++){ for (int i = 1+7*j ; i <= 7+7*j ; i++) {
		 * System.out.print("\t" + arr42[i-1][0] + "\t" + arr42[i-1][1] ); }
		 * System.out.println(); }
		 */

		System.out.println("-----------------------");
		System.out.println("      Sorted | Data");
		System.out.println("-----------------------");
		this.sort();
		for (int i = 0; i < arr42.length; i++) {
			System.out.println("\t" + arr42[i][0] + "\t" + arr42[i][1]);
		}

	}

	public static void main(String[] args) {
		practice test1 = new practice();
		test1.result();
	}
}
