package Aula_0409;

public class Pessoa {
		//atributos
			public String cargo;
			public String nome;
			public int idade;
		// metodo construtor com parametro 
			public Pessoa (String c, String n, int i) {
				this.cargo = c;
				this.nome = n;
				this.idade = i;
			}
		//metodos getters e setters 
			public String getCargo () {
				return this.cargo;
			}
			public void setCargo (String c) {
				this.cargo = c;
			}
			public String getNome () {
				return this .nome;
			}
			public void setNome (String n) {
				this.nome = n;
			}
			public int getIdade () {
				return  this.idade;
			}
			public void setIdade (int i) {
				this.idade = i;
			}
}
