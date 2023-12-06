package Atividades_Mary_Paixao;

public class Cliente {
	//atributos 
			private String nome;
			private String sobrenome;
			private String email;
	//metodo construto padrao
			public Cliente() {
			}
	//metodo construtor com parametro 
			public Cliente (String n, String s, String e) {
				this.nome = n;
				this.sobrenome = s;
				this.email = e;
			}
	//getters e setters
			public String getNome() {
				return this.nome;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			public String getSobrenome() {
				return this.sobrenome;
			}
			public void setSobrenome(String sobrenome) {
				this.sobrenome = sobrenome;
			}
			public String getEmail() {
				return this.email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
}
