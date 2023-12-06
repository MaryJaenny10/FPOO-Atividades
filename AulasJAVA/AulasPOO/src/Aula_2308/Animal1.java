package Aula_2308;

public class Animal1 {
			//atributo
				private String nome;
		    //metodo construtor 
				public Animal1 (String nome ) {
					this.nome = nome;
				}
				public void emitirSom () {
					System.out.println("O animal esta fazendo barlho");
				}
				public String getNome () {
					return this.nome;
				}
				public void setNome (String nome ) {
					this.nome = nome;
				}
}
