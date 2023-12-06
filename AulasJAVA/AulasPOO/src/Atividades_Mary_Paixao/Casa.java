package Atividades_Mary_Paixao;

public class Casa {
			//atributos 
			private String cor;
			private float preco;
			private float metragem;
			private Sala sala;
			private Quarto  quarto;
			private int q1;
			private int sa;
			//metodo construtor padrao
			public Casa() {
			}
			//metodo construtor com parametro 
			public Casa (String c, float p , float m) {
				this.cor=c;
				this.preco=p;
				this.metragem=m;
			}
			//getters e setters 
			public String getCor () {
				return this.cor;
			}
			public void setCor (String c) {
				this.cor=c;
			}
			public float getPreco () {
				return this.preco;
			}
			public void setPreco (float p) {
				this.preco=p;
			}	
			public float getMetragem  () {
				return this.metragem;
			}
			public void setMetragem  (float m) {
				this.metragem=m;
			}
			public Sala getSala() {
				return this.sala;
			}
			public void setSala (Sala s) {
				this.sala=s;
			}
			public Quarto getQuarto() {
				return this.quarto;
			}
			public void setQuarto (Quarto q) {
				this.quarto=q;
			}
			public int getQ1() {
				return this.q1;
			}
			public void setQ1 (int q1) {
				this.q1=q1;
			}
			public int getSa() {
				return this.sa;
			}
			public void setSA (int sa) {
				this.sa=sa;
			}
		
			public void mostrarDetalhes() {
			System.out.println("qual a cor: " + cor + "\n qual o preco: " +preco+ "\nqual a metragem: " + metragem +"\nqual o numero de camas:  "+ q1+ "\n tem tv: "+ sa );
			}
}
