
import java.util.Scanner;

class teclado{
	
	public static void main(String args[]){
	    
		Scanner read = new Scanner(System.in);
		
		int B = 0, COUNT, C;
        int A = 0;            
		 
		
		System.out.print("\nINFORME UM VALOR A SER MOSTRADO A TABUADA: ");
		A = read.nextInt();
		
		
		 
	    for (COUNT = 0; COUNT <= 10; COUNT++){
		     
			
			B = COUNT * A;
			
            System.out.println(A + " VEZES " + COUNT + " IGUAL A: " + B);			
			
		}
	}
}