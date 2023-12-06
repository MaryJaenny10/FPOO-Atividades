package Atividades_Mary_Paixao;

public class Professor extends Pessoa {
	//atributos 
		private String nomeCurso;
		private float salario;
	//metodo construtor 
		public Professor () {
			super ();
			System.out.println("");
		}
	//metodo construtor com parametro 
		public Professor (String nomeCurso , float salario ) {
			super ();
			this.nomeCurso = nomeCurso;
			this.salario = salario;
			System.out.println("");
		}
	//metodos 
		public String getNomeCurso() {
			return nomeCurso;
		}
		public void setNomeCurso (String nomeCurso) {
			this.nomeCurso = nomeCurso;
		}
		public float getSalario () {
			return salario;
		}
		public void setSalario (float salario) {
			this.salario = salario;
		}

}
