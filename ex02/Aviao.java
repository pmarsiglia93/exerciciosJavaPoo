package br.com.generation.ex02;

public class Aviao {
	
	//Atributos --> variáveis
	String modelo;
	String marca;
	int anoFabricacao;
	int velocidade;
	
	//Métodos
	
	void acelerar(int aceleracao) {
		velocidade = 500;
	}
	
	void freiar(int reduzir) {
		velocidade = velocidade - reduzir;
	}
	
	void pousou() {
		System.out.println("O avião chegou ao seu destino!");
	}

}
