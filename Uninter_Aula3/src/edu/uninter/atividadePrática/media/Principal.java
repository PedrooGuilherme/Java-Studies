package edu.uninter.atividadePrática.media;

import java.util.Scanner;

public class Principal {
	
	
	public static void main(String [] args) {
		Nota Aluno = new Nota();
		Scanner Teclado = new Scanner(System.in);
		System.out.print("Nota 1: ");
		int nota1 = Teclado.nextInt();
		Aluno.setNota1(nota1);
		
		System.out.print("Nota 2: ");
		int nota2 = Teclado.nextInt();
		Aluno.setNota2(nota2);
		
		System.out.print("Faltas : ");
		int falta = Teclado.nextInt();
		Aluno.setFalta(falta);
		
		Aluno.resultado();
	}
}