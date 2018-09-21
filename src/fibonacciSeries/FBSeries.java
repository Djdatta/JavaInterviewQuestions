package fibonacciSeries;

import java.util.Scanner;

public class FBSeries {

	
	public void fbseries() {
		Scanner sc=new Scanner(System.in);
		int num1=0; int num2=1; int num3;
		System.out.println("Enter nos");
		int num=sc.nextInt();
		System.out.println(num1+" "+num2);
		for(int i=2;i<num;++i) {
			
			num3=num1+num2;
			System.out.println(" "+num3);
			
			num1=num2;
			num2=num3;
		}
		sc.close();
		
	}
	public static void main(String[] args) {
		
		FBSeries fb=new FBSeries();
		
		fb.fbseries();
		
	}
}
