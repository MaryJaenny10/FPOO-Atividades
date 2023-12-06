package Aula_2308;

public class Santander  extends CaixaEletronico {
			@Override 
			public void sacar (double valor ) {
				valor = valor + 3.2;
				System.out.println("seu saque do Santander....." + "foi: " + valor );
			}

}
