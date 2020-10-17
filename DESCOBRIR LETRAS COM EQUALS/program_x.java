
import java.util.Scanner;
// MINHA NOSSA!! ESSE É PROGRAMA MAIS TONTO QUE EU ESTOU FAZENDO.
 class program_x {
	 
	 public static void main (String args[]) {
	  
		String resp = " ";
		Scanner LER = new Scanner(System.in);
		//Ler um char Java.io.IOExcepetion / (char) System.in.read;
		
		System.out.print("\n INFORME UMA LETRA PARA ADVINHAR: ");
		resp = LER.next();
		
		resp = resp.trim();
		resp = resp.toUpperCase();
		System.out.print(resp);
		
		if (!"Y".equals(resp)){
		
			while (!"Y".equals(resp)){
				
				System.out.print(resp);
				System.out.print("\n TENTE NOVAMENTE / INFORME OUTRA LETRA PARA ADVINHAR: ");
			    resp = LER.next();
				
			}
			
			System.out.print("\n VOCÊ ACERTOU ;-)");
		
		}

	    						
		
					
		else{
			
			System.out.print("\n PARABÉNS VOCÊ ACERTOU DE PRIMEIRA ;-)");			
		}
	 }
 }