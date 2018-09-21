package Interviewquestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Map;

public class DuplicateElement {

	public static void main(String[] args) {
		
		System.out.println("----------Using basic logic----");
		method1();	//basic time complexity is high On2
		System.out.println("--------------Using HashSet----");
		method2();	//Using Hashset it does not take duplicate element so when we try to enter it return false and we can catch this fasle count tc=On
		System.out.println("--------------Using HashMap----");
		method3();	//hashmap	O2n
	}
	
	
	public static void method1() {
		
		String names[]= {"Java", "c", "C++", "Java"};
		
		for (int i = 0; i < names.length; i++) {
			for (int j = i+1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("Duplicates element is::"+names[i]);
				}
			}
		}
		
	}
	public static void method2() {
		
		String names[]= {"Java", "c", "C++", "Java"};
		Set<String> store=new HashSet<>();
		for(String name:names) {
			
			if(store.add(name)==false)
				System.out.println("Duplicate Element::"+name);
		}
		
		
	}
	public static void method3() {
	
		
		String names[]= {"Java", "c", "C++", "Java"};
		Map<String, Integer> storeMap=new HashMap<>();
		for(String name:names) {
			Integer count=storeMap.get(name);
			if(count==null) {
				storeMap.put(name, 1);
			}else {
				storeMap.put(name, ++count);
			}
		}
		
		//Get teh values from this hashmap
		Set<Entry<String,Integer>> entrySet=storeMap.entrySet();
		
		for(Entry<String, Integer> entry: entrySet) {
		
			if(entry.getValue()>1)
				System.out.println("Duplicate value is::"+entry.getKey());
		}
		
	}
}
