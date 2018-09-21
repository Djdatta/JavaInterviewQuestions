package Interviewquestions;

public class ReverseInteger {

	public static void main(String[] args) {
		
		//1. Using proper algo
		int num=12345;
		
		int rev=0;
		
		while(num!=0) {
			rev=rev*10 + num%10;	//5
			num=num/10;	//1234
		}
		System.out.println("Reverse num is: "+rev);
		
		//2. Using string buffer
		
		long num1=123456;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

	}

}
