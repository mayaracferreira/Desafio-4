package br.com.model;

public class Produto {

	//atributos
	
	private String nome;
	private double preco;
	private int quantidade;
	
	//construtores
	
	public Produto (String nome, double preco, int quantidade){
		
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
		
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	public void status () {
		
		System.out.println("Nome do produto: " + this.nome);
		System.out.println("Preço do produto: " +this.preco);
		System.out.println("Quantidade de produtos: " + this.quantidade);
	}

	
}
