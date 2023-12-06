package Atividades_Mary_Paixao;

import java.util.Scanner;

public class Contas2 {

	public static void main(String[] args) {
		int V,A,P,F;
		Scanner entrada =  new Scanner ( System.in);
		 System.out.println(" imforme valor disponivel:");
		 V= entrada.nextInt();
		 A=entrada.nextInt();
		 P=entrada.nextInt();
		 F=entrada.nextInt();
		 
		 if ( V>=( A+P+F)) {
			 System.out.println("3");
	 } 	else if ( V>= ( A+F) || V>= (A+P)) {
		 System.out.println("2");
	} else if ( V>= A || V>= F || V>= P ) {
		System.out.println('1');
	}
		 

	}

}
