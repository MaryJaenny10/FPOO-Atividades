package Atividades_Mary_Paixao;


public class TesteAcademia {

	public static void main(String[] args) {
		Academia c1 = new Academia();
		c1.NomeCompleto = "Mary Jaenny";
		System.out.println(c1.NomeCompleto);
		c1.setIdade(25);
		System.out.println(c1.getIdade());
		c1.altura = (1.70);
		System.out.println(c1.getAltura());
		c1.telefone = (19989);
		System.out.println(c1.getTelefone());
		c1.peso = (65.2);
		System.out.println(c1.getPeso());
		c1.CPF =(46203);
		System.out.println(c1.getCpf());
	}

}
