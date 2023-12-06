package Aula_2308;

public class Caixa extends CaixaEletronico  {
		//metodo
		 @Override 
		 public void sacar (double valor ) {
			 valor = valor + 0.9; //taxa cobrada pela transação
			 System.out.println("O seu saque na caixa.... " + "foi: " + valor );
		 }
}
