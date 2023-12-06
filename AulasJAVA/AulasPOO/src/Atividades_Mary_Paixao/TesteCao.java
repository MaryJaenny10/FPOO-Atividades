package Atividades_Mary_Paixao;

public class TesteCao {

	public static void main(String[] args) {

		
				Cachorro c1 = new Cachorro ("Du",25 , 'M', 4);
				Cachorro c2 = new Cachorro ("Luck", 40, 'M', 4);
				Cachorro c3= new Cachorro ("Mara", 55, 'F', 4);
				System.out.println("nome do cao: " + c1.getNome()+
						"\n qual o peso: " + c1.getPeso() + "\n qual o sexo: "+c1.getSexo()+ 
						"\n quantidade de patas: "+c1.getQtdPatas());
					c1.latir();
					c1.correr();
					c1.dormir();
					c1.brincar();
					System.out.println("----2 cao----");
					System.out.println("nome do cao: " + c2.getNome()+
							"\n qual o peso: " + c2.getPeso() + "\n qual o sexo: "+c2.getSexo()+ 
							"\n quantidade de patas: "+c2.getQtdPatas());
						c2.latir();
						c2.correr();
						c2.dormir();
						c2.brincar();
						
						System.out.println("----3 cao----");
						System.out.println("nome do cao: " + c3.getNome()+
								"\n qual o peso: " + c3.getPeso() + "\n qual o sexo: "+c3.getSexo()+ 
								"\n quantidade de patas: "+c3.getQtdPatas());
							c3.latir();
							c3.correr();
							c3.dormir();
							c3.brincar();
		}

	}

