package Aula_0409;

public class Empregado {
			//atributos 
				private String nome;
				
		// metodo construtor padrao
				public Empregado (String no) {
					this.nome=no;
				}
		//metodos getters e setter 
				public String getNome() {
					return this.nome;
				}
				public void setNome (String n) {
					this.nome = n;
				}
}
