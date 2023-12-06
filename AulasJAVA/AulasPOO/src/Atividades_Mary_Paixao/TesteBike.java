package Atividades_Mary_Paixao;

import java.util.Scanner;

public class TesteBike {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
				System.out.println("----PRIMEIRA BIKE----");
				MountainBike bk1 = new MountainBike ();
				System.out.println("acelerando");
				int acelerar = entrada.nextInt();
				bk1.acelerar(acelerar);
				System.out.println(" marcha ");
				int marcha = entrada.nextInt();
				bk1.setMarcha(marcha);
				System.out.println("freiando");
				int frear = entrada.nextInt();
				bk1.frear(frear);
				System.out.println(" velocidade");
				int velocidade = entrada.nextInt();
				bk1.setVelocidade(velocidade);
				bk1.estado(acelerar, marcha, frear, velocidade);
				
			//bike 2 MountainBike
				MountainBike bk2 = new MountainBike ();
				System.out.println("----SEGUNDA BIKE----");
				
				System.out.println("acelerando");
				int acelerar1 = entrada.nextInt();
				bk2.acelerar (acelerar1);
				System.out.println("marcha");
				int marcha1 = entrada.nextInt();
				bk2.setMarcha(marcha1);
				System.out.println("freiando");
				int frear1 = entrada.nextInt();
				bk2.frear(frear1);
				System.out.println("velocidade");
				int velocidade1 = entrada.nextInt();
				bk2.setVelocidade(velocidade1);
				bk2.estado(acelerar1,  marcha1, frear1,velocidade1);
				
			//bik 1 SpeedBike
				SpeedBike bk3 = new SpeedBike();
				System.out.println("----TERCEIRA BIKE----");
				
				System.out.println("acelerando");
				int acelerar2 = entrada.nextInt();
				bk3.acelerar (acelerar2);
				System.out.println("marcha");
				int marcha2 = entrada.nextInt();
				bk3.setMarcha(marcha2);
				System.out.println("freiando");
				int frear2 = entrada.nextInt();
				bk3.frear(frear2);
				System.out.println("velocidade");
				int velocidade2 = entrada.nextInt();
				bk3.setVelocidade(velocidade2);
				bk3.estado(acelerar2, marcha, frear2, velocidade2);
				
		//bike 2 SpeedBike
				SpeedBike bk4 = new SpeedBike();
				System.out.println("----QUARTA BIKE----");
				
				System.out.println("acelerando");
				int acelerar3 = entrada.nextInt();
				bk4.acelerar (acelerar3);
				System.out.println("marcha");
				int marcha3 = entrada.nextInt();
				bk4.setMarcha(marcha3);
				System.out.println("freiando");
				int frear3 = entrada.nextInt();
				bk4.frear(frear3);
				System.out.println("velocidade");
				int velocidade3 = entrada.nextInt();
				bk4.setVelocidade(velocidade3);
				bk4.estado(acelerar2, marcha3, frear3, velocidade3);
				
				
	}

}
