package tw.satisfaction.myproject.oop.exception;

public class TestAssertionsEx1 {

	public static void main(String[] args) {
		int a = 1, b = 0;

		assert (b != 0) : "b= " + b;

		System.out.println("a/b=" + (a / b));

	}

}
