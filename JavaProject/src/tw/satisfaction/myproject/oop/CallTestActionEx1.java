package tw.satisfaction.myproject.oop;

class Person {
	String name = "Mery";

	public void sayHello() {
		System.out.println("Hi");
	}
	public void sayGoodBye(){
		System.out.println("bye");
	}

}

public class CallTestActionEx1 {

	public static void main(String[] args) {
		Person superMan = new Person();
		superMan.sayHello();
		superMan.sayGoodBye();
		System.out.println("Ok");
	}

}
