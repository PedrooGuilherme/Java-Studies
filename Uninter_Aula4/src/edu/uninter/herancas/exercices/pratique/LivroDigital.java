package edu.uninter.herancas.exercices.pratique;

public class LivroDigital extends Livro {
	private int download;
	private double tamanho;
	
	public void info() {
		System.out.printf("Dowload : %i\n"
				+ "Tamanho do Livro: %f",download,tamanho);
	}
	
	public int getDownload() {
		return download;
	}
	public void setDownload(int download) {
		this.download = download;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public LivroDigital(int download, double tamanho,String titulo,Autor autor,String genero,int edicao) {
		super(titulo,autor,edicao,genero);
		this.download = download;
		this.tamanho = tamanho;
	}
	
	
}
