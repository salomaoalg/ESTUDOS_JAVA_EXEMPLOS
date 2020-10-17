

class calcula{
    double valorreal;
	double distancia;
	
	 double kilometros (double km){
	  return valorreal * km;
	}
}



class auto{

	public static void main(String[] args){
		
		double VALOREAL;
		double distancia = 100;
		calcula viagem = new calcula();
		
		viagem.valorreal = 4.70;
		
		VALOREAL = viagem.kilometros(distancia);
		System.out.print("\n O VALOR PARA PERCORRER: " + distancia+" CUSTARA: "+ VALOREAL);
	 	
	}

}