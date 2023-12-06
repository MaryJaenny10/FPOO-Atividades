package ProdutosCabelo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

		
		public class TesteProdutosCabelo {
		

		
			public static void main(String[] args) {
				Scanner entrada = new Scanner(System.in);
				Reconstrucao r1= new Reconstrucao ();
				System.out.println("nome da mascara de reconstrucao: ");
				String nome = entrada.next();
				r1.setNome(nome);
				System.out.println("peso: ");
				double peso= entrada.nextDouble();
				r1.setPeso(peso);
				System.out.println("marca: ");
				String marca= entrada.next();
				r1.setMarca(marca);
				entrada.nextLine();
				LocalDate v1;
				LocalDate f1;
				System.out.println("data de validade: ");
				String dataV = entrada.next();
				v1= LocalDate.parse(dataV, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
				r1.setDatav(v1);
				System.out.println("data de fabricacao: ");
				String dataV1 = entrada.next();
				f1= LocalDate.parse(dataV1, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
				r1.setDataf(f1);
				Hidratacao h1 = new Hidratacao( );
				System.out.println("mascara de hidratacao: ");
				String nome1= entrada.next();
				h1.setNome(nome1);
				System.out.println("peso: ");
				double peso1= entrada.nextDouble();
				h1.setPeso(peso1);
				System.out.println("marca: ");
				String marca1= entrada.next();
				h1.setMarca(marca1);
				entrada.nextLine();
				LocalDate v2;
				LocalDate f2;
				System.out.println("data de validade: ");
				String dataV2 = entrada.next();
				v2= LocalDate.parse(dataV2, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
				h1.setDatav(v2);
				System.out.println("data de fabricacao: ");
				String dataV3 = entrada.next();
				f2= LocalDate.parse(dataV3, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
				h1.setDatav(f2);
				Nutricao N1 = new Nutricao();
				System.out.println("mascara de nutricao: ");
				String nome2= entrada.next();
				N1.setNome(nome2);
				System.out.println(" peso: ");
				double peso2= entrada.nextDouble();
				N1.setPeso(peso2);
				System.out.println(" marca: ");
				String marca2= entrada.next();
				N1.setMarca(marca2);
				entrada.nextLine();
				LocalDate v3;
				LocalDate f3;
				System.out.println("data de validade: ");
				String dataV4 = entrada.next();
				v3= LocalDate.parse(dataV4, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
				N1.setDatav(v3);
				System.out.println("data de fabricacao: ");
				String dataV5 = entrada.next();
				f3= LocalDate.parse(dataV5, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
				N1.setDataf(f3);

				List<ProdutoCabelo> list_produto = new ArrayList<ProdutoCabelo>();
				
				list_produto.add(r1);
				list_produto.add(h1);
				list_produto.add(r1);

				for (ProdutoCabelo pc : list_produto) {
					System.out.println("Nome: "+ pc.getNome() +" peso: "+ pc.getPeso() +" data de fabricacao: "+ pc.getDataf() +" data de validade: "+ pc.getDatav() +" marca: "+ pc.getMarca());
				

				}
	}
	

}
