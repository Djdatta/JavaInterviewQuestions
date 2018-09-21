package Interviewquestions;

public class SwapTest {

	public static void main(String[] args) {
		
		int x=5; int y=10;
		System.out.println("before swap x::"+x+" y::"+y);
		int temp=x;
		x=y;
		y=temp;
		
		System.out.println("x:: "+x);
		System.out.println("y:: "+y);
		
		//Using + operator
		
		x=x+y;		//15
		y=x-y;		//15-10=5
		x=x-y;		//15-5=10
		
		System.out.println("X:"+x+"   y::"+y);
		
		//Using *
		x=x*y;
		y=x/y;
		x=x/y;
		
		System.out.println("X:"+x+"   y::"+y);
		
		//Using XOR
		
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("X:"+x+"   y::"+y);
		
	}
}
