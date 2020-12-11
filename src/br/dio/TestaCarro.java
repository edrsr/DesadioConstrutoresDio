package br.dio;

import java.time.LocalDate;
import java.time.Period;

public class TestaCarro {

	//Método main
	public static void main(String[] args) {
	
		//instanciando o construtor sem parâmetros.
		Carro carro1 = new Carro();
		
		
		//Instanciando o construtor com parâmetros.
		Carro carro = new Carro("Renegade", "Jeep", 2020);
		
		
		//Imprimindo os objetos passados no construtor com parâmetro
		System.out.println("O modelo do carro é : "+carro.getModelo());
		System.out.println("A marca do carro é : "+carro.getMarca());
		System.out.println("O ano do carro é : "+carro.getAno());
		
		
		//Atribuindo valor ao atributo variante.
		carro1.setVariante("Não tenho certeza do que seria variante rsrs");
		
		//Imprimindo os objetos passados no construtor sem parâmetro
		System.out.println("A variante do carro é : "+carro1.getVariante());
	}

}