package br.dio;

public class Carro {
	

	//Criação dos objetos
	private String marca;
	private String modelo;
	private int ano;
	private String variante;
	
	//Construtor criado para passagem dos atributos marca, modelo e ano
	public Carro(String marca, String modelo, int ano) {
	this.marca = marca;
	this.modelo = modelo;
	this.ano = ano;
	
	}
	
	
	//Construtor criado para passagem do atributo variante
	public Carro() {
		
	}

	//Criação dos métodos: get e set
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

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getVariante() {
		return variante;
	}

	public void setVariante(String variante) {
		this.variante = variante;
	}

}