package tw.satisfaction.myproject.oop.enumerated;

enum GameType {
	RPG, AVG("Saya's Song"), SLG, FPS, CARD ;
	private String gameName = "Metal Gear";
	
	private GameType(){
		System.out.println("Game Name:" + gameName);
	}
	GameType(String gameName){
		this.gameName = gameName;
	}
	
	public void magic(){
		System.out.println("Fire Arrow and Ice Blade." + gameName);
	}
	
}

public class CallTestEnumeratedTypeEx2 {

	public static void main(String[] args) {
		GameType type  = GameType.AVG;
		type.magic();

	}

}
