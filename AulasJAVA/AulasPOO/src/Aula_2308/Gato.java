package Aula_2308;

public class Gato  extends Animal  {//herença (extends)
		//atributos 
			public String raca;
			public float peso;
			public int idade;
		//metodo construtor 
			public Gato () {
				super ();
				System.out.println("acabei de nascer e sou um gato" + " sem caracteristica ");
			}
			public Gato (String raca) {//metodo contrudor com parametros 
				super ();
				this.raca = raca;
				System.out.println("\n acabei de nascer e sou um gato " + "da raça " + this.raca);
			}
			public Gato (float peso, int idade) {
				 super ();
				this.peso = peso;
				this.idade = idade;
				System.out.println("\n acabei de nascer e sou um gato " + " com " + this.peso + "Kg"+ "e" + this.idade + "anos de idade ");
			}
		//metodos 
			public void som () {
				System.out.println("som da classe gato ");
				super.som(); //som da classe Animal 
			}
}
