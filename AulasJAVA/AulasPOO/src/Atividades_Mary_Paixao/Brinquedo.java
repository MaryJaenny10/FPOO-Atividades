package Atividades_Mary_Paixao;

public class Brinquedo {
	
			private String nome;
			private double alturaMinima;
			private int capacidadeMaxima;
			
			public Brinquedo(String string, double d, int i) {
			}
			public String getNome () {
				return nome;
			}
			public void setNome (String m) {
				this.nome = m;
			}
			public double getAlturaminima () {
				return alturaMinima;
			}
			public void setAtulraminima (double al) {
				this.alturaMinima = al;
			}
			public int getCapacidademaxima() {
				return capacidadeMaxima;
			}
			public void setCapacidademaxima (int c) {
				this.capacidadeMaxima = c;
			}
			public void exibirInfo () {
			System.out.println("nome" + nome+ "alturaMinima" + alturaMinima + 
					"capacidadeMaxima" + capacidadeMaxima);
			}
}
