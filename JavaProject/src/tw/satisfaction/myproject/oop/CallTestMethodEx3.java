package tw.satisfaction.myproject.oop;
class action {
	public int f(int x){
		int value = 2*x+1;
			return value;
	}
	
}
public class CallTestMethodEx3 {

	public static void main(String[] args) {
		action calvalue = new action();
		int num = calvalue.f(6);
		System.out.println("num= " + num);

	}

}
