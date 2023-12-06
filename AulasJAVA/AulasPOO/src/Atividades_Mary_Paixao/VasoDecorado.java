package Atividades_Mary_Paixao;

public class VasoDecorado  extends Vaso {
			//atributos 
			private String decoracao;
			 //metodo construtor 
				public VasoDecorado () {
					super ();
					System.out.println("");
				}
			// metodos construtor com parametro 
				public VasoDecorado  ( String decoracao) {
					super ();
					this.decoracao = decoracao;
					System.out.println("vaso decorado");
				}
				//metodo 
				public String getVasodecorado () {
					return decoracao;
				}
				public void setVasodecorado(String decoracao) {
					this.decoracao = decoracao;
				}
				public void exibirInfo1 (String decoracao) {
					System.out.println("decoracao " + decoracao  );
					}
}
