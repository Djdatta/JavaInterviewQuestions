package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		int a[]=new int[3];			//Static array--size is fixed
		
		//so we use collection that arraylist
		/*Can caontains duplicate values/element
		 * Maintain insertion order
		 * Sysnchronized
		 * Allow random acces to fetch element bcoz it store values on basis of index
		 * 
		 * */
		ArrayList ar=new ArrayList<>();
		
		ar.add(10);
		ar.add(10);
		ar.add(40);
		ar.add(20);
		ar.add(30);
		ar.add(0, "Hello");
		ar.add("String");
		System.out.println(ar);
		
		ar.add(10);
		ar.add(50);
		ar.add(60);
		System.out.println(ar);
		System.out.println(ar.size());	
		System.out.println(ar.get(3));   //3rd index value
		
		for (Iterator iterator = ar.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.print(object+", ");
		}
		
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		Iterator itr=ar.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next()+", ");
		}
	}
	
}
