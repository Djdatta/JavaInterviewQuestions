package interviewquestionsPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class RawClass {

	public static void main(String[] args) {
		//listSetmap();
		duplicatetest();
		duplicatetest1();
		largestValue();
		swap();
		removeJunk();
		
	
	}
	
	public static void removeJunk() {
		
		String s="##@@@ Hello India";
		
		String s1=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
	}
	
	public static void swap() {
		
		int x=10;
		int y=20;
		
		System.out.println("Before : "+x+" "+y);
		int temp;
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After : "+x+" "+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("Using + After : "+x+" "+y);
		x=x*y;
		y=x/y;
		x=x/y;
		
		System.out.println("Using * After : "+x+" "+y);
		
	}
	public static void duplicatetest() {
		
		String s[]= {"java","C","CPP","java"};
		
		for (int i = 0; i < s.length; i++) {
			
			for (int j = i+1; j < s.length; j++) {
				
				if(s[i].equals(s[j]))
					System.out.println("Duplicate element is::"+s[i]);
			}
			
		}
		
	}
	
	public static void duplicatetest1() {
		
		String s[]= {"java","C","CPP","java"};
		
		Set set=new HashSet<>();
		
		for(String name:s) {
			
			if(set.add(name)==false)
				System.out.println("Duplicate element is::"+name);
			
		}
		
	}
	
	public static void duplicatetest2() {
		
		String s[]= {"java","C","CPP","java"};
		
	}

	
	public static void largestValue() {
		
		int a[]= {1,2,3,4,5,6,7,55};
		
		int smallestElement=a[0];
		int largestElement=a[0];
	
		for (int i = 0; i < a.length; i++) {
			
			if(smallestElement>a[i])
				smallestElement=a[i];
			else if(largestElement<a[i])
				largestElement=a[i];
		}
		
		System.out.println(largestElement+" <--is largest element");
		System.out.println(smallestElement+" <--is smalest element");
	}
	public static void listSetmap() {
		List list=new ArrayList<>();
		
		list.add("Hello");
		list.add("world");
		list.add("world");
		list.add(11);
		System.out.println(list);	//Allow duplicates
		
		System.out.println(list.indexOf("Hello"));
		System.out.println(list.indexOf(11));	//2 so it follow sequence
		
		
		System.out.println("SET");
		Set set=new HashSet<>();
		
		set.add(12);
		set.add("Hello");
		set.add("world");
		System.out.println(set.add("Hello"));	//return false it will help to find duplicate element
		
		
		System.out.println(set);	//Set Not allow duplicate
		
//		System.out.println(set.indexOf(12));	// Give error because not follow sequence
		
		
		System.out.println("_____Trrset.....");
		Set s1=new TreeSet<>();
		//s1.add(12);		//error can't covert integer to string in treeset
		s1.add("hello");
		s1.add("india");
		System.out.println(s1.add("hello"));//return false it will help to find duplicate element
		
		System.out.println(s1.contains("hello"));
		
		System.out.println(s1);
		
		System.out.println("_____________Hashmap________________");
		Map m=new HashMap<>();
		
		m.put(1, "datta");
		m.put(2, "as");
		m.put(3, "ds");
		m.put(4, "fd");
		
		System.out.println(m);	//duplicate not allowed
		System.out.println(m.get(2));
		System.out.println(m.remove(1));
		System.out.println(m);
		System.out.println(m.containsKey(2));
		m.replace(2, "jadhav");
		System.out.println(m);
	
	
	}
	
}
