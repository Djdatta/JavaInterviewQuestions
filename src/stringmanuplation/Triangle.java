package stringmanuplation;

public class Triangle {


	public static void main(String[] args) {
		
		System.out.println("Rectangular Traingle..");
		printRectTraingle(5);
		
		System.out.println("---------------------");
		revtTriangle(5);
		
		System.out.println("---------------------");
		triangle(5);
		
		
	}
	
	public static void printRectTraingle(int n) {
		
		for(int i = 0; i<n; i++)
        {
 
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop  
            for(int j = 0; j<=i; j++)
            {
                // printing stars
                System.out.print("* ");
            }
 
            // ending line after each row
            System.out.println();
        }
		
	}
	
	
	public static void revtTriangle(int n) {
		int i, j, k=2*n-2;
		 
        // outer loop to handle number of rows
        //  n in this case
        for(i=0; i<n; i++)
        {
 
            // inner loop to handle number spaces
            // values changing acc. to requirement
            for(j=0; j<k; j++)
            {
                // printing spaces
                System.out.print(" ");
            }
             
            // decrementing k after each loop
            k = k - 1;
             
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for(j=0; j<=i; j++)
            {
                // printing stars
                System.out.print("* ");
            }
             
            // ending line after each row
            System.out.println();
        }
	}

	public static void triangle(int n) {
		int i, j, k=2*n-2;
		 
        // outer loop to handle number of rows
        //  n in this case
        for(i=0; i<n; i++)
        {
 
            // inner loop to handle number spaces
            // values changing acc. to requirement
            for(j=0; j<k; j++)
            {
                // printing spaces
                System.out.print(" ");
            }
             
            // decrementing k after each loop
            k = k - 2;
             
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for(j=0; j<=i; j++)
            {
                // printing stars
                System.out.print("* ");
            }
             
            // ending line after each row
            System.out.println();
        }
	}


}