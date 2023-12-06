package Aula_0409;

import java.util.ArrayList;
import java.util.List;

public class TesteBiblioteca {

	public static void main(String[] args) {
			//instancia de objeto ,  mas qual ?
		   //instanciando livros 
				Livro l1 = new Livro("Programacao JAVA ", " Deitel ");
				Livro l2 = new Livro("UML " , " Bezerra" );
		 //instanciando lista vazia 
				List <Livro> lista_livro = new ArrayList<Livro>();
		//adicionando objeto livro no objeto lista_livro	
				lista_livro.add(l1);
				lista_livro.add(l2);
		//ler os livros que estão na lista 
				for (  Livro ll: lista_livro) {// tipo - objeto para ler a lista de livro - sua lista de livro 
					System.out.println("livros da lista: " + ll.titulo + ll.autor);
				}
		// instanciando a biblioteca 
		// a lista de livros faz parte da biblioteca (composição)
				Biblioteca b1 = new Biblioteca(lista_livro);
				List <Livro> li = b1.getTotalLivrosBiblioteca();
				for (Livro liv: li) {
					System.out.println("Titulo: " + liv.titulo+"Autor"+ liv.autor);
				}
	}

}
