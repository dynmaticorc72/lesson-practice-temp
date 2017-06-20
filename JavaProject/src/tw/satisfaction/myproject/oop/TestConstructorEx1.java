package tw.satisfaction.myproject.oop;

public class TestConstructorEx1 {
	public TestConstructorEx1(String name) {
		System.out.println("hello " + name);
	}

	public static void main(String[] args) {
		TestConstructorEx1 constructor = new TestConstructorEx1("Mary");
		System.out.println("finished");

	}

}
