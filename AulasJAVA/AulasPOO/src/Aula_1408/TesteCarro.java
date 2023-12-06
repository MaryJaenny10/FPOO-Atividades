package Aula_1408;

public class TesteCarro {

	public static void main(String[] args) {
		// instanciando objetos da classe carro 
			Carro c1 =  new Carro ();
		// atribuimos o modelo do carro
			c1.modelo  = "GOL G5";
			System.out.println(" o modelo e : " + c1.modelo);
		// atribuimos o valor da potencia para o carro
			c1.setPotencia(1000);
			System.out.println(" a potencia e : " + c1.getPotencia() + "CV");
		// verificamos o estado do carro ( parado ou em movimento? )
			c1.isParado();
			System.out.println(" estado do carro esta parado ? :" + c1.isParado());
		// vou modificar o estado do carro 
			c1.setParado(true);
		// vou frear o carro 
			//System.out.println(" pisando no acelerador " + c1.getAcelerar());
			System.out.println("pisando no freio "+ c1.getFrer());
		
		//instancia do carro C2
			Carro c2 =  new Carro ();
		//	System.out.println("Carro c2" + c2);
		//instancia do carros C3 
			Carro c3 = new Carro ( "Gol", 1.6f);
		//	System.out.println("Carros c3 " + c3);
		//instancia do carro C4 
			Carro c4 = new Carro("BMW ", 2.0f);
			System.out.println("Carro c4  " + c4);
			
	}

}
