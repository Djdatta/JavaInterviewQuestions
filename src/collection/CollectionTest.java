package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTest {

	public static void main(String[] args) {
		Collection<Integer> c=new ArrayList<>();
		c.add(1);
		c.add(2);
		c.add(5);
		c.add(5);
		
		c.forEach(System.out::println);		//it also print output
		System.out.println(c);	//allow duplicate
		
		System.out.println("Size of al--"+c.size());
		
		List<Integer> l=new ArrayList<>();
		l.add(2);
		l.add(2);
		l.add(2);
		
		System.out.println(l);
	
		/*List<Integer> values=Arrays.asList(12,23,23,34);	
		
		System.out.println(values);*/
		
		List<Integer> values=new ArrayList<>()		//double brace//anonymos inner class
				{{
					add(34);
					add(34);
					add(32);
				}};
		System.out.println(values);
		Set<Integer> s=new HashSet<>();
		s.add(6);
		s.add(6);
		s.add(5);
		s.add(2);
				
		System.out.println(s);	//not allowed duplicate and print sequentially
		
		Set<Integer> s1=new TreeSet<>();
		
		s1.add(7);
		s1.add(5);
		s1.add(4);
		s1.add(4);
		
		System.out.println(s1);
		
		Map<Integer, String> m=new HashMap<>();
		
		m.put(1, "dada");
		m.put(1, "dada");
		m.put(1, "dada");
		m.put(2, "dada1");
		
		System.out.println(m);
		
		ArrayList ar=new ArrayList();
		
		ar.add(12);
		ar.add("Sheklk");
		
		System.out.println(ar.get(1));
		
		System.out.println(ar);
		
		Hashtable hs=new Hashtable();	//no duplicate
		
		hs.put("A", "Test");
		hs.put("A", "Test");
		hs.put("B", "Test");
		hs.put("A", "Test");
		System.out.println(hs);
		System.out.println("tostring"+hs.toString());
		hs.remove("A");
		System.out.println(hs.get("A"));
		System.out.println("Now hs"+hs);
		System.out.println(hs.hashCode());
		System.out.println(hs.contains("Test"));
		
		
	}
	
	
	
}
