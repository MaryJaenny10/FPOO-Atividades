package Atividades_Mary_Paixao;

import java.util.Scanner;

public class Aluno extends Pessoa   {
	//atributos 
		private String curso;
		private float nota;
	//metodo construtor 
		public Aluno () {
			super ();
			System.out.println("");
		}
	//metodo construtor com parametro 
		public Aluno (String curso, float nota) {
			super ();
			this.curso = curso;
			this.nota = nota;
			System.out.println("");
		}
	//metodos 
		public String getCurso () {
			return curso;
		}
		public void setCurso (String curso ) {
			this.curso = curso;
		}
		public float getNota () {
			return nota;
		}
		public void setNota (float nota ) {
			this.nota = nota;
		}
	//metodo calcular media do aluno 
		public void CalcularMedia () {
			Scanner entrada = new Scanner (System.in);
			 float nota1;
			 float nota2;
			System.out.println("digite a primeira nota:");
			nota1 = entrada.nextFloat();
			System.out.println("digite a segunda nota:");
			nota2 = entrada.nextFloat();
			float media = (nota1+nota2)/2;
			this.nota = media;
		}	
		public void AtingiuMedia() {
			if(nota>=7) {
				System.out.println("aprovado");
			}else {
				System.out.println("nao aprovado ");
			}
			
		}
}

