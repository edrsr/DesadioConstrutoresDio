package br.dio;

import java.time.LocalDate;
import java.time.Period;

public class TestaCarro {

	//M�todo main
	public static void main(String[] args) {
	
		//instanciando o construtor sem par�metros.
		Carro carro1 = new Carro();
		
		
		//Instanciando o construtor com par�metros.
		Carro carro = new Carro("Renegade", "Jeep", 2020);
		
		
		//Imprimindo os objetos passados no construtor com par�metro
		System.out.println("O modelo do carro � : "+carro.getModelo());
		System.out.println("A marca do carro � : "+carro.getMarca());
		System.out.println("O ano do carro � : "+carro.getAno());
		
		
		//Atribuindo valor ao atributo variante.
		carro1.setVariante("N�o tenho certeza do que seria variante rsrs");
		
		//Imprimindo os objetos passados no construtor sem par�metro
		System.out.println("A variante do carro � : "+carro1.getVariante());
	}

}