package tw.satisfaction.myproject.oop;

class Human {
	String name = "Mike";

	public void sayHello() {
		System.out.println("Hi");
		sayGoodBye();
	}
	public void sayGoodBye(){
		System.out.println("bye");
	}

}

public class CallTestActionEx2 {

	public static void main(String[] args) {
		Human superMan = new Human();
		superMan.sayHello();
		superMan.sayGoodBye();
		System.out.println("Ok");
	}

}
