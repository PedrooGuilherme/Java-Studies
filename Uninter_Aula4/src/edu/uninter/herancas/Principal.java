package edu.uninter.herancas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LivroDigital Theboys = new LivroDigital("www.comiSuaMae.com",78,"The boys",345,"Jeff Kenney",230,240);
		System.out.printf("Link para Download : %s\n"
				+ "Tamanho em MB : %.1f\n"
				+ "Título do livro : %s\n"
				+ "Número de Páginas: %d\n"
				+ "Autor : %s\n"
				+ "Custo de Produção : %.1f\n"
				+ "PReço de Vendas : %.1f\n",Theboys.linkparaDownload,Theboys.tamanhoMB,Theboys.titulo,Theboys.paginas,Theboys.autor,Theboys.custoProducao,Theboys.precoVendas);
		
		Livro LostBoys = new Livro("Pedrovisk Robeleudo",17,"Fantasma",160,180);
		LostBoys.info();
	System.out.println(Theboys instanceof Livro);
	System.out.println(Theboys instanceof LivroDigital);
	System.out.println(LostBoys instanceof LivroDigital);
	System.out.println(LostBoys instanceof Livro);
	}

}