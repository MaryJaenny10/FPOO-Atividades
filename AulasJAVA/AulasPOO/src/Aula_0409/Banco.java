package Aula_0409;

public class Banco {
				//atributos da classe Banco 
					private String nome;
					
			  // metodo construtor padrao
					public Banco (String no) {
						this.nome = no;
					}
			// metodo getters e setters 
					public String getNome () {
						return nome;
					}
					public void setNome (String n) {
						this.nome = n;
					}
}
