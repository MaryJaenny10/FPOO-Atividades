package Atividades_Mary_Paixao;

public class Cachorro {
		//atributos 
			private String nome;
			private float peso;
			private char sexo;
			private int QtdPatas;
			public Cachorro(String n, float  p, char s, int q) {
				this.nome=n;
				this.peso = p;
				this.sexo=s;
				this.QtdPatas=q;
				
			}
			public String getNome() {
				return this.nome;
			}
			public void setNome (String n) {
				this.nome = n;
			}
			public float getPeso() {
				return this.peso;
			}
			public void setPeso(float p) {
				this.peso = p;
			}
			public char getSexo() {
				return this.sexo;
			}
			public void setSexo (char s) {
				this.sexo = s;
			}
			public int  getQtdPatas() {
				return this.QtdPatas;
			}
			public void setQtdPatas (int q) {
				this.QtdPatas = q;
			}
			//metodos 
			public void latir () {
				System.out.println("latindo...");
			}
			public void correr () {
				System.out.println("correndo.....");
			}
			public void dormir () {
				System.out.println("dormindo.....");
			}
			public void brincar () {
				System.out.println("brincando.....");
			}
			
}

