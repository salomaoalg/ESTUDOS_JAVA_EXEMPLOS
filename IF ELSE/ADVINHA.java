

class ADVINHA {
	public static void main(String args[]) 
	throws java.io.IOException {
		
		char TEC, ANSWER = 'X';
		
		System.out.print("|| BEM VINDO AO JOGO DE ADVINHACAO|| ");
		System.out.print("/n INFORMA UMA LETRA: ");
		TEC = (char) System.in.read(); // OBTEM UM CHAR // System.in.read(); é um metado

        if (TEC == (ANSWER))
		{
			System.out.print("/n PARABENS VOCÊ ACERTOU, E ESSA LETRA: "+ANSWER);
		}
		else
		{
			System.out.print("/n VOCE ERROU ESSA LETRA NAO E ESSA LETRA "+TEC);
		}
	
	}
}