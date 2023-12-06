package Atividades_Mary_Paixao;

public class Passagem {
	private Voo voo;
	private Cliente cliente;
	private double precoTotal;

	public Passagem () {
	}
	public Passagem (Voo v,Cliente c,double p ) {
		this.voo=v;
		this.cliente=c;
		this.precoTotal=p;
	}
	public Voo getVoo() {
		return this. voo;
	}
	public void setVoo(Voo voo) {
		this.voo = voo;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Cliente getCliente() {
		return this.cliente;
	} 
	public double getPrecoTotal() {
		return this.precoTotal;
	}
	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
	public String toString () {
		return ("Cliente" + cliente+ cliente +
						"Numero do Voo" + voo+ 
						"Destino" + voo + 
						"Preco Total" + voo );
		
	}
}
