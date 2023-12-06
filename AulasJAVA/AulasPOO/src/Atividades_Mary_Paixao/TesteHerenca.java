package Atividades_Mary_Paixao;

import java.util.Scanner;

public class TesteHerenca {

	public static void main(String[] args) {
		//atributos 
			Aluno aluno1 = new Aluno();
			Aluno aluno2 = new Aluno();
			Professor professor1 = new Professor();
			Professor professor2 = new Professor();
	
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("------------aluno 1-----------");
			System.out.println("digite seu nome:");
			String nome = entrada.next ();
			aluno1.setNome(nome);
			System.out.println("digite seu endereco");
			String endereco = entrada.next();
			aluno1.setEndereco(endereco);
			System.out.println("digite seu telefone");
			int telefone = entrada.nextInt();
			aluno1.setTelefone(telefone);
			System.out.println("digite seu cpf");
			int cpf = entrada.nextInt();
			aluno1.setCpf(cpf);
			System.out.println("digite seu numero de celular");
			int celular = entrada.nextInt();
			aluno1.setCelular(celular);
			System.out.println("digite seu curso ");
			String curso = entrada.next();
			aluno1.setCurso(curso);
			aluno1.CalcularMedia();
			aluno1.AtingiuMedia();
			
			System.out.println("---------------aluno 2------------------");
			
			System.out.println("digite seu nome:");
			String nome1 = entrada.next ();
			aluno2.setNome(nome1);
			System.out.println("digite seu endereco");
			String endereco1 = entrada.next();
			aluno2.setEndereco(endereco1);
			System.out.println("digite seu telefone");
			int telefone1 = entrada.nextInt();
			aluno2.setTelefone(telefone1);
			System.out.println("digite seu cpf");
			int cpf1 = entrada.nextInt();
			aluno2.setCpf(cpf1);
			System.out.println("digite seu numero de celular");
			int celular1 = entrada.nextInt();
			aluno2.setCelular(celular1);
			System.out.println("digite seu curso");
			String curso1 = entrada.next();
			aluno2.setCurso(curso1);
			aluno2.CalcularMedia();
			aluno2.AtingiuMedia();
			
			System.out.println("----------professor 1-----------------");
			
			System.out.println("digite seu nome ");
			String nome2 = entrada.next();
			professor1.setNome(nome2);
			System.out.println("digite seu endereco");
			String endereco2 = entrada.next();
			professor1.setEndereco(endereco2);
			System.out.println("digite seu telefone");
			int telefone2 = entrada.nextInt();
			professor1.setTelefone(telefone2);
			System.out.println("digite seu cpf");
			int cpf2 = entrada.nextInt();
			professor1.setCpf(cpf2);
			System.out.println("digite seu numero de celular");
			int celular2 = entrada.nextInt();
			professor1.setCelular(celular2);
			System.out.println("digite seu curso");
			String curso2 = entrada.next();
			professor1.setNomeCurso(curso2);

			System.out.println("------------professor 2----------------");
			
			System.out.println("digite seu nome ");
			String nome3 = entrada.next();
			professor2.setNome(nome3);
			System.out.println("digite seu endereco");
			String endereco3 = entrada.next();
			professor2.setEndereco(endereco3);
			System.out.println("digite seu telefone");
			int telefone3= entrada.nextInt();
			professor2.setTelefone(telefone3);
			System.out.println("digite seu cpf");
			int cpf3 = entrada.nextInt();
			professor2.setCpf(cpf3);
			System.out.println("digite seu numero de celular");
			int celular3 = entrada.nextInt();
			professor2.setCelular(celular3);
			System.out.println("digite seu curso");
			String curso3 = entrada.next();
			professor2.setNomeCurso(curso3);
	}
	

}
