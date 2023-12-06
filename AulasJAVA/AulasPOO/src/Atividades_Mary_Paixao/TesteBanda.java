package Atividades_Mary_Paixao;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class TesteBanda {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
				Banda b1 = new Banda () ;
				Vocalista v1 = new Vocalista();
				System.out.println("qual o nome do Vocalista: ");
				String nome = entrada.next();
				v1.setNome(nome);
				Baixista ba1 = new Baixista();
				System.out.println("qual o nome do Baixista:  ");
				String nome1 = entrada.next();
				ba1.setNome(nome);
				Baterista bat1 = new Baterista();
				System.out.println("qual o nome Baterista: ");
				String nome2 = entrada.next();
				bat1.setNome(nome);
				Guitarrista gui1 = new Guitarrista();
				System.out.println("qual o nome do Guitarrista: ");
				String nome3 = entrada.next();
				gui1.setNome(nome);
				
				List<MembroBanda> membros = new ArrayList<MembroBanda>();
				membros.add(v1);
				membros.add(ba1);
				membros.add(bat1);
				membros.add(gui1);
				for (MembroBanda olho :membros) {
					System.out.println("nome: " + olho.getNome() );
				}
				b1.realizarShow();
				System.out.println("Vocalista esta: ");
				v1.tocar();
				System.out.println("O baixixta esta: ");
				ba1.tocar();
				System.out.println("O baterista esta: ");
				bat1.tocar();
				System.out.println("O guitarrista esta: ");
				gui1.tocar();
				Banda b2 = new Banda () ;
			
				

	}

}
