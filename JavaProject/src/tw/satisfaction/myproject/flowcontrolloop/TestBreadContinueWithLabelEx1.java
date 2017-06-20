package tw.satisfaction.myproject.flowcontrolloop;

public class TestBreadContinueWithLabelEx1 {

	public static void main(String[] args) {
		action:
			for(int i=1;i<=3;i++){
				for(int j=1;j<=5;j++){
					if(i==2 && j==3){
						break action;
					}System.out.printf("i=%d j=%d\n",i,j);
				}
				
			}

	}

}
