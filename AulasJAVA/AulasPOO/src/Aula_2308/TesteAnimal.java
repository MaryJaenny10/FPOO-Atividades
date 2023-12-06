package Aula_2308;

public class TesteAnimal {

	public static void main(String[] args) {
				//instancia de objetos  da classe animal 
						System.out.println("--------INICIO DO ANIMAL----------------------");
						Animal ani1 = new Animal ();
						ani1.nome = "Pica-Pau";
						System.out.println("Animal criado:" + ani1.nome );
		      // instrancia do objeto da classe gato 
						System.out.println("------------FIM ANIMAL --------------------------");
						System.out.println("-------------INICIO GATO 1------------------------");
						Gato gato1 =  new Gato ();
						gato1.nome = "Theo";
						System.out.println("Nome:" + gato1.nome);
						gato1.brincar();
						System.out.println("--------------- FIM GATO 1---------------------------");
						System.out.println("------------INICIO DO GATO 2---------------------");
						Gato gato2 = new Gato ("Percia");
						gato2.som();
						System.out.println("-------------FIM DO GATO 2------------------------");
						System.out.println("-----------INICIO DO GAT03 -----------------------");
						@SuppressWarnings("unused")
						Gato gato3 = new Gato ( 2.5f , 1);
						System.out.println("------------FIM DO GATO 3--------------------------");
	}

}
