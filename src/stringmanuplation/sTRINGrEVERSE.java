package stringmanuplation;

import java.util.Scanner;

public class sTRINGrEVERSE {

	public static void main(String[] args) {
		//reverseString();
		reverseString2();
		stringBufferTest();
		
	}
	
	public static void reverseString() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter---");
		String s=sc.next();
		
		System.out.println("String:: "+s);
		
		
		char c[]=s.toCharArray();
		
		System.out.println(c);
		
		System.out.println("Size of string: "+c.length);
		System.out.println("Reversed String is--");
		for (int i = c.length-1; i >= 0; i--) {
			System.out.print(c[i]);
		}
	}
	public static void reverseString2() {
	
		String s="Selenium";
		String rev="";
		for (int i = s.length()-1; i >=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
	
	public static void stringBufferTest() {
		StringBuffer sb=new StringBuffer("Selenium");
		System.out.println(sb.reverse());
	}
}
