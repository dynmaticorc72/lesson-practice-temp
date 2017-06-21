package tw.satisfaction.myproject.oop.io;

class MyAutocClaseAble implements AutoCloseable{
	
	public void prosessResources(){
		System.out.println("Process Resources.");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Resources Closed.");
		
	}
	
}

public class CallTestAutoCloseableEx1 {

	public static void main(String[] args) {
		try(MyAutocClaseAble test1 =new MyAutocClaseAble()){
			test1.prosessResources();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
