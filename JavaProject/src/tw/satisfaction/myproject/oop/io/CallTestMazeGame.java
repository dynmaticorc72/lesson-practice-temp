package tw.satisfaction.myproject.oop.io;

class MazeGame {
	private String[][] mapItem = { { "", "", "", "", "" }, { "", "", "Get a miracle bolt", "", "" },
			{ "", "magic spell", "", "", "" }, { "", "", "", "", "" }, { "", "", "", "", "" } };
	private int x = 0, y = 0;

	public void move(int x, int y) {
		synchronized (this) {
			this.x = x;
			this.y = y;
			System.out.print(" x : " + x + " " + " y : " + y + " ");
			System.out.println(mapItem[x][y]);
			this.notify();
		}
	}

	public void checkExit() {
		synchronized (this) {
			try {
				this.wait();
				if (x == 0 && y == 0) {
					System.out.println("I will Survive.");
					System.exit(-1);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Hero implements Runnable {

	private MazeGame core;

	public Hero(MazeGame core) {
		this.core = core;
	}

	@Override
	public void run() {
		while (true) {

			int x = (int) (Math.random() * 5);
			int y = (int) (Math.random() * 5);

			core.move(x, y);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MazeGameCheck implements Runnable {
	private MazeGame core;

	public MazeGameCheck(MazeGame core) {
		this.core = core;
	}

	@Override
	public void run() {
		while (true) {
			core.checkExit();
		}
	}

}

public class CallTestMazeGame {

	public static void main(String[] args) {
		MazeGame core = new MazeGame();
		Hero batMan = new Hero(core);
		Thread th1 = new Thread(batMan);
		th1.start();

		MazeGameCheck check = new MazeGameCheck(core);
		Thread th2 = new Thread(check);
		th2.start();
	}

}
