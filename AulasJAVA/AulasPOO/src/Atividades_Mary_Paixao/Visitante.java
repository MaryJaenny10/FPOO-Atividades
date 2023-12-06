package Atividades_Mary_Paixao;

public class Visitante {
	
			private String nome;
			private int idade;
			private double altura;
			
			public boolean podeAndarNoBrinquedo(int idade, double altura) {
		           if (idade >= 10 && altura >= 1.3) {
		               return true;
		     } else {
		               return false;
		     }
			}
			public String getNome() {
				return nome;
			}
			public void setNome (String n) {
				this.nome = n;
			}
			public int getIdade () {
				return idade;
			}
			public void setIdade (int i) {
				this.idade = i;
			}
			public double getAltura () {
				return altura;
			}
			public void setAltura ( double a) {
				this.altura = a;
			}
}

