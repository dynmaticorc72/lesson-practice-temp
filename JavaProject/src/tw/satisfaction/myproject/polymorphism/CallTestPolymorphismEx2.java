package tw.satisfaction.myproject.polymorphism;

public class CallTestPolymorphismEx2 {

	public void processActuion(mammal m) {
		m.eat();
		if (m instanceof cat) {
			cat c1 = (cat) m;
			c1.jumpaway();
		}
		if (m instanceof dog) {
			dog d1 = (dog) m;
			d1.biteball();
		}
	}

	public static void main(String[] args) {
		CallTestPolymorphismEx2 poly1 = new CallTestPolymorphismEx2();
		poly1.processActuion(new cat());
		poly1.processActuion(new dog());

	}

}
