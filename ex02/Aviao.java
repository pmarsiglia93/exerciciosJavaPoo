package br.com.generation.ex02;

public class Aviao {
	
	//Atributos --> vari�veis
	String modelo;
	String marca;
	int anoFabricacao;
	int velocidade;
	
	//M�todos
	
	void acelerar(int aceleracao) {
		velocidade = 500;
	}
	
	void freiar(int reduzir) {
		velocidade = velocidade - reduzir;
	}
	
	void pousou() {
		System.out.println("O avi�o chegou ao seu destino!");
	}

}
