package Atividades_Mary_Paixao;

import java.util.Scanner;

public class TesteCasa {

	public static void main(String[] args) {
			Scanner entrada = new Scanner (System.in);
			Casa c1 = new Casa ();
			System.out.println("qual a cor: ");
			String cor = entrada.next();
			c1.setCor(cor);
			System.out.println("qual o preco: ");
			float preco = entrada.nextFloat();
			c1.setPreco(preco);
			System.out.println("qual a sua metragem: ");
			float metragem = entrada.nextFloat();
			c1.setMetragem(metragem);
			System.out.println("numero de camas: ");
			int q1 = entrada.nextInt();
			c1.setQ1(q1);
			System.out.println("quantas tv: ");
			int sa =  entrada.nextInt();
			c1.setSA(sa);
			c1.mostrarDetalhes();
			
			System.out.println("----CASA 2----");
			Casa c2 = new Casa ();
			System.out.println("qual a cor: ");
			String cor2 = entrada.next();
			c2.setCor(cor);
			System.out.println("qual o preco: ");
			float preco2 = entrada.nextFloat();
			c2.setPreco(preco);
			System.out.println("qual a sua metragem: ");
			float metragem2= entrada.nextFloat();
			c2.setMetragem(metragem);
			System.out.println("numero de camas: ");
			int q2 = entrada.nextInt();
			c1.setQ1(q2);
			System.out.println("quantas tv: ");
			int sa2 =  entrada.nextInt();
			c1.setSA(sa2);
			c1.mostrarDetalhes();

	}

}
