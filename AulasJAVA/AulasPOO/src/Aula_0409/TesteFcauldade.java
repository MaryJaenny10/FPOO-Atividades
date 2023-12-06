package Aula_0409;

import java.util.List;
import java.util.ArrayList;


public class TesteFcauldade {

	public static void main(String[] args) {
		//instancia da classe estudante
				Estudante e1 = new Estudante ("Joao" ,10 ,"TIA");
				Estudante e2 = new Estudante ("Maria" ,20 ,"TIB");
				Estudante e3 = new Estudante ("Lucas" ,100 ,"EE");
				Estudante e4 = new Estudante ("Ana" ,150 ,"EPC");
		//criando uma lista vazia de estudante
				List <Estudante> eTI = new ArrayList<Estudante>();
		//ad os alunos criados na lista
				eTI.add(e1);
				eTI.add (e2);
		//mostrando alunos que estao na lista
				int i2 =0;
				for (Estudante estudante : eTI) {
					System.out.printf("Posicao %d-%s %d %s", i2, estudante.nome, estudante.ra, estudante.curso);
					i2++;
				}
	//vamos adicionar os alunos e3 e e4 na lista NOVA
				List<Estudante> eEE =new ArrayList<Estudante>();
				eEE.add(e3);
				eEE.add(e4);
	//instancia da classe TURMA
				Turma TIA = new Turma ("TI", eTI);
				Turma EE = new Turma ("EngE", eEE);
	//agora criei uma lista de turma para adicionar os alunos a ela
				List <Turma > tur = new ArrayList<Turma>();
				tur.add (TIA);
				tur.add(EE);
	//ler lista e verificar quais alunos estao nela 
				for (int i = 0; i <tur.size(); i++) {
					System.out.println("nome das turmas: " + tur.get(i).getNome());
				}
	//instancia da classe Faculdade
				Faculdade senai = new Faculdade ("SENAI", tur);
				System.out.println("total de estudantes da faculdade e:");
				System.out.println(senai.getTotalEstudante());
				

	}

}
