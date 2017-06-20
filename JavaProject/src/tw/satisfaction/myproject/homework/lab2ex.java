package tw.satisfaction.myproject.homework;

public class lab2ex {

	public static void main(String[] args) {
		int j = 1;
		while (j <= 9) {
			int i = 1;
			while (i <= 9) {
				if((i*j)<10){
					System.out.print(j + "X" + i + "= " + j * i + "\t");
					}else{
						System.out.print(j + "X" + i + "=" + j * i + "\t");
					}
				i++;
			}
			System.out.print("\n");
			j++;
		}

	}

}
