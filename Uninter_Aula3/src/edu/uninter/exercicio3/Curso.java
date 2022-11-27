package edu.uninter.exercicio3;

public class Curso {
	String nome;
	double mensalidade;
	
	Curso(String nome, double mensalidade){
		this.nome = nome;
		this.mensalidade = mensalidade;
		
	}
	void info() {
		System.out.printf("Nome do curso : %s\n"
				+ "Mensalidade : %f\n",nome,mensalidade);}
	}
