package tw.satisfaction.myproject.homework;

/*
 public void numberSort(){ Arrays.sort(); }
 */

/*class RandomArray {
	
	
	}
}	*/

	

public class Lab5 {

	public static void main(String[] args) {
		int[] data = new int[100];
		for (int i = 0; i <= 99; i++) {
		data[i] = (int) (Math.random() * 42) + 1;}
		
		int [] a = new int[42] ;
		int [] countnum = new int [42];
		
		for(int i=0;i<a.length;i++){
		      int count = 0;
		      for(int j=0;j<data.length;j++){
		        if(data[j] == (i+1)){
		          count++;
		        }
		      }
		      countnum[i] = count;
		      System.out.println((i+1)+"=>"+count +" 陣列  " + countnum[i]);
		    }
		
	}
}
