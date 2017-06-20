package tw.satisfaction.myproject.oop.encapsulation;

class AirCraft {
	private String Name = "Hug";
	private int Speed = 1000;
	
	public void setName(String Name){
		this.Name= Name ;
	}
	public String getName(){
		return Name ; 
	}
	public int getSpeed() {
		return Speed;
	}
	public void setSpeed(int speed) {
		Speed = speed;
	}
	
}

public class CallTestEncapsulationEx2 {
	
	public static void main(String[] args) {
		AirCraft F35 = new AirCraft();
		F35.setName("doggy"); 
		String name = F35.getName();

	}

}
