package tw.satisfaction.myproject.oop;

class Market{
	public void buy(int money){
		System.out.println("buys something spend:" + money);
	}
}

public class CallTestMethodEx1 {

	public static void main(String[] args) {
		Market superMarket = new Market();
		superMarket.buy(100);
		System.out.println("Go Home.");
	}

}
