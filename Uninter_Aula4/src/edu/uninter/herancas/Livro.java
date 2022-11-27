package edu.uninter.herancas;

public class Livro {
	public String titulo;
	public int paginas;
	public String autor;
	public double custoProducao;
	public double precoVendas;
	
	public Livro(String autor,int paginas, String titulo, double custoProducao, double precoVendas) {
		this.autor = autor;
		this.titulo = titulo;
		this.paginas = paginas;
		this.custoProducao = custoProducao;
		this.precoVendas = precoVendas;
	}

	public Livro() {
		// TODO Auto-generated constructor stub
		
	}

	public double lucro() {
		return precoVendas - custoProducao;
	}
	
	public void imprimirTitulo() {
		System.out.printf("Título do livro: %s",titulo);
		
	}
	
	public double imposto()
	{		
		return 0.2f * lucro();
			
	}
	public void info() {
		System.out.printf("Título do livro : %s\n"
				+ "Número de Páginas: %d\n"
				+ "Autor : %s\n"
				+ "Custo de Produção : %.1f\n"
				+ "PReço de Vendas : %.1f\n",titulo,paginas,autor,custoProducao,precoVendas);
		
	}
	
}
