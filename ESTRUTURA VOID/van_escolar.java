

class vehicle {
	
	int passageiros;
	int combustivel;
	int kmh;
	
}
	
	// OBJETO VEICULO
	
	class van_escolar {
		
		public static void main (String args[]){
			
			vehicle van = new vehicle();
			int range;
			
			van.passageiros = 7;
			van.combustivel = 17;
			van.kmh = 21;
			
			range = van.combustivel * van.kmh;
			System.out.println(" A VAN COM " + van.passageiros + " FAZ ATE Km /h: " + range);
			
		}		
}
	
