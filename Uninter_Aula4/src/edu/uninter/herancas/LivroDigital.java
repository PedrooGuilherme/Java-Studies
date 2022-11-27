package edu.uninter.herancas;

public class LivroDigital extends Livro {
	String linkparaDownload;
	float tamanhoMB;


public float tamanhoPorPagina() {
	return (float) tamanhoMB/(float)paginas;
}
public double imposto()
{		
	return 0.2f * lucro() + 2;
		
}
public LivroDigital(String linkparaDownload, float tamanhoMB,String titulo,int paginas, String autor, double custoProducao, double precoVendas) {
	super(autor,paginas,titulo,custoProducao,precoVendas);
	this.linkparaDownload = linkparaDownload;
	this.tamanhoMB = tamanhoMB;
	
}
}

