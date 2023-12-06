package Aula_3008;

public class UsoInterface implements InterfacePai{
		//atributos da classe 
			public String at1;
			
		// metodos herdado da InterfacePai
		//preciso realizar a sobrescrita de metodos !!
			@Override
			public void metodo1() {
				System.out.println("esse e o metodo 1");
			}//fim metodo 1
			
			@Override
			public void metodo2 () {
				System.out.println("esse e o metodo 2 ");
			}//fim do metodo 2
			
			@Override
			public void somar (int x, int y) {
				int r = x+y;
				System.out.println("o resultado e" + r);
			}//fim do metodo somar 
			
	 // metodos da propria classe UsoInterface
			public void metodo3() {
				System.out.println("esse e o metodo 3 da propria classe ");
			}//fim do metodo 3 
			
}//fim da classe 
