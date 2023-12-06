package Aula_0409;

public class TesteEmpregado {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa ("gerente", "Maria", 30);
		Empregado1 e1 = new Empregado1 ();
		Empregado1 e2 = new Empregado1 (1500,p1);
		System.out.println("cargo: "+ p1.cargo);
		System.out.println("salario: "+e2.getSalario());
	}

}
