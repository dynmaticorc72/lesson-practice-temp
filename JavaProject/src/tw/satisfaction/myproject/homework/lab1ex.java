package tw.satisfaction.myproject.homework;

import java.util.Scanner; 
public class lab1ex {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);  //使用Scanner類別取得使用者的輸入 
		double c, f;  //c為儲存所輸入的華氏，g為攝氏 
		
		System.out.print("請輸入index:"); 
		int index = scanner.nextInt();

		if(index==1){
			System.out.print("請輸入攝氏溫度:"); 
		    c = scanner.nextDouble();
			double a = c*9/5.0+32; 
			System.out.println("華氏" +a ); 
			
		}
		else if(index==2){
			System.out.print("請輸入華氏溫度:"); 
			f = scanner.nextDouble();
			double b =( f - 32)*5/9.0;
			System.out.println("攝氏" +b ); 
		}
		else{
			System.out.println("error" ); 
		}

	}

}
