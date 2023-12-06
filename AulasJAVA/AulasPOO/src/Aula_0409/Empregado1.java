package Aula_0409;

public class Empregado1 {
			//atributos 
				private int salario;
				private Pessoa funcionario;
		  //metodo construtor padro
				public Empregado1 () {
					
				}
		//metodo construtor com parametro
				public Empregado1 (int s, Pessoa f) {
					this.salario = s;
					this.funcionario = f;
				}
		//metodos getters e setters
				public int getSalario () {
					return this.salario;
				}
				public void setSalario (int s) {
					this.salario = s;
				}
				public Pessoa getFuncionario () {
					return this.funcionario;
				}
				public void setFuncionario (Pessoa f) {
					this.funcionario = f;
				}

}
