package Atividades_Mary_Paixao;

public abstract class Pessoa {
		//atributos 
			private String nome;
			private String endereco;
			private int telefone;
			private int cpf;
			private int celular;
		// metodo construtor 
			public Pessoa () {
				super ();
				System.out.println("");
			}
		// metodo construtor com parametro 
			public Pessoa (String nome, String endereco, int telefone, int cpf, int celular) {
				super ();
				this.nome = nome;
				this.endereco =endereco;
				this.telefone = telefone;
				this.cpf = cpf;
				this.celular = celular;
				System.out.println("");
			}
		//metodos 
			public String getNome () {
				return nome;
			}
			public void setNome (String nome ) {
				this.nome = nome;
			}
			public String getEndereco () {
				return endereco;
			}
			public void setEndereco (String endereco ) {
				this.endereco = endereco;
			}
			public int getTelefone () {
				return telefone;
			}
			public void setTelefone (int telefone ) {
				this.telefone = telefone;
			}
			public int getCpf () {
				return cpf;
			}
			public void setCpf (int cpf) {
				this.cpf = cpf;
			}
			public int celular () {
				return celular;
			}
			public void setCelular (int celular ) {
				this.celular = celular;
			}
}
