package tw.satisfaction.myproject.polymorphism;

class mammal {
	public void eat() {
		System.out.println("I can eat something.");
	}
}

class cat extends mammal {

	public void eat() {
		System.out.println("Cat eats Fish and Rat.");
	}

	public void jumpaway() {
		System.out.println("Cat jumps Away.");
	}

}

class dog extends mammal {

	@Override
	public void eat() {
		System.out.println("Dog eats Bone.");
	}

	public void biteball() {
		System.out.println("Dog bites Ball.");
	}

}

public class CallTestPolymorphismEx1 {
	public static void main(String[] args) {
		// cat kitty = new cat();

		// kitty.eat();

		// mammal m = new mammal();
		// m = kitty ;
		
		//mammal m = new mammal();
		
		dog dog1 = new dog();

		mammal m1 = new cat();
		m1.eat();

		mammal m2 = new dog();
		m2.eat();
		
		//dog dd = (dog)m ;
		mammal m;
		m = new cat();
		m.eat();
		m = new dog();
		m.eat();
		
		mammal m3 = dog1;
		m3.eat();

	}

}
