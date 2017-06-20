package tw.satisfaction.myproject.oop.myinterface;


interface Flyer{
	public void takeoff();
	public void fly();
	public void land();
}

class Creature{
	public void eat(){
		System.out.println("Creature eats Food.");
	}
}

class AirPlane implements Flyer{

	@Override
	public void takeoff() {
		 System.out.println("AirPlane takes Off.");
	}

	@Override
	public void fly() {
		 System.out.println("AirPlane flies.");
	}

	@Override
	public void land() {
		 System.out.println("AirPlane lands.");
	}
	
}

class SuperMan extends Creature implements Flyer {

	@Override
	public void takeoff() {
		System.out.println("SuperMan takes off.");
	}

	@Override
	public void fly() {
		System.out.println("SuperMan flies.");
	}

	@Override
	public void land() {
		System.out.println("SuperMan lands");
	}
	
	@Override 
	public void eat(){
		System.out.println("Superman eats Steak and Meat.");
	}
	
	public void stopBullet(){
		System.out.println("Superman stops Bullets");
	}
}
public class CallTestInterfaceEx1 {

	public static void main(String[] args) {
		AirPlane plane = new AirPlane();
		plane.takeoff();
		plane.fly();
		plane.land();
		SuperMan clark = new SuperMan();
		clark.takeoff();
		clark.fly();
		clark.land();
		clark.eat();
		clark.stopBullet();
	}
}
