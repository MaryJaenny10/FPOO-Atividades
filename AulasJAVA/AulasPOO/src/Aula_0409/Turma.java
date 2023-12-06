package Aula_0409;

import java.util.List;

public class Turma {
		//atributos 
			public String nome;
			private List <Estudante>  estudante;
		//metodo construtor padrao
			public Turma () {
			}
			public Turma (String n, List <Estudante> e) {
				this.nome = n;
				this.estudante = e;
			}
		//getters e setters 
			public String getNome () {
				return this.nome;
			}
			public void setNome (String n) {
				this.nome=n;
			}
			public List  <Estudante> getEstudante () {
				return this.estudante;
			}
			public void setEstudante (List <Estudante> e) {
				this.estudante =e;
			}
}
