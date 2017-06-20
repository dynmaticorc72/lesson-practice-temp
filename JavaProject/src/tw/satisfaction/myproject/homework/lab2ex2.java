package tw.satisfaction.myproject.homework;

public class lab2ex2 {

	public static void main(String[] args) {
		for(int j=1;j<=9;j++){
			for(int i=1;i<=9;i++){
				System.out.printf("%dX%d=%2d\t", i, j, i * j);
			}
			System.out.print("\n");
		}
		
	}

}
	/*	int j = 1;
		while (j <= 9) {
			int i = 1;
			while (i <= 9) {
				System.out.printf("%dX%d=%2d\t", i, j, i * j);
				i++;
			}
			System.out.print("\n");
			j++;
		}

	}
*/