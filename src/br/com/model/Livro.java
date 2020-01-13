package br.com.model;

public class Livro extends Produto {

	//atributos

	private String autor;
	private String tema;
	private int qtdPag;
	
	
	//construtores 
	
  public Livro(String nome, double preco, int quantidade, String autor, String tema, int qtdPag) {
	super(nome, preco, quantidade);

	this.autor = autor;
	this.tema = tema;
	this.qtdPag = qtdPag;	
	
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public String getTema() {
	return tema;
}
public void setTema(String tema) {
	this.tema = tema;
}
public int getQtdPag() {
	return qtdPag;
}
public void setQtdPag(int qtdPag) {
	this.qtdPag = qtdPag;
	

}


public void status () { 
	super.status();
	System.out.println("Autor do livro: " + this.autor);
	System.out.println("Tema do livro: " + this.tema);
	System.out.println("Quantidade de paginas: " + this.qtdPag);
}


public double calcularImposto () {
	
	double imp = 0;
	if (this.tema == "educativo") {
		
		System.out.println("Livro educativo não tem imposto: " + this.getNome());
		return 0;
	}	   
	else {
		
		imp= (this.getPreco ()* 0.10); 
		System.out.println("R$" + imp  + " de imposto sobre o livro " + this.getNome());
		return imp;
	}
	
}	   
}