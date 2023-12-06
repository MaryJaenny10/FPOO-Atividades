package Aula_0208;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int opcao;
		do {
				exibirMenu(); // metodo (acao)
				opcao = entrada.nextInt ();
				switch (opcao) {
					case 1 :
						System.out.println("opcao 1 selecionada");
						break;
					case 2 :
						System.out.println("opcao 2 selecionada");
						break;
					case 3 :
						System.out.println(" opcao 3 selecionada ");
						break;
					default:
						System.out.println(" escolha as opcoes de 1 a 3");
						break;
				} // switch
				
				System.out.println();
				
		}// do
		
		while(opcao != 0 );
		
	}//fim main
				//metodo para exibir menu de opcoes (fora do main)
				public static void exibirMenu() {
					System.out.println(" Selecione uma opcao");
					System.out.println(" 1 - opcao 1");
					System.out.println(" 1 - opcao 2");
					System.out.println(" 1 - opcao 3");
					System.out.println(" o - SAIR");
			}//fim void 
				
}//fim classe