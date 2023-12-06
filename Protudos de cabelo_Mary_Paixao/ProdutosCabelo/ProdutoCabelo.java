package ProdutosCabelo;

import java.time.LocalDate;

public class ProdutoCabelo {
		private String nome;
		private double peso;
		private LocalDate dataf;
		private LocalDate datav;
		private String marca;
	
		public ProdutoCabelo () {
		}

		public ProdutoCabelo(String nome, double peso, LocalDate dataf, LocalDate datav, String marca) {
			this.nome = nome;
			this.peso = peso;
			this.dataf = dataf;
			this.datav = datav;
			this.marca = marca;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getPeso() {
			return peso;
		}
		public void setPeso(double peso) {
			this.peso = peso;
		}
		public LocalDate getDataf() {
			return dataf;
		}
		public void setDataf(LocalDate dataf) {
			this.dataf = dataf;
		}
		public LocalDate getDatav() {
			return datav;
		}
		public void setDatav(LocalDate datav) {
			this.datav = datav;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public void objetivo () {
			
		}
		
}
