
class Exemple3 {
	/*
	ESTE PROGRAMA MOSTRA DIFERENÇA ENTRE
	DOUBLE E INT EXEMPLE.3;JAVA
	*/
	
	public static void main (String args[]){
		
		int var; // Variavel do tipo inteiro
		double X; // Variavel do tipo ponto flutuante.
		
		// atribuindo o valor 10 para ambas as variaveris
		
		var = 10;
		X =  10.0;
		
		System.out.println("\nVARIAVEL DO TIPO INTEIRO SAI COMO: " + var);
		System.out.println("\nVARIAVEL DO TIPO FLUTUANTE SAI COMO: " + X);
		
		var = var / 4;
		X = X / 4;
		
		System.out.println("\nDIVIDO POR 4 E IGUAL A: "+var);
		System.out.println("\nDIVIDO POR 4 E IGUAL A: "+X);
	}
}