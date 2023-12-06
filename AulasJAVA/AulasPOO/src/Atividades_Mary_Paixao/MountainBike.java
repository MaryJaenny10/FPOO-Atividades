package Atividades_Mary_Paixao;

public class MountainBike  implements InterfaceVeiculo{
	//atributos 
		public int velocidade;
		public int marcha;
	//metodo construtor padrao
		public MountainBike () {
			
		}
	//metodo construtor com parametro
		public MountainBike (int v, int m) {
			this.marcha = m;
			this.velocidade = v;
		}
	//metodos herdado InterfaceVeiculo
		@Override
		public void  mudarMarcha(int mar) {
			mar = mar +0;
			System.out.println("mudando a marcha" + mar );
		}
		@Override
		public void acelerar(int acer) {
			acer = acer +1;
			System.out.println("acelerando" + acer);
		}
		@Override
		public void frear (int fer) {
			fer = fer - 1 ;
			System.out.println("freiando" + fer);
		}
	//metodo da classe 
		public void estado (int v, int m,int acer,int fer  ) {
			System.out.println("\n acelerando: "+ acer+
					"\n marcha: "+m +"\n freiando: "+ fer+"\n velocidade: "+ v);
			
		}
	//metodos getters e setters 
		public int getVelocidade () {
			return  velocidade;
		}
		public void setVelocidade (int v1) {
			this.velocidade = v1;
		}
		public int getMarcha () {
			return marcha;
		}
		public void setMarcha (int m1) {
			this.marcha = m1;
		}

}
