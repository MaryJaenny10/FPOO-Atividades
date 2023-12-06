package Atividades_Mary_Paixao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TesteVoo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("====VOO 1====");
		Cliente c1 = new Cliente () ;
		System.out.println("Adicione seu primeiro nome: ");
		String nome = entrada.next();
		c1.setNome(nome);
		System.out.println("Adicone seu sobrenome: ");
		String sobrenome= entrada.next();
		c1.setSobrenome(sobrenome);
		System.out.println("Adicione seu email: ");
		String email = entrada.next();
		c1.setEmail(email);
		Voo v1 = new Voo ();
		v1.setNumeroVoo("234");
		v1.setPreco(1500);
		v1.setOrigem("Campinas ");
		LocalDate dataIda = null;
		System.out.println("Digite a data de ida:  ");
		String dataV = entrada.next();
		dataIda= LocalDate.parse(dataV, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		v1.setDataIda(dataIda);
		LocalDate dataVolta = null;
		System.out.println("Digite a data de volta: ");
		String dataVi = entrada.next();
		dataVolta= LocalDate.parse(dataVi, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		v1.setDataVolta(dataVolta);
		v1.setDestino("Portugual");
		Passagem p1 = new Passagem ();
		p1.toString();
		v1.mostrarDetalhes();
		
		System.out.println("====VOO 2====");
		Cliente c2 = new Cliente () ;
		System.out.println("Adicione seu primeiro nome: ");
		String nome2 = entrada.next();
		c2.setNome(nome2);
		System.out.println("Adicone seu sobrenome: ");
		String sobrenome2= entrada.next();
		c2.setSobrenome(sobrenome2);
		System.out.println("Adicione seu email: ");
		String email2 = entrada.next();
		c2.setEmail(email2);
		Voo v2 = new Voo ();
		v2.setNumeroVoo("432");
		v2.setPreco(6000);
		v2.setOrigem("Sao Paulo ");
		LocalDate dataIda1 = null;
		System.out.println("Digite a data de ida:  ");
		String dataV1 = entrada.next();
		dataIda= LocalDate.parse(dataV, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		v2.setDataIda(dataIda);
		LocalDate dataVolta1 = null;
		System.out.println("Digite a data de volta: ");
		String dataVi1 = entrada.next();
		dataVolta1= LocalDate.parse(dataVi1, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		v2.setDataVolta(dataVolta1);
		v2.setDestino("Paris");
		c2.toString();
		v2.mostrarDetalhes();
		
		System.out.println("====VOO 3====");
		Cliente c3 = new Cliente () ;
		System.out.println("Adicione seu primeiro nome: ");
		String nome3 = entrada.next();
		c3.setNome(nome3);
		System.out.println("Adicone seu sobrenome: ");
		String sobrenome3= entrada.next();
		c3.setSobrenome(sobrenome3);
		System.out.println("Adicione seu email: ");
		String email3= entrada.next();
		c3.setEmail(email3);
		Voo v3 = new Voo ();
		v3.setNumeroVoo("324");
		v3.setPreco(5000);
		v3.setOrigem("Sao Paulo ");
		LocalDate dataIda2 = null;
		System.out.println("Digite a data de ida:  ");
		String dataV2 = entrada.next();
		dataIda= LocalDate.parse(dataV, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		v3.setDataIda(dataIda);
		LocalDate dataVolta2 = null;
		System.out.println("Digite a data de volta: ");
		String dataVi2 = entrada.next();
		dataVolta= LocalDate.parse(dataVi2, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		v3.setDataVolta(dataVolta2);
		v3.setDestino("Italia");
		c2.toString();
		v3.mostrarDetalhes();
		
		
		
	}

}
