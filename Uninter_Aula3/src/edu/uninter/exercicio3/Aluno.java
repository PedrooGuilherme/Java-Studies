package edu.uninter.exercicio3;

public class Aluno {
	String nome;
	int matricula;
	double desconto;
	Curso curso;
	
	
	Aluno(String nome,int matricula,double desconto,Curso curso){
		this.nome = nome;
		this.matricula = matricula;
		this.desconto =desconto;
		this.curso = curso;
	}
	public void descrever() {
		System.out.printf("Nome do Aluno: %s \n"
				+ "Matricula: %d\n"
				+ "Desconto: %f\n",nome,matricula,desconto);
				curso.info();
	}
	
	public float pagamento() {
		return (float) (curso.mensalidade - (curso.mensalidade * desconto/100));

	}
}
