package Academia;

public class Cliente { //nome da classe 
		//atributos 
			public String cpf;
			public String nome;
			public int telefone;
			public int idade;
			public double altura;
			public double peso;
		//metodos especias
			public double calcularIMC() {
				double imc = peso / (altura*altura);
				return imc;
			}
			public double calcularPesoDesejado (double metaPeso) {
				if (peso > metaPeso) {
					return peso - metaPeso;
				}else 
				return metaPeso - peso;
			}
			public void imprimirDados () {
				System.out.println(" CPF:" + cpf + "Nome:"+ nome +"Telefone"+ telefone +
						"Idade: "+ idade+ "Altura: "+ altura + "m " + " Peso: " + peso + "Kg");
			}
		 

}
