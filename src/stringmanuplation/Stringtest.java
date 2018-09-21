package stringmanuplation;

import java.util.Hashtable;

public class Stringtest {

	
	public final strictfp synchronized static void main(String[] args) {
	
	//We can write this type of main method	
		m1();
				
		}
	
	public static void m1() {
		
		String s="asasasasA";
		int count=0;
		char search='a';
		
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			
			if(ch==search)
				count++;
					
		}
		System.out.println(count);
		
		
		
	}
	
	public static void m2() {
		
	}
	
}
