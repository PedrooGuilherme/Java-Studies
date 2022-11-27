package edu.uninter.exercicio3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno Alberto = new Aluno("Alberto",1213121,10,new Curso("ADS",12131));
		
		Alberto.descrever();
		float pagamento = Alberto.pagamento();
		System.out.printf("Pagamento com desconto: %.1f",pagamento);
	}}