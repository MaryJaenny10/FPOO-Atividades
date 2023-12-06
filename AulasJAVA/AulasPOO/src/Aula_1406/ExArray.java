package Aula_1406;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExArray {

	public static void main(String[] args) {
		int[ ] notas = new int [2];
		int i;
		Scanner entrada = new Scanner (System.in);
		for( i=0; i<2; i++) {
			System.out.println("/n Entre com o numero"+ (i+1) +":");
			notas[ i ] = entrada.nextInt(  );
			}
		for ( i = 0; i < 2; i++ ) {
			System.out.printf (" numero %d --> nota armazenada: %d " ,( i + 1), notas[ i ]);
		}
		int soma = 0;
		for ( i = 0; i < 2; i++) {
			soma = soma +notas [ i ];
			}
		int media = soma / notas.length;
			System.out.println("a media das notas e:" + media);
	}
}
	/*	String a;
		String b;
		
		int c;
		int d;
		
		a= JOptionPane.showInputDialog("nota 1");
		b= JOptionPane.showInputDialog("nota 2");
		
		c= Integer.parseInt(a);
		d= Integer.parseInt(b);
		
		int[ ] notas = {c,d};
		for ( int e : notas) {
			System.out.println("as notas sao "+ e);
		}
		
			

	}

}*/
