package br.org.sesisp.view;

import java.util.Scanner;

import br.org.sesisp.dao.CrudDAO;
import br.org.sesisp.model.Aluno;

public class TelaMain {

	public static void main(String[] args) {
		/*// intanciar um objeto da classe crudDAO
		CrudDAO inserir_aluno = new CrudDAO();
		// intanciar um objeto aluno 
		Aluno aluno1 = new Aluno ();
		aluno1.setNome ("José2");
		aluno1.setIdade (17);
		inserir_aluno.create(aluno1);
		System.out.println("Nome:" + aluno1.getNome () + " \n Idade: " + aluno1.getIdade());
		//******************************************************
		//Atulizar valores
		aluno1.setNome("Jose Vieira");
		aluno1.setIdade(18);
		aluno1.setRa(2);
		inserir_aluno.update(aluno1);
		System.out.println("Nome:" + aluno1.getNome() + "\n Idade: " + aluno1.getIdade() );
		//****************************************************
		//ler tabela alunos do BD
		System.out.println("lendo a lista..........");
		for (Aluno olho: inserir_aluno.read()) {
			System.out.println("Dados do aluno: "+  olho.getRa() +olho.getNome() + olho.getIdade());
		}
		
		
		//*********************************************************
		//excluir alunos
		CrudDAO al = new CrudDAO ();
		al.delete(5);*/
		
		//****************************************************************
		//Switch case
		CrudDAO inserir_aluno = new CrudDAO();
		Aluno aluno_1 = new Aluno ();
		int op;
		Scanner entrada = new Scanner (System.in);
		do {
			ExibirMenu ();
			op = entrada.nextInt();
			switch (op) {
			case 1:
				System.out.println("Digite um nome: ");
				String nome = entrada.next();
				aluno_1.setNome(nome);
				System.out.println("Digite uma idade: ");
				int idade = entrada.nextInt();
				aluno_1.setIdade(idade);
				inserir_aluno.create(aluno_1);
				System.out.println("Nome: " + aluno_1.getNome() + "/nIdade: " + aluno_1.getIdade());
				break;
			case 2:
				System.out.println("Escreva o RA: ");
				int ra1 = entrada.nextInt();
				aluno_1.setRa(ra1);
				System.out.println("Digite o novo nome: ");
				String nome1 = entrada.next();
				aluno_1.setNome(nome1);
				System.out.println("Digite a nova idade: ");
				int idade1 = entrada.nextInt();
				aluno_1.setIdade(idade1);
				inserir_aluno.update(aluno_1);
				System.out.println("Nome: " + aluno_1.getNome() + "/nIdade: " + aluno_1.getIdade());
				break;
			case 3:
				for (Aluno pr : inserir_aluno.read()) {
					System.out.println("nome : " + pr.getNome() + "\n "+"idade: " + pr.getIdade() +  "\n "+"ra: " + pr.getRa());
				}
				break;
			case 4 :
				CrudDAO remover_aluno = new CrudDAO();
				System.out.println("Digite o RA do aluno para deletar: ");
				entrada.nextLine();
				int ra = entrada.nextInt();
				aluno_1.setRa(ra);
				
				
				remover_aluno.delete(ra);
				
			default:
				break;
			}
		}while (op !=0);
		
		
		
	}

	private static void ExibirMenu() {
	System.out.println("Selecione uma opcao:");
	System.out.println("1-adicionar aluno");
	System.out.println("2-Atualizar");
	System.out.println("3-Visualizar");
	System.out.println("4-Deletar");
	System.out.println("o-Sair");
		
	}

	
	

}
