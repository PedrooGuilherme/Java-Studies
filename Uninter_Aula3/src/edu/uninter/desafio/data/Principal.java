package edu.uninter.desafio.data;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Teclado = new Scanner(System.in);
		System.out.println("Digite o dia: ");
		int dia = Teclado.nextInt();
		
		System.out.println("Digite o mês: ");
		int mes = Teclado.nextInt();
		
		System.out.println("Digite o ano: ");
		int ano = Teclado.nextInt();
		
		Data festaDeAniversario = new Data();
		
		festaDeAniversario.setDia(dia);
		festaDeAniversario.setMes(mes);

	}

}
