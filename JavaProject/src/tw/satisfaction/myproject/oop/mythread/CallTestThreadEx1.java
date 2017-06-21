package tw.satisfaction.myproject.oop.mythread;

class MyProcessAction implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " i = " + i);
			
			//System.out.print(Thread.currentThread().getName() + " ");
			//System.out.println("i=" + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class CallTestThreadEx1 {

	public static void main(String[] args) {
		MyProcessAction proc1 = new MyProcessAction();
		Thread th1 = new Thread(proc1,"white");
		Thread th2 = new Thread(proc1,"black");

		th1.start();
		th2.start();
		
		try {
			th1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("finished");
	}

}
