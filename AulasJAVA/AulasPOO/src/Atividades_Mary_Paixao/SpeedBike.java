package Atividades_Mary_Paixao;

public class SpeedBike implements InterfaceVeiculo {
	//atributos 
		public int velocidade;
		public int marcha;
		//metodo construtor padrao
		public SpeedBike () {
			
		}
	//metodo construtor com parametro
		public SpeedBike (int v, int m) {
			this.marcha = m;
			this.velocidade = v;
		}
	//metodos herdado InterfaceVeiculo
		@Override
		public void mudarMarcha(int mar ) {
			mar = mar +0;
			System.out.println("mudando marcha" + mar);
		}
		@Override
		public void acelerar(int acer) {
			acer = acer + 1;
			System.out.println("acelerando " + acer );
		}
		@Override
		public void frear  (int fer) {
			fer = fer - 1;
			System.out.println("freiando " + fer );
		}
		//metodo da clase 
		public void estado (int v, int m,int acer,int fer  ) {
			System.out.println("\n acelerando: "+ acer+
					"\n marcha: "+m +"\n freiando: "+ fer+"\n velocidade: "+ v);
			
		}
	//metodos da classe
		public void estado () {
			
		}
		//metodos getters e setters 
		public int getVelocidade () {
			return  velocidade;
		}
		public void setVelocidade (int v) {
			this.velocidade = v;
		}
		public int getMarcha () {
			return marcha;
		}
		public void setMarcha (int m) {
			this.marcha = m;
		}


}
