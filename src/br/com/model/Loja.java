package br.com.model;

import java.util.List;

public class Loja {

	// atributos

	private String nome;
	private String cnpj;
	private List<Livro> livros;
	private List<VideoGame> games;

	// construtores

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> games) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.games = games;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getGames() {
		return games;
	}

	public void setGames(List<VideoGame> games) {
		this.games = games;
	}

	public void listLivro() {
		System.out.println("--------------------------------------------------------");
		System.out.println("A loja Americanas possui os seguintes livros para venda: ");
		for (Livro livro : livros) {
			System.out.println("T�tulo: " + livro.getNome() + ", Preco: " + livro.getPreco()
					+ ", Quantidade dispon�vel: " + livro.getQuantidade() + ", Autor: " + livro.getAutor() + ", Tema: "
					+ livro.getTema() + ",Numero de p�ginas: " + livro.getQtdPag());

		}
	}

	public void listVideoGame() {
		System.out.println("--------------------------------------------------------");
		System.out.println("A loja Americanas possui os seguintes games para venda: ");
		for (VideoGame game : games) {
			System.out.println("T�tulo: " + game.getNome() + ", Pre�o: " + game.getPreco() + ", Quantidade disponivel:"
					+ game.getQuantidade() + ", Marca: " + game.getMarca() + ", Modelo: " + game.getModelo()
					+ ", Usado: " + game.isUsado());
		}

	}

	// public doble calcularPatrimonio () {

	public void calcularPatrimonio() {
		System.out.println("--------------------------------------------------");
		int estoque = 0;
		if (getLivros().size() == 0) {
			return;

		} else {
			for (Livro livro : livros) {
				estoque += livro.getQuantidade() * livro.getPreco();
			
			}

		}
		if (getGames().size() == 0) {
			return;

		} else {
			for (VideoGame videogame : games) {

				estoque += videogame.getQuantidade() * videogame.getPreco();
			}

		}
		System.out.println(" O patrimonio da loja � de : R$" + estoque);
	
	}

}
