package Atividades_Mary_Paixao;

public class Academia {
	
	public  double  CPF;
	public String NomeCompleto;
	public double  telefone;
	private int idade;
	public double altura;
	public  double  peso;
		
	public  double  getCpf () {
		return CPF;
	}
	public void setCpf (double  c) {
		CPF =c;
	}
	public  String getNomeCompleto () {
		return NomeCompleto;
	}
	public  void setNomeCompleto (String n) {
		NomeCompleto = n;
	}
	public double getTelefone () {
		return telefone;
	}
	public void setTelefone( double  t) {
		telefone = t;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade ( int i) {
		idade = i;
	}
	public double  getAltura () {
		return altura;
	}
	public void setAltura ( double  a) {
		altura = a;
	}
	public  double getPeso() {
		return peso;
	}
	public  void setPeso (double  p) {
		peso = p;
	}
	public void calcular_IMC () {
		double  resultado = peso / (altura*altura);
		System.out.println("resultado"+ resultado );
	
	}

}
