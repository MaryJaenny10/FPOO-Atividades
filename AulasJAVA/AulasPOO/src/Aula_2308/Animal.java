package Aula_2308;

public class Animal {// clase pai / super classe
		//atributos 
			public String nome ="Frajola";
		//metodo construtor 
			public Animal () {
				super();
				System.out.println(" OBJETO Animal acabou de nascer ");
			}
		//metodos 
			public void som () {
				System.out.println(" \n som da classe Animal ");
			}
			public void brincar () {
				System.out.println("\n brincando... ");
			}
			public void som1() {
				System.out.println("\n som1 da classe Animal ");
			}
			public String getNome() {
				// TODO Auto-generated method stub
				return nome;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			
			
}//fim classe 
