package Aula_1206;

import java.util.Scanner;

public class Relogio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int r = entrada.nextInt();
		int f = entrada.nextInt();
		int c = entrada.nextInt();
			if (f  > 3*r || c< 95) {
				System.out.println("diminuir");
			}
			else if  ( f<2*r && c>97){
				System.out.println("aumentar");
			}
			else {
				System.out.println("manter");
			}
			
		
		

	}

}
