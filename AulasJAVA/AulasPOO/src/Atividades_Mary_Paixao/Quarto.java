package Atividades_Mary_Paixao;

public class Quarto extends Comodo  {
			//atributos 
			private int numeroCamas;
			//metodo construtor padro 
			public Quarto () {
				super.setNome(null);
			}
			//construtor com parametro
			public Quarto (int nc) {
				this.numeroCamas=nc;
			}
			//getters e setter 
			public int getNumeroCamas() {
				return this.numeroCamas;
			}
			public void setNumeroCamas (int numeroCamas) {
				this.numeroCamas=numeroCamas;
			}

}
