package tw.satisfaction.myproject.flowcontrolloop;

public class TestWhileLoopEx2 {

	public static void main(String[] args) {
		int i = 1, sum = 0;
		while (i <= 1000) {
			sum = sum + i;
			i++;
		}
		System.out.println("sum= " + sum);

	}

}
