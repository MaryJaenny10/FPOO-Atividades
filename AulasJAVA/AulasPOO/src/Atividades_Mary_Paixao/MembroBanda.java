package Atividades_Mary_Paixao;

import java.util.List;

public class MembroBanda {
			//atributos 
				private String nome;
			//metodo construtor padrao
				public MembroBanda () {
				}
			//metodo construtor com parametro 
				public MembroBanda (String n) {
					this.nome=n;
				}
		//getters e setters
				public String getNome() {
					return this.nome;
				}
				public void setNome(String nome) {
					this.nome = nome;
				}
				public void tocar() {
					System.out.println("tocando...... ");
				}
				public List<Vocalista> getVocalista() {
					// TODO Auto-generated method stub
					return null;
				}

}
