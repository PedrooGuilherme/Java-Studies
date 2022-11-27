package edu.uninter.herancas.exercices.pratique;

public class Livro {
	private String titulo;
	private Autor autor;
	private int edicao;
	private String genero;
	
	
	
	public Livro() {
		
	}
	public Livro(String titulo, Autor autor, int edicao, String genero) {
		this.titulo =titulo;
		this.autor = autor;
		this.edicao = edicao;
		this.genero = genero;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
}

