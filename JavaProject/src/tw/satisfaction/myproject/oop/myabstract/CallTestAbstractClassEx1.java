package tw.satisfaction.myproject.oop.myabstract;

abstract class Company {
	public abstract void calFuel();

	public abstract void calDistance();

	public static void processTask(Company crop) {
		crop.calFuel();

		crop.calDistance();

		 if (crop instanceof Ship){
		 Ship warShip = (Ship)crop;
		 warShip.dive();
		 }
	}

}

class Truck extends Company {

	@Override
	public void calFuel() {
		System.out.println("Truck calculates Fuel.");

	}

	@Override
	public void calDistance() {
		System.out.println("Truck calculates Distance.");

	}

}

class Ship extends Company {

	@Override
	public void calFuel() {
		System.out.println("Ship calculates Fuel.");
	}

	@Override
	public void calDistance() {
		System.out.println("Ship calculates Fuel.");
	}

	public void dive() {
		System.out.println("Ship dives.");
	}

}

public class CallTestAbstractClassEx1 {

	public static void main(String[] args) {
		// Truck toyota = new Truck();
		// toyota.calFuel();
		// toyota.calFuel();
		// Truck mitsubishi = new Truck();
		// mitsubishi.calFuel();
		// mitsubishi.calDistance();

		// Company crop;
		// crop = new Truck();
		// crop.calFuel();
		// crop.calDistance();
		//
		// crop = new Ship();
		// crop.calFuel();
		// crop.calDistance();
		// if (crop instanceof Ship ){
		// Ship warShip = (Ship)crop;
		// warShip.dive();
		// }
		//
		Company.processTask(new Truck());
		Company.processTask(new Ship());

	}

}
