package interviewquestionsPractice;

import java.util.Scanner;

public class ReverseStringTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter string");
		String s=sc.nextLine();	//string on next line
		sc.next();	//string
		sc.nextInt();	//int
		System.out.println(sc.hasNext());
		sc.nextDouble();	//double
		System.out.println(sc);
		char a[]=s.toCharArray();
		
		System.out.println("Reverse string is::");
		for (int i = a.length-1; i >=0; i--) {
			
			System.out.print(a[i]);
		}
		
	}
}
