package tw.satisfaction.myproject.oop.nestedclass;

class E {
	private String career = "Idol";
	private String Name = "Lala";

	public void showInfo() {
		System.out.println("It's a nice day.");
	}

	public void processLocalNested() {
		class F {
			public void run() {
				int age = 11;
				System.out.println(career + " " + Name + " age:" + age);
				showInfo();
			}
		}
		F f1 = new F();
		f1.run();
	}

}

public class CallTestNestedClassEx3 {

	public static void main(String[] args) {
		E e1 = new E();
		e1.processLocalNested();

	}

}
