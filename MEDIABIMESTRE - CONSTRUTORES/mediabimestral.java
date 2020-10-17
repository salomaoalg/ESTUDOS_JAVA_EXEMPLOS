class somamedia{
	double nota1;
	double nota2;
	double media;
	
	somamedia(double nt1, double nt2){
				
		this.nota1 = nt1; // This Referencia a vatiavel de instancia.
		this.nota2 = nt2;	
	}
	
	double mediafinal(){
		return media = (nota1 + nota2) / 2;
	}	
	
}

class mediabimestral{
	
	public static void main(String[] args){
		double notafinal;
		
		somamedia aprovacao = new somamedia(10, 7.5);
		notafinal = aprovacao.mediafinal();
		
		System.out.println("A NOTA FINAL DE JOSE E: "+ notafinal);
	}
}