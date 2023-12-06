package Academia;

public class TesteAcademia {

	public static void main(String[] args) {
		// instanciar um objeto 
			Cliente cli1 = new Cliente ();
			cli1.nome =  "Tiao";
			System.out.println( " nome :"  + cli1.nome);
			cli1.altura = 1.77;
			System.out.println("Altura " + cli1.altura);
			cli1.peso = 82.6;
			double imc = cli1.peso / (cli1.altura* cli1.altura);
			System.out.println("IMC do cliente " + imc );
			cli1.calcularIMC(); { 
			System.out.println("IMC co cliente atraves do metodo "+ cli1.calcularIMC());
			System.out.println("peso desejado:" + cli1.calcularPesoDesejado(100));
			
			}
			
			
	}

}
