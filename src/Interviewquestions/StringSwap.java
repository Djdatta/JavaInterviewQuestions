package Interviewquestions;

public class StringSwap {

public static void main(String[] args) {
	
	String a="Hello";
	String b="India";
	
	//append a and b

	a=a+b;	//HelloIndia
	System.out.println(a);
	
	//store intitial string a in b
	
	b=a.substring(0, a.length()-b.length());
	
	a=a.substring(b.length());
	
	System.out.println(a);
	System.out.println(b);
}	

	
}
