package Aula_2308;

import java.util.ArrayList;
import java.util.Scanner;

import Aula_0409.Cachorro;

public class TesteAnimal1 {

	public static void main(String[] args) {
				 try (Scanner entrada = new Scanner (System.in)) {
					// criei minha lista de animais vacias,
					ArrayList <Animal1> animais = new ArrayList <> ();
					for (int i =0; i < 2; i ++) {
						System.out.println("Digite o nome do animal " + (i + 1 )+ ":");
						String nome = entrada.nextLine();
						System.out.println("Escolha o tipo de animal " + " (cao e gato");
						String tipo = entrada.nextLine();
						Animal1 animal;
						if (tipo.equalsIgnoreCase("Cachorro")) {
							animal = new Cachorro (nome);
						}else if (tipo.equalsIgnoreCase("Gato")) {
							animal = new Gato1 (nome);
						}else {
						System.out.println("tipo de animal invalido ");
						animal = new Animal1 (nome);
									}
						animais.add (animal);
					//animais.add(animal);
					}
					for (Animal1 animal : animais ) {
						System.out.println("nome do animal :" + animal.getNome ());
						animal.emitirSom ();
					}
				}
				}
	
}//fim da classe 

