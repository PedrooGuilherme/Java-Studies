package edu.dio.java.begginers.bootcamp.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
	/*
/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
*/
	public static void main(String[] args) {
		
		Scanner Teclado = new Scanner(System.in);//Abertura da entrada de fluxo de dados através do teclado
		// Variáveis utilizadas ao longo do programa. - DECLARAÇÃO -
		int numero,fatorial = 1;
		
		System.out.print("Digite um número: ");
		numero = Teclado.nextInt();
		System.out.println("--------------------");
		System.out.println("   Fatorial de "+ numero+":");
		System.out.println("--------------------");
		System.out.print(numero + "! = ");
		
		//para: variável i = numero, até i maior que 0, diminuimos 1 ao valor de i a cada loop.
		for (int i = numero;i >= 1;i --)//multiplicamos os valores de i e armazenamos na variável multiplicação
		{
			fatorial = fatorial * i;
	
			if(i == 1)System.out.print(i + " = "+ fatorial);
			
			else System.out.print(i + " . ");
		}
		 
	}

}