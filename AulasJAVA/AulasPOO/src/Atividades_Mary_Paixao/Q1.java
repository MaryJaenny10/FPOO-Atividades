package Atividades_Mary_Paixao;

import java.util.Scanner;

public class Q1 {
		
		public static void main(String[] args) {
        	int soma = 0;	
			int numero;
			Scanner entrada = new Scanner ( System.in);
			while (true ) {
				System.out.println(" digite valores positivos para soma-los ");
				  numero = entrada.nextInt();
				 if ( numero <= 0 ){
					 break;
				 }
				 soma = soma + numero;
				}
				System.out.println("resultado da soma " + soma );

		}

	}

		

