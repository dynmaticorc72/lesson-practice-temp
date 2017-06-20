package tw.satisfaction.myproject.oop;

class car {
	public static void speedUp() {
		System.out.println("faster");
	}

	public void slowDown() {
		System.out.println("slower");
	}
}

public class TestStaticEx1 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		car.speedUp();

		car toyota = new car();
		toyota.slowDown();
		toyota.speedUp();

	}

}
