package Aula_0409;

import Aula_2308.Animal1;

public class Cachorro extends Animal1 {
			//metodo construtor
				public Cachorro (  String nome ) {
					super (nome); //pegando atributo nome da super classe Animal1
				}
				@Override 
				public void emitirSom () {
					System.out.println("O cachorro esta latindo ...");
				}
				
}
