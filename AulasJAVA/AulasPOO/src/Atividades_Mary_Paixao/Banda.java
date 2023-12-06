package Atividades_Mary_Paixao;

import java.util.List;

public class Banda {
		//atributos 
			private String nome;
			private List <MembroBanda> membros; 
		//metodo construtor padrao
			public Banda () {
			}
		//metodo construtor com parametro
			public Banda (List<MembroBanda > m , String n) {
				this.membros = m;
				this.nome=n;
			}
		//getters e setters
			public String getNome() {
				return nome;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			public List<MembroBanda> getMembros() {
				return this.membros;
			}
			public void setMembros(List<MembroBanda> m) {
				this.membros=m;
			}
			
			public void realizarShow() {
				System.out.println("O show comecou ..");
			}
}
