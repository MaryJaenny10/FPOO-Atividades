package Atividades_Mary_Paixao;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int operacao;
		double resultado;
		do {
				exibirMenu(); // metodo (acao)
				operacao = entrada.nextInt ();
				switch (operacao) {
					case 1 :
						System.out.println("soma ");
						System.out.println( "digite o 1º numero:");
						double num1 = entrada.nextDouble();
						System.out.println( "digite o 2º numero:");
						double num2 = entrada.nextDouble();
						resultado = num1 + num2; 
						System.out.println( " resultado = " + resultado );
						break;
					case 2 :
						System.out.println("divisao");
						System.out.println( "digite o 1º numero:");
						double num3 = entrada.nextDouble();
						System.out.println( "digite o 2º numero:");
						double num4 = entrada.nextDouble();
						resultado = num3 / num4; 
						System.out.println( " resultado = " + resultado );
						break;
					case 3 :
						System.out.println(" multiplicacao ");
						System.out.println( "digite o 1º numero:");
						double num5 = entrada.nextDouble();
						System.out.println( "digite o 2º numero:");
						double num6 = entrada.nextDouble();
						resultado = num5 * num6; 
						System.out.println( " resultado = " + resultado );
						break;
					case 4 : 
						System.out.println("subtracao ");
						System.out.println( "digite o 1º numero:");
						double num7= entrada.nextDouble();
						System.out.println( "digite o 2º numero:");
						double num8 = entrada.nextDouble();
						resultado = num7 - num8; 
						System.out.println( " resultado = " + resultado );
						break;
					default:
						System.out.println(" escolha as operacoes  de 1 a 4");
						break;
				} // switch
				
				System.out.println();
				
		}// do
		
		while(operacao != 0 );
		
	}//fim main
				//metodo para exibir menu de opcoes (fora do main)
				public static void exibirMenu() {
					System.out.println(" Selecione uma opcao");
					System.out.println("1 -soma");
					System.out.println("2- divisao");
					System.out.println(" 3-multiplicacao");
					System.out.println(" 4-subtracao");
					System.out.println(" 0-sair");
			}//fim void 
}//fim classe