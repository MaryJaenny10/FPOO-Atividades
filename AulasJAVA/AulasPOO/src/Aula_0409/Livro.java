package Aula_0409;

public class Livro {
		//atribulos 
			public String titulo;
			public String autor;
		//metodo construtor padro
			public Livro () {
			}
		//metodo construtor com parametro 
			public Livro(String t, String a) {
				this.titulo = t;
				this.autor=a;
			}
		// getters e setters
			public String getTitulo() {
				return this.titulo;
			}
			public void setTitulo (String t) {
				this.titulo = t;
			}
			public String getAutor () {
				return this.autor;
			}
			public void setAutor (String a) {
				this.autor =a;
			}
}
