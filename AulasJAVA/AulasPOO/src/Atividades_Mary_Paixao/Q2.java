package Atividades_Mary_Paixao;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int menorNumero = Integer.MAX_VALUE;
			while (true) {
				System.out.print("Digite um numero (digite 0 para parar): ");
				int numero = scanner.nextInt();
				if (numero == 0) {
					break;
				}
				if (numero < menorNumero) {
					menorNumero = numero;
					}
			}
			if (menorNumero != Integer.MAX_VALUE) {
				System.out.println("O menor numero digitado foi: " + menorNumero);
				} else {
					System.out.println("Nenhum numero foi digitado.");
				}scanner.close();
			}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		