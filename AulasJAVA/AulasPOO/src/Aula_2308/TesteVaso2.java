package Aula_2308;

import java.util.Scanner;

import Atividades_Mary_Paixao.Vaso;
import Atividades_Mary_Paixao.VasoDecorado;

import java.util.ArrayList;

public class TesteVaso2 {

	public static void main(String[] args) {
			try (Scanner entrada = new Scanner (System.in)) {
				//lista
				ArrayList<Vaso> vasos = new ArrayList < > ();
				for (int i= 0 ; i < 2 ; i++) {
					System.out.println("digite o nome da cor " + (i + 1 ) + ":");
					String cor = entrada.next();
					System.out.println("escolha o tamanho do vaso " + "(pequeno e grande )");
					double tamanho = entrada.nextDouble ();
					System.out.println("qual o material");
					String material = entrada.next();
					Vaso vaso;
					vaso  = new Vaso(cor, material);
					for (Vaso vaso1 : vasos ) {
						System.out.println("nome da cor :" +vaso1.getCor());
					}vaso.exibirInfo(cor, material, tamanho);				
					}
				System.out.println("-----------------------lista vaso decorado ------------------------------");
				
				ArrayList <VasoDecorado> vasod = new ArrayList <> ();
				for (int i= 0 ; i < 2 ; i++) {
					System.out.println("qual a decoracao " );
					String decoracao = entrada.next();
					System.out.println("digite o nome da cor " + (i + 1 ) + ":");
					String cor1 = entrada.next();
					System.out.println("escolha o tamanho do vaso " + "(pequeno e grande )");
					double tamanho1 = entrada.nextDouble ();
					System.out.println("qual o material");
					String material1 = entrada.next();
					VasoDecorado  vasod1;
					vasod1  = new VasoDecorado ();
					/*for (VasoDecorado vaso2: vasod ) {
						System.out.println("nome da cor :" +vaso2.getVasodecorado());*/
						vasod1.exibirInfo(decoracao, material1, tamanho1);
					}
			}
			}
	}


