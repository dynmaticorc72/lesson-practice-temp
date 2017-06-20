package tw.satisfaction.myproject.homework;

import java.util.Scanner; 
public class lab1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入a:"); 
		int a = scanner.nextInt();
		System.out.print("請輸入b:"); 
		int b = scanner.nextInt();
		System.out.print("請輸入c:"); 
		int c = scanner.nextInt();
		
		 double p = b*b - 4*a*c;
		    
		    if(p>0) 
		    {
		      double s1 = Math.sqrt(p);
		      System.out.println("x = " + (-b+s1)/(2*a) + "或" + (-b-s1)/(2*a));
		    } 
		    else if(p==0)
		    {
		      double s2 = -b/2*a;
		      System.out.println("x = " + s2);  
		    }
		    else
		    {
		      System.out.println("x無實數解");  
		    }
		  }
		


	}


