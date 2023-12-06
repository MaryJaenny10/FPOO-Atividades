package Aula_1408;

public class Carro { 
		//atributos 
		public String modelo;
		private float potencia;
		public boolean parado;
		//contrutor padrao (default)
		public Carro (){
			System.out.println("acabei de nascer!");
		}
		public Carro ( String mod,  float pot) {
			this.modelo = mod;
			this.potencia = pot;
			System.out.println("model : " + modelo + "\npotencia "+ potencia );
		}     
		// métodos getters e setters 
		public String getModelo() {
				return modelo;
		}
		public void setModelo (String m) {
				this.modelo = m;
		}
		public float getPotencia ( ) {
				return potencia;
		}
		public void setPotencia (float p) {
				potencia = p ;
		}
		
		// métodos especiais ( lógica)
		public boolean getAcelerar () {
				if ( parado == true) {
					System.out.println("sem movimento!");
				}else {
					System.out.println("andando!");
				}
				return parado;
		}
		public boolean getFrer () {
			if ( parado == true) {
				System.out.println("sem movimento !");
			}else {
				System.out.println(" esta em movimento!");
			}
			return parado;
		}
		public boolean isParado () { //testa o estado que o carro se enconta 
			return parado;
		}
		public void setParado (boolean pa) { // muda o estado do carro 
			parado = pa;
		}
		public void getFrear() {
			System.out.println("Freiando");
		}
}
