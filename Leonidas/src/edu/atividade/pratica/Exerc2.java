package edu.atividade.pratica;

import java.util.Scanner;

public class Exerc2{

	public static void main(String[] args) {
		// Dates
		double Advinhacao;
		
		// Inputs
		Scanner Teclado = new Scanner(System.in);
		System.out.printf("Digite seu palpite: ");
		Advinhacao = Teclado.nextDouble();
		// Processing
		while(Advinhacao != 10000)
		{
			if (Advinhacao > 10000) 
			{
				System.out.println("Acima do esperado");
			}
			else
			{
				System.out.println("Abaixo do esperado");
			}
			System.out.printf("Digite outro palpite: ");
			Advinhacao = Teclado.nextDouble();
			
		}
		System.out.println("Você Acertou!Boa!");
		// Dates
	
		
		}
	}
	