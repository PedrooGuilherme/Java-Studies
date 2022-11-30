package edu.dio.java.begginers.bootcamp.loops;

import java.util.Scanner;

public class Ex5_TabuadaMultiplicacao {
	/*
	Desenvolva um gerador de tabuada,
	capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
	O usuário deve informar de qual numero ele deseja ver a tabuada.
	A saída deve ser conforme o exemplo abaixo:
	Tabuada de 5:
	5 X 1 = 5
	5 X 2 = 10
	...
	5 X 10 = 50
	*/
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		while(true) {
			
			System.out.print("Digite um número: ");
			numero = teclado.nextInt();
			boolean numeroValido = numero >= 1 && numero <= 10;
			
			if(numeroValido) break;
			
			System.out.println("Número Inválido.Digite novamente!");
			
		}
		System.out.println("-------------------");
		System.out.println("Tabuada de "+ numero);
		System.out.println("-------------------");
		for(int i = 1 ; i <= 10;i++ ) {
			int multiplicacao = numero * i;
			System.out.printf("%d * %d = %d\n",numero,i,multiplicacao);
		}

	}

}
