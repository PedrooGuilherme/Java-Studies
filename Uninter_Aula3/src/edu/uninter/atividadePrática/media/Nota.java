package edu.uninter.atividadePrática.media;

import java.util.Scanner;

public class Nota {
	private double nota1;
	private double nota2;
	private int falta;
	
	public void setNota1(double nota) {
		
		while(nota < 0 || nota > 10){
			System.out.print("Nota inválida. Deve ser maior que 0 e menor que 10");
			Scanner Teclado = new Scanner(System.in);
			System.out.println("Nota 1: ");
			nota = Teclado.nextInt();
			
		}
		this.nota1 = nota;
	}
	
	public void setNota2(double nota) {
		
		while(nota < 0 || nota > 10){
			System.out.println("Nota inválida. Deve ser maior que 0 e menor que 10");
			Scanner Teclado = new Scanner(System.in);
			System.out.println("Nota 1: ");
			nota = Teclado.nextInt();
			
		}
		this.nota2 = nota;
		
	}
	
	public void setFalta(int falta) {
		this.falta = falta;
	}
	
	public int getFalta() {
		return this.falta;
	}
	public double getNota1 () {
		return this.nota1;
	
	}
	
	public double getNota2 () {
		return this.nota2;
	}
	
	public void resultado() {
		double media = (nota1 + nota2)/2;
		System.out.printf("Média = %.1f\n",media);
		
		if(falta > 7) {
				
				System.out.println("Status : Reprovado");
				System.out.println("Motivo : Mais de 7 faltas.");
			
		}
		else if(media < 7 && media >= 4)
		{
			System.out.println("Status : Exame");
		}
		else if (media < 4)
		{
			System.out.println("Motivo : Média abaixo de 4");
			System.out.println("Status : Reprovado");	
			
			
		}
		else {
			System.out.println("Status : Aprovado");
		}
	}
	
}
