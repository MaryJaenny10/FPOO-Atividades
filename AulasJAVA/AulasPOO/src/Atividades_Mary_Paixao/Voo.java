package Atividades_Mary_Paixao;

import java.time.LocalDate;

public class Voo {
			//atrbutos 
				private String numeroVoo;
				private String origem;
				private String destino;
				private double preco;
				private LocalDate dataIda;
				private LocalDate dataVolta ;
		//metodo constrtor padrao
				public Voo () {
				}
		//metodo conatrutor com parametro
				public Voo (String n, String o, String d, double p, LocalDate di,LocalDate dv) {
					this.numeroVoo = n;
					this.origem=o;
					this.destino=d;
					this.preco=p;
					this.dataIda=di;
					this.dataVolta=dv;
				}
		//getters e setter 
				public String getNumeroVoo() {
					return this.numeroVoo;
				}
				public void setNumeroVoo(String numeroVoo) {
					this.numeroVoo = numeroVoo;
				}
				public String getOrigem() {
					return this.origem;
				}
				public void setOrigem(String origem) {
					this.origem = origem;
				} 
				public String getDestino() {
					return this.destino;
				}
				public void setDestino(String destino) {
					this.destino = destino;
				}
				public double getPreco() {
					return this.preco;
				}
				public void setPreco(double preco) {
					this.preco = preco;
				}
				public LocalDate getDataIda() {
					return this.dataIda;
				}
				public void setDataIda(LocalDate dataIda) {
					this.dataIda = dataIda;
				}
				public LocalDate getDataVolta() {
					return this.dataVolta;
				}
				public void setDataVolta(LocalDate dataVolta) {
					this.dataVolta = dataVolta;
				}
				//public LocalDate dataEstaDisponivel () {
				//	return dataIda;
				//	}
				public void mostrarDetalhes () {
					System.out.println("====INFORMACOES DO VOO====");
					System.out.println("numero do voo: " + numeroVoo);
					System.out.println("origem: " + origem );
					System.out.println("destino: " + destino );
					System.out.println("preco: " + preco);
					System.out.println("Data de Ida:  " + dataIda );
					System.out.println("Data de volta: " + dataVolta);
				}

}
