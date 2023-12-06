package Atividades_Mary_Paixao;

import java.util.Scanner;

public class TesteParque {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		    Visitante v1 =  new Visitante ();
		    System.out.println("qual o seu nome?");
		    v1.setNome(entrada.next ()) ;
		    System.out.println("qual a sua idade ?");
		    v1.setIdade(entrada.nextInt ());
		    System.out.println("qual a sua altura ?");
		    v1.setAltura(entrada.nextDouble());
		    
		    Brinquedo b1 = new Brinquedo ();
		    System.out.println("nome do brinquedo");
		    b1.setNome(entrada.next());
		    System.out.println("altura minima ");
		    b1.setAtulraminima(entrada.nextDouble());
		    System.out.println("capacidade maxima");
		    b1.setCapacidademaxima(entrada.nextInt());
		  
	}

}
