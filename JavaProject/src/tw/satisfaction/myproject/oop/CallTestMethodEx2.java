package tw.satisfaction.myproject.oop;

class calculator {
	public void plus(int x, int y) {
		System.out.println("x+y=" + (x + y));
	}

	public void minus(int x, int y) {
		System.out.println("x-y=" + (x - y));
	}
	public void cross(int x, int y){
		System.out.println("x*y=" + (x*y));
	}
}

public class CallTestMethodEx2 {

	public static void main(String[] args) {
		calculator casio = new calculator();
		casio.plus(4, 5);
		casio.minus(3, 4);
		casio.cross(4, 5);
		System.out.println("success");

	}

}
