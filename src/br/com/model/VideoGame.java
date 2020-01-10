package br.com.model;

public class VideoGame extends Produto {
      
	//atributos
	
	String marca;
	String modelo;
	boolean isUsado;
	
    //construtores


public VideoGame(String nome, double preco, int quantidade, String marca, String modelo, boolean isUsado) {
	super(nome, preco, quantidade);
	
	this.marca= marca;
	this.modelo = modelo;
	this.isUsado = isUsado;
	
	
	
	
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public boolean isUsado() {
	return isUsado;
}

public void setUsado(boolean isUsado) {
	this.isUsado = isUsado;
	
}

public double calcularImposto () {
	   
	   double imp = 0;
	   if (this.isUsado == true) {
		   imp= this.getPreco() + (this.getPreco ()* 25/100); 
		   
		   System.out.println ( "Imposto " + this.modelo + " usado, R$" + imp );
		   return 0;
	   }
		   else {
			
		   imp= this.getPreco() + (this.getPreco ()* 45/100); 
			  
			  System.out.println( "Imposto " + this.modelo +" R$" + imp );
		   return imp;
	   }
	   
}  

public void status () {
	super.status ( );
	System.out.println("Marca do Video Game: " + this.marca);
	System.out.println("Modelo do Video Game " + this.modelo);
	System.out.println("Video Game usado? " + this.isUsado);
			
	
}
}