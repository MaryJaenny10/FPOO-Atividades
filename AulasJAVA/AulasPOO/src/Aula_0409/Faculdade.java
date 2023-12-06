package Aula_0409;

import java.util.List;

public class Faculdade {
		//atributos 
			public String nomeFacul;
			private List  <Turma >curso;
		//metodo construtor padrao
			public Faculdade () {
			}
		//metodo construtor com parametro 
			public Faculdade (String nf, List <Turma> c) {
				this.nomeFacul = nf;
				this.curso = c;
			}
		//getters e setter 
			public String getNomeFacul() {
				return this.nomeFacul;
			}
			public void setNomeFacul(String n) {
				this.nomeFacul = n;
			}
			public List  <Turma> getCurso () {
				return this.curso;
			}
			public void setCurso ( List <Turma> c) {
				this.curso = c;
			}
		//metodo especial
			public int getTotalEstudante () {
				int nEstudante =0;
				List <Estudante> estudante;
				for(Turma cur: curso) {
					estudante =  cur.getEstudante();
					for (Estudante s : estudante) {
						nEstudante++;
					}
				}
				return nEstudante;
			}
}
