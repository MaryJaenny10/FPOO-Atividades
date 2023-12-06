package Atividades_Mary_Paixao;

public class ProdutoPadaria implements InterfaceProduto {
	//atributos
		private String nome;
		private double preco; 
		//metodo construtor padrao
		public ProdutoPadaria () {
		}
	//metodo construtor com parametro 
		public ProdutoPadaria (String n, double p) {
			this.nome = n;
			this.preco = p;
			}
	//metodos herdados da InterfaceProduto
		@Override
		public String getNome() {
			return nome;
		}
		@Override
		public void setNome (String n) {	
			this.nome = n;
		}
		@Override
		public double getPreco() {
			return preco;
		}
	
		@Override
		public void setPreco(double p) {
			this.preco = p;
		}
		public void exibir (double p, String n) {
			System.out.println(" nome:  " + nome + "\n preco: " + preco);
			
		}
		

	
		

}
