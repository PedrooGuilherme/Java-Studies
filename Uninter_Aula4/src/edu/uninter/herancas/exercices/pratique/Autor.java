package edu.uninter.herancas.exercices.pratique;

public class Autor {
	private String nome;
	private String email;
	private String nacionalidade;
	
	public void info() {
		System.out.println("----------");
		System.out.println("   Auto");
		System.out.println("----------"
				+ "Nome : %s\n"
				+ "Email: %s\n"
				+ "Nacionalidade : %s\n");
		
	}
	
	public Autor(String nome, String email, String nacionalidade) {
		this.nome = nome;
		this.email = email;
		this.nacionalidade = nacionalidade;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNacionalidade() {
		return nacionalidade;
	}


	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

}
