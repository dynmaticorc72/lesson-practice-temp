package tw.satisfaction.myproject.flowcontrol;

public class TestIfElseEx1 {

	public static void main(String[] args) {
		
		int YourLuckyNumber = 6;
		int DiceNumber = (int)(Math.random()*6+1);
		
		System.out.println("DiceNumber=" + DiceNumber);
		if(YourLuckyNumber == DiceNumber){
			System.out.println("You Win.");
		}
		else{
			System.out.println("Try Again");
		}
		System.out.println("Finished");

	}

}
