

class fortest{
	
	public static void main (String args[])
		throws java.io.IOException{
			
			
			int i;
			
			System.out.println("PRESSIONE S PARA PARAR: ");
			
			for(i = 0; (char) System.in.read() != 'S'; i++){
			System.out.println("Press #" + i);			
			
			}
	}
}