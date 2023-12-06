package Atividades_Mary_Paixao;

import java.util.Scanner;

public class Album2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n = entrada.nextInt(); //qantidade de espaço no album 
		int m = entrada.nextInt();//quantidade d figrinha coladas 
		//booleana 
		Boolean [] ja_tenho =  new Boolean [n]; //tru ou false 
		int x = 0; // figurinhas compradas 
		//varrendo o vetor 
		for ( int i = 0; i < n; i++)
			ja_tenho [i] = false;
		//figuriha qe ja temos
		for ( int i = 0; i < m ; i++ ) {
			x = entrada.nextInt();
				ja_tenho[ x ] = true;
		}
		int repetidas = 0;
		//vamos marca as repetidas 
		for ( int i = 0; i < n; i++)
			if ( ja_tenho [i])
				repetidas = repetidas ++; //++ é = a +1
			// vamos contar a quantidade de figrinhas repetidas 
			System.out.println("quantiade de figurinhas repetidas =" +( n - repetidas ));
			System.out.println("tamanho album =" + n);
			System.out.println(" quantidade de figurinhas =" + m );
			
			
	}

}
