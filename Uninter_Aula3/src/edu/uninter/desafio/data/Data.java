package edu.uninter.desafio.data;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public void setDia(int dia) {
		if (dia > 31 || dia <= 0)
		{
			System.out.println("Dia inválido. ");
		}
		else {
			this.dia = dia;
		}
	}
	
	
	public void setMes(int mes) {
		if (mes > 12 || mes <= 0)
		{
			System.out.println("Mês inválido. ");
		}
		else {
			this.mes = mes;

		}
	}
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public Data() {
		super();
	}
}

