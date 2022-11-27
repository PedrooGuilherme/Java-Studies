package edu.dio.java.begginers.bootcamp.sintaxe;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Teclado = new Scanner(System.in);
		while(true)
		{
			
			System.out.print("1 - Ligar              2 - Deligar"
					+ "\n>>");
			
			int statusTv = Teclado.nextInt();
			
			if(statusTv == 1) {
				
				System.out.print("Canal : ");
				int canal = Teclado.nextInt();
				
				System.out.print("Volume : ");
				int volume = Teclado.nextInt();
				
				SmartTV Controle1 = new SmartTV(canal,volume);
				Controle1.aumentarVolume(volume);
				Controle1.exibir();
			}
			else {
				SmartTV Controle1 = new SmartTV();
				Controle1.desligarTv();
				break;
			}
			
		}
		
	}

}