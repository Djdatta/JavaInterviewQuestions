package Interviewquestions;

import java.util.ArrayList;

public class LargestLowest {

	public static void main(String[] args) {
		
		int numbersp[]= {0,1,2,3,5,55};
		int largest=numbersp[0];
		int smalest=numbersp[0];
		
		for (int i = 0; i < numbersp.length; i++) {
			if(numbersp[i]>largest) {
				largest=numbersp[i];
			}else if(numbersp[i]<smalest) {
				smalest=numbersp[i];
			}
				
		}
		System.out.println(largest);
		System.out.println(smalest);
		
	}
}
