package Atividades_Mary_Paixao;

import java.util.Scanner;

public class Leilao2 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner ( System.in);
		 System.out.println(" numero de lances "); 
		 int numero = entrada.nextInt();
		 int v = 0;
		 int [] n = {v};
		 String c= null; //variavel vazia
		 String [] n1 = {c};
		 
		 for (int i =0; i < numero; i++) {
			 System.out.println("escreva o nome ");
			 String c1 = entrada.next();
			 System.out.println("escreva o valor dos lances ");
			 int lance = entrada.nextInt();
			 
			 if (lance > n [0]) {
				 n[0] = lance;
				 n1 [0] = c1;
			 }
		 }
		 System.out.printf( "o nome do licitante e : %s\n", n1[0]);
		 System.out.printf("o valor dado e : %d", n[0]);
	}

}
