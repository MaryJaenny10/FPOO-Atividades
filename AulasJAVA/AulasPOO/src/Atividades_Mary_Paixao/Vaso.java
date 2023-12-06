package Atividades_Mary_Paixao;

public class Vaso  {
			
		private String cor;
		private double tamanho;
		private String material;
		// metodo construtor 
				public Vaso () {
					super();
					System.out.println("");
				}
		//metodo construtor com parametro 
				public Vaso (String cor, String material ) {
					super ();
					this.cor = cor;
					this.material = material;
					System.out.println("VASO FEITO");
				}
				public Vaso (double tamanhol) {
					super ();
					this.tamanho = tamanho;
					System.out.println(" tamanho do vaso ");
				}
				
		// metodo 
				public  String getCor () {
					return cor;
				}
				public void setCor (String cor) {
					this.cor = cor;
				}
				public double getTamanho () {
					return tamanho;
				}
				public void setTamanho (double tamanho ) {
					this.tamanho = tamanho;
				}
				public String getMaterial () {
					return material;
				}
				public void setMaterial (String material ) {
					this.material = material;
				}
				public void exibirInfo (String cor , String material, double tamanho) {
					System.out.println("cor: " + cor + "\ntamanho: " + tamanho  + "\n material " + material );
					}
}
