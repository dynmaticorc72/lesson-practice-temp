package tw.satisfaction.myproject.oop.exception;

class MyOwnException extends Exception {

	private static final long serialVersionUID = 1L;
	private String server;
	private int port;
	private String msg;

	public MyOwnException(String server, int port, String msg) {
		this.server = server;
		this.port = port;
		this.msg = msg;
	}

	public void showMsg() {
		System.out.println("server:" + server);
		System.out.println("port:" + port);
		System.out.println("msg:" + msg);
	}
}

public class CallTestMyOwnExceptionEx1 {
	public static void main(String[] args) {
		int keycode = 001;
		if (keycode % 2 != 0) {
			try {
				throw new MyOwnException("Blade", 8080, "Virus Attacked");
			} catch (MyOwnException e) {
				// TODO Auto-generated catch block
				e.showMsg();
			}

		} else {
			System.out.println("Welcome, My Friend.");
		}
	}
}
