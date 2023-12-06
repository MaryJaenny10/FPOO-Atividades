package Atividades_Mary_Paixao;

import java.util.Scanner;

public class Contas {

	public static void main(String[] args) {
		
		Scanner entrada  = new Scanner (System.in);
		 int v = entrada.nextInt();
		 int a = entrada.nextInt();
		 int p =entrada.nextInt();
		 int f =  entrada.nextInt();
		 
		 if ( v >= ( a+p+f)) 
			 System.out.println(" 3 ");
		 else
			 System.out.println("0 ");
		 
		
		}
		
		

	}


