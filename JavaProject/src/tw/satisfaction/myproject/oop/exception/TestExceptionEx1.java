package tw.satisfaction.myproject.oop.exception;

public class TestExceptionEx1 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		try {
			for (int i = 0; i <= arr.length; i++) {
				System.out.println("[" + i + "]" + arr[i]);
			}
		} catch (ArithmeticException e) {
			System.out.println("hello");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("e:" + e);
			System.exit(-1);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("error");
		}finally{
			System.out.println("always Run here.");
		}

	}

}
