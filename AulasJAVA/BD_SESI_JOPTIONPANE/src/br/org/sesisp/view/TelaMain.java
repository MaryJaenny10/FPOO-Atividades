package br.org.sesisp.view;

import java.util.Scanner;
import javax.swing.JOptionPane;
import br.org.sesisp.dao.CrudDAO;
import br.org.sesisp.model.Aluno;

public class TelaMain {

	public static void main(String[] args) {
		CrudDAO inserir_aluno = new CrudDAO();
		Aluno aluno_1 = new Aluno ();
		String opcao;
		int op;
		Scanner entrada = new Scanner (System.in);
		do {
			opcao = JOptionPane.showInputDialog("Selecione uma opcao: " + "\n 1- Inserir aluno " + "\n 2- Atualizar  Aluno " + "\n 3-Visualizar " +"\n 4-	Deletar "  );
			op = Integer.parseInt(opcao);
			switch (op) {
			case 1:
				String nome;
				 nome = JOptionPane.showInputDialog("Digite um nome: ");
				aluno_1.setNome(nome);
				String  idade =  JOptionPane.showInputDialog("Digite um idade: ");
				int i = Integer.parseInt(idade);
				aluno_1.setIdade(i);
				inserir_aluno.create(aluno_1);
				break;
			case 2:
				String nome1 = JOptionPane.showInputDialog("Digite um nome: ");
				aluno_1.setNome(nome1);
				String  idade1 =  JOptionPane.showInputDialog("Digite uma idade: ");
				int i1 = Integer.parseInt(idade1);
				aluno_1.setIdade(i1);
				String ra = JOptionPane.showInputDialog("Digite um Ra: ");
				int ra1 = Integer.parseInt(ra);
				aluno_1.setRa(ra1);
				inserir_aluno.update(aluno_1);
				break;
			case 3:
				for (Aluno pr : inserir_aluno.read()) {
					System.out.println("nome : " + pr.getNome() + "\n "+"idade: " + pr.getIdade() +  "\n "+"ra: " + pr.getRa());
				}
				break;
			case 4 :
				CrudDAO remover_aluno = new CrudDAO();
			
				String ra2 = JOptionPane.showInputDialog("Digite um Ra: ");
				int ra21 = Integer.parseInt(ra2);
				aluno_1.setRa(ra21);
				
			
				remover_aluno.delete(ra21);
			
				
			default:
				break;
			}
		}while (op !=0);
		
		
		
	}

	

	
	

}
