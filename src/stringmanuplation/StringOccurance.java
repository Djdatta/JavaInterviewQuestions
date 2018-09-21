package stringmanuplation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringOccurance {

	public static void main(String[] args) throws IOException {
		

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("ENter data---");
		
		String data=reader.readLine();
		
		int count=0;
		
		System.out.println("Searching for----");
		char ch=(char)System.in.read();
	
		for(int i=0; i<data.length();i++) {
			
			char c=data.charAt(i);
			if(c==ch) {
				count++;
			}
				
		}
		System.out.println(count);
		

	}
}
