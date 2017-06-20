package tw.satisfaction.myproject.oop.nestedclass;

class C {
	public static String game = "chess game";

	static class D {
		public void play() {
			System.out.println("Play Game : " + game);
		}
	}
}

public class CallTestNestedClassEx2 {

	public static void main(String[] args) {
		C.D d1 = new C.D();
		d1.play();

	}

}
