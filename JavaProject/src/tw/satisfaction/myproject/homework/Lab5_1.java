package tw.satisfaction.myproject.homework;

import java.util.Arrays;

public class Lab5_1 {
	
	int[] data = new int[100000];
	
	int [] a = new int[42] ;
	
	int [] countnum = new int [42];
	
	public void run42(){ 
		for (int i = 0; i < 100000; i++) {
			data[i] = (int) (Math.random() * 42) + 1;}
	}
	public void counter(){
		for(int i=0;i<a.length;i++){
		      int count = 0;
		      for(int j=0;j<data.length;j++){
		        if(data[j] == (i+1)){
		          count++;
		        }
		      }
		      countnum[i] = count;
		      //Arrays.sort(countnum);
		      System.out.println((i+1)+"=>"+ countnum[i]);
		    }
	}
	
	
	public static void main(String[] args) {
		Lab5_1 total = new Lab5_1();
		total.run42();
		total.counter();
	}

}
