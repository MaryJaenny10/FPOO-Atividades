package Aula_1906;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Excecao6 {

	public static void main(String[] args) {
		try {
			 File arquivo = new File ("C:/Users/Instrutor/Desktop/texto.txt");
			 Scanner entrada = new Scanner ( arquivo, " UTF-8");
			 while ( entrada.hasNextLong()) {
				 String linha = entrada.nextLine();
				 System.out.println(" texto do arqivo: " + linha );
			 }
			 entrada.close();
			 } catch (FileNotFoundException e ) {
				 	System.out.println( " o arquivo nao foi encontrado!");
		}catch (Exception e ) {
					System.out.println(" ocorreu um erro drante a leitura do arquivo " +e.getMessage());
		}
			System.out.println(" o programa foi encerrado ");
	}

}
