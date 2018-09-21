package stringmanuplation;

public class Tes {

	public static void main(String[] args) {
		
		triangle();
		numPattern(5);
	}
	
	public static void triangle() {
		int i,j,n=10;
		int k=n-1;
		
		for(i=0;i<n;i++) {
			
			for(j=0;j<k;j++) {
				
				System.out.print(" ");
			}
			k=k-1;
			for(j=0;j<=i;j++) {
				
				System.out.print("*");		//If we give space after * then it will print diff pattern
				
				
			}
			
			System.out.println();
		}
	}
	
	public static void numPattern(int n) {
		
		for(int i=0; i<n;i++) {
			
			int num=1;
			for(int j=0;j<=i;j++) {
				System.out.print(num+" ");
				num++;
			}
			
			System.out.println();
			
		}
		
	}
	
	
	
	
}
