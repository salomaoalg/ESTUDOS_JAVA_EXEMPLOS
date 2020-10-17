import java.util.Scanner;


public class math{
	
	public static void main(String args[]){
		
		
		Scanner LER = new Scanner(System.in);
                tabuada CASO = new tabuada();
		int op;
		
		System.out.print("CALCULADORA E SOMADORA\n");
		System.out.print("\n1 EXIBIR TABUADA: ");
                System.out.println("\n2 SELECIONE A OPCAO: ");
		
		op = LER.nextInt();
		
		switch (op){
			case 1: CASO.range(); 
				break;
			
		}
		
	}
}


class tabuada{

    void range (){
        System.out.println("YES CHEGUEI NO METADO E ENTENDI COMO SAPEGA FUNCIONA!!");
    }

}