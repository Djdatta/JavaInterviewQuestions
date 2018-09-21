package interfaceAbstract;

public class WrapperClassTest {

	public static void main(String[] args) {
		
		String x="100";
		System.out.println(x+20);  //output;10020
		
		int i=Integer.parseInt(x);
		
		System.out.println(i+20);	//120
		
		//Wrapper classes:  Integer, Double, Character, Boolean
		
		
		//String to double
		String y="12.33";
		double d=Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to boolean
		String k="true";
		boolean b=Boolean.parseBoolean(k);
		System.out.println(b);
		
		//Int to string
		int j=200;
		
		String s=String.valueOf(j);
		
		System.out.println(s+20);
		
		String u="100A";	//NumberFormatException..string is not correct
		Integer.parseInt(u);
				
		
	}
	
	
	
}
