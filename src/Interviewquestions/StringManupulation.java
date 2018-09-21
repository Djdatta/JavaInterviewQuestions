package Interviewquestions;

public class StringManupulation {

	public static void main(String[] args) {
		
		String s="Hello how are you";
		String s1="Hello HOW are you";
		System.out.println("Size of string::"+s.length());
		System.out.println("Char at::"+s.charAt(1));
		System.out.println("Index of::"+s.indexOf('o'));
		System.out.println("Specific index::"+s.indexOf('o',6));
		System.out.println(s.indexOf('o', s.indexOf('o')+1));  	//2nd occurance
		System.out.println(s.indexOf("Hello"));
		
		//comparision:
		System.out.println(s.equals(s1));
		
		System.out.println(s.equalsIgnoreCase(s1));
		
		//substring
		
		System.out.println(s.substring(0, 5));
		
		//trim--remove space
		String s2="   Hello World    ";		//it remove before and after space--not inbetween
		System.out.println(s2.trim());
		
		System.out.println(s2.replace(" ", ""));	//remove all spaces
		
		String date="12/12/2018";
		System.out.println(date.replace("/", "-"));
		
		//split
		
		String s4="Hello_world_how_are_you";
		
		String arr[]=s4.split("_");
		
		System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
		}
		System.out.println();
		String s5="datta";
		System.out.println(s5.concat("tray"));
		//left to write execution:::
		String x="Hello";
		String y="world";
		int n=100;
		int m=200;
		System.out.println(x+y);
		System.out.println(n+m);
		System.out.println(n+m+x);
		System.out.println(n+m+x+y);
		System.out.println((n+m)+x+y);
		System.out.println(x+y+n+m);  //HelloWorld100200
		
	}
	
}
