package tw.satisfaction.myproject.oop;

class Safe {

	private String name = "jack";
	private String pwd = "999";

	public boolean verify(String username, String password) {
		if (username.equals(name) && password.equals(password)) {
			return true;
		}
		return false;

	}

}

public class CallTestAuthorizedEx1 {
	public static void main(String[] args) {
		Safe test123 = new Safe();
		boolean result = test123.verify("mary", "123123");
		System.out.println("result:" + result);
	}

}
