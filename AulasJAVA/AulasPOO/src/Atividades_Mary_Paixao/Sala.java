package Atividades_Mary_Paixao;

public class Sala extends Comodo  {
		//atributos 
			private boolean temTV;
		//metodo construtor padro
			public Sala () {
			}
		//metodo constutor com parametro 
			public Sala (boolean tv) {
				this.temTV=tv;
			}
		//get
			public boolean getTemTV () {
				return this.temTV;
			}

}
