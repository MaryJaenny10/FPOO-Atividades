package Aula_2308;

public class CaixaEletronico { // serviço 24 hrs ( varios bancos )
		//atributos
		//construtores
		//getters e setter
			public void sacar (double valor ) {
				valor = valor + 0.5; // taxa cobrada pela transação 
				System.out.println("O seu saqe no caixa eletronico " + "foi = " + valor);
			}
}
