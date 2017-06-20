package tw.satisfaction.myproject.flowcontrol;

public class TestNestedIfEx1 {

	public static void main(String[] args) {
		int num = 7;
		if(num>=0){
			System.out.println("Positive");
			if(num%2==0){
				System.out.println(num + " is even");
			}
			else{
				System.out.println(num + " is odd");
			}
		}
		else{
			System.out.println("Negative");
			if(num%2==0){
				System.out.println(num + " is even");
			}
			else{
				System.out.println(num + " is odd");
			}
		}

	}

}
