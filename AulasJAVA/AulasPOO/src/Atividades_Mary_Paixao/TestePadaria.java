package Atividades_Mary_Paixao;

import java.util.Scanner;

public class TestePadaria {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		Pao pao = new Pao ();
		Bolo bolo = new Bolo ();
		Doce doce  = new Doce  ();
		
		Pao pao1 = new Pao ();
		Bolo bolo1 = new Bolo ();
		Doce doce1  = new Doce  ();
		
		System.out.println("----PAO 1----");
		
		System.out.println("digite o nome do pao:");
		String nome = entrada.next();
		pao.setNome(nome);
		System.out.println("qual o preco:");
		double preco = entrada.nextDouble();
		pao.setPreco(preco);
		System.out.println("----INFORMACOES----");
		pao.exibir(preco, nome);
		System.out.println("----BOLO 1 ----");
		
		System.out.println("digite o nome do bolo:");
		String nome1 = entrada.next();
		bolo.setNome(nome1);
		System.out.println("qual o preco:");
		double preco1 = entrada.nextDouble();
		bolo.setPreco(preco1);
		System.out.println("----INFORMACOES----");
		bolo.exibir(preco1, nome1);
		
		System.out.println("----DOCE 1----");
		
		System.out.println("digite o nome do doce:");
		String nome2 = entrada.next();
		doce.setNome(nome2);
		System.out.println("digite o preco:");
		double preco2 = entrada.nextDouble();
		doce.setPreco(preco2);
		System.out.println("----INFORMACOES----");
		doce.exibir(preco2, nome2);
		
		System.out.println("----PAO 2----");
		
		System.out.println("digite o nome do segundo pao:");
		String nome3 = entrada.next();
		pao.setNome(nome3);
		System.out.println("qual o preco:");
		double preco3 = entrada.nextDouble();
		pao.setPreco(preco3);
		System.out.println("----INFORMACOES----");
		pao.exibir(preco3, nome3);
		
		System.out.println("----BOLO 2 ----");
		
		System.out.println("digite o nome do segundo bolo:");
		String nome4 = entrada.next();
		bolo.setNome(nome4);
		System.out.println("qual o preco:");
		double preco4 = entrada.nextDouble();
		bolo.setPreco(preco4);
		System.out.println("----IMFORMACOES----");
		bolo.exibir(preco4, nome4);
		System.out.println("----DOCE 2 ----");
		
		System.out.println("digite o nome do segundo doce:");
		String nome6 = entrada.next();
		doce.setNome(nome6);
		System.out.println("digite o preco:");
		double preco6 = entrada.nextDouble();
		doce.setPreco(preco6);
		System.out.println("----INFORMACOES----");
		doce.exibir(preco6, nome6);
		
		
		
		ComerProdutos cp1 = new  ComerProdutos ();
		cp1.setNome(nome6);
		
		System.out.println("----COMENDO ----");
		
		System.out.println("comendo um pao:  " + pao.getNome()  );
		System.out.println( " comendo um bolo:  " + bolo.getNome() );
		System.out.println( " comendo um doce:  "+ doce.getNome() );
		System.out.println( " comendo outro doce: " + doce.getNome());
	}

}
