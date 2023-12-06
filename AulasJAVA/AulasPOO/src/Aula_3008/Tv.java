package Aula_3008;

public class Tv implements ControleRemoto {
	//metodos do ControleRemoto
			@Override
			public void ligar() {
				System.out.println("ligando....");
			}
			@Override
			public void desligar() {
				System.out.println("desligando...");
			}
			@Override
			public void volumeMais(int vol) {
				vol = vol + 1;
				System.out.println("aumentando o volume:" + vol);
			}
			@Override
			public void volumeMenos(int vol) {
				vol = vol - 1 ; 
				System.out.println("diminuindo o volume:" + vol);
			}
			@Override
			public int getPolegada() {
				return 65;
			}
			
		
}
