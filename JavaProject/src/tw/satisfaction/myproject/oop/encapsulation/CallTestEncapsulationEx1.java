package tw.satisfaction.myproject.oop.encapsulation;

class Elevator{
	private int level = 2;
	public String message = "Welcome";
	
}

public class CallTestEncapsulationEx1 {

	public static void main(String[] args) {
		Elevator iiiElevator = new Elevator();
		//System.out.println("level:" + iiiElevator.level); //compile error
		System.out.println("Message:" + iiiElevator.message);
	}

}
