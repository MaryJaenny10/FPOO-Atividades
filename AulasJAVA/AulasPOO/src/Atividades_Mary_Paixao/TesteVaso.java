package Atividades_Mary_Paixao;

import java.util.Scanner;

public class TesteVaso {

	public static void main(String[] args) {
		//intancia de obj da classe vaso 
		System.out.println("VASO 1");
			Scanner entrada = new Scanner (System.in);
			Vaso vaso1 = new Vaso ();
			System.out.println("qual a cor?");
			String cor = entrada.next();
			vaso1.setCor(cor);
			System.out.println("qual o tamanho?");
			double tamanho  = entrada.nextDouble();
			vaso1.setTamanho(tamanho);
			System.out.println("qual o material ");
			String material   = entrada.next();
			vaso1.setMaterial(material);
			vaso1.exibirInfo(cor, material, tamanho);
			
			// vaso 2
			System.out.println("VASO 2");
			Scanner entrada1 = new Scanner (System.in);
			Vaso vaso2 = new Vaso ();
			System.out.println("qual a cor?");
			String cor1 = entrada.next();
			vaso2.setCor(cor);
			System.out.println("qual o tamanho?");
			double tamanho1  = entrada.nextDouble();
			vaso2.setTamanho(tamanho);
			System.out.println("qual o material ");
			String material1   = entrada.next();
			vaso2.setMaterial(material);
			vaso2.exibirInfo(cor1, material1, tamanho1);
			
		//instancia de obj da classe vaso decorado 
			System.out.println("VASO 3");
			VasoDecorado vaso3 = new VasoDecorado ();
			System.out.println("qual a decoracao?");
			String decoracao = entrada.next();
			vaso3.setVasodecorado(decoracao);
			System.out.println("qual a cor?");
			String cor2 = entrada.next();
			vaso2.setCor(cor);
			System.out.println("qual o tamanho?");
			double tamanho2  = entrada.nextDouble();
			vaso2.setTamanho(tamanho);
			System.out.println("qual o material ");
			String material2   = entrada.next();
			vaso2.setMaterial(material);
			vaso2.exibirInfo(cor2, material2, tamanho2);;
		
			
		// vaso decorado  2
			System.out.println("VASO 4 ");
			VasoDecorado vaso4 = new VasoDecorado ();
			System.out.println("qual a decoracao?");
			String decoracao4 = entrada.next();
			vaso3.setVasodecorado(decoracao);
			System.out.println("qual a cor?");
			String cor3 = entrada.next();
			vaso3.setCor(cor);
			System.out.println("qual o tamanho?");
			double tamanho3 = entrada.nextDouble();
			vaso3.setTamanho(tamanho);
			System.out.println("qual o material ");
			String material3   = entrada.next();
			vaso3.setMaterial(material);
			vaso3.exibirInfo1(material3);
		
			
			
			
			
	}

}
