package Aula_0409;

import java.util.List;

public class Biblioteca {
		//atributos 
			private  List <Livro> livros; //varios livros *
		//metodo construtor padrao
			public Biblioteca () {
			}
		//metodo construtor com parametro 
			public Biblioteca (List <Livro> l) {
				this.livros = l;
			}
		//metodo especial
			public List <Livro> getTotalLivrosBiblioteca () {
				return livros;
			}
}
