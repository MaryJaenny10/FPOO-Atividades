package ProdutosCabelo;

public class Mercado {	
			private SetorBeleza setorBeleza;
			
			public Mercado () {
				
			}

			public Mercado(SetorBeleza setorBeleza) {
		
				this.setorBeleza = setorBeleza;
			}
			public SetorBeleza getSetorBeleza() {
				return setorBeleza;
			}
			public void setSetorBeleza(SetorBeleza setorBeleza) {
				this.setorBeleza = setorBeleza;
			}
			public void exibirProdutosSetorBeleza () {
				System.out.println("");
			}
}
