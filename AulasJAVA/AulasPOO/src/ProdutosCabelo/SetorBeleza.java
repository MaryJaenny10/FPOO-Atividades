package ProdutosCabelo;

public class SetorBeleza {
		private ProdutoCabelo produtoCabelo;
		
		public SetorBeleza () {
			
		}

		public SetorBeleza(ProdutoCabelo produtoCabelo) {
			this.produtoCabelo = produtoCabelo;
		}
		public ProdutoCabelo getProdutoCabelo() {
			return produtoCabelo;
		}
		public void setProdutoCabelo(ProdutoCabelo produtoCabelo) {
			this.produtoCabelo = produtoCabelo;
		}
}
