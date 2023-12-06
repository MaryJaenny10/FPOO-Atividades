package Atividades_Mary_Paixao;

import java.util.Scanner;

public class Leilao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int lance = entrada.nextInt();
		int lance2= entrada.nextInt();
		int lance3= entrada.nextInt();
		
		if ( lance < 100 || lance2 > 100 )
			System.out.println("perdeu ");
		
		else if  ( lance2 < 150 || lance3 >=200 )
		       System.out.println("ganhou ");

		

	}

}
