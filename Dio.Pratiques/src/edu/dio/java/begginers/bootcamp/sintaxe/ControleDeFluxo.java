package edu.dio.java.begginers.bootcamp.sintaxe;

import java.util.Scanner;

public class ControleDeFluxo {
	public static void main(String [] agrs)
	{
		Scanner Teclado = new Scanner(System.in);
		System.out.println("Digite o número do mÊs: ");
		int numeroDoMes =Teclado.nextInt();
		System.out.println("Digite o número do dia: ");
		int numeroDoDia = Teclado.nextInt();
		String mes = "";
		String dia;
		switch(numeroDoDia){
			case 1:
				dia = "Segunda";
				break;
			case 2:
				dia = "Terça";
				break;
			case 3:
				dia = "Quarta";
				break;
			case 4 :
				dia = "Quinta";
				break;
			case 5:
				dia = "Sexta";
				break;
			case 6:
				dia = "Sábado";
				break;
			case 7: 
				dia = "Domingo";
				break;
			default:
				System.out.println("Número digitado inválido!\n");
				break;
			}
	
		if(numeroDoMes == 1)
			mes = "Janeiro";
		else if(numeroDoMes == 2)
			mes = "Fevereiro";
		else if(numeroDoMes == 3)
			mes = "Março";
		else if(numeroDoMes == 4)
			mes = "Abril";
		else if(numeroDoMes == 5)
			mes = "Maio";
		else if(numeroDoMes == 6)
			mes = "Junho";
		else if(numeroDoMes == 7)
			mes = "Julho";
		else if(numeroDoMes == 8)
			mes = "Agosto";
		else if(numeroDoMes == 9)
			mes = "Setembro";
		else if(numeroDoMes == 10)
			mes = "Outubro";
		else if(numeroDoMes == 11)
			mes = "Novembro";
		else if(numeroDoMes == 12)
			mes="Dezembro";
		System.out.printf("Mês digitado: %s",mes);
		boolean ferias = numeroDoMes == 7 || numeroDoMes == 10 || numeroDoMes ==1;
		if(ferias) {
			System.out.println("Estamos de Férias!!\n");
		}
		else {
			System.out.println("Época de trabalhar.\n");
		}
	}
}

