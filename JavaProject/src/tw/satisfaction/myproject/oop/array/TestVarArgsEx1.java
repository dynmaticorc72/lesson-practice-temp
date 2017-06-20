package tw.satisfaction.myproject.oop.array;

public class TestVarArgsEx1 {
	
	public void plus (int...data){
		int x = 0 ;
		for (int i=0 ; i<data.length;i++){
			x = x+data[i];
		}
		System.out.println("total:" + x);
	}

	public static void main(String[] args) {
		TestVarArgsEx1 varArgs = new TestVarArgsEx1();
		varArgs.plus(1,2,3,4,5,6,7,8,9,10);
		
		int[] values = {10, 20, 30, 40 ,50};
		varArgs.plus(values);

	}

}
