package br.com.generation.ex07;

public class Paciente {
	
	String nome;
	int idade;
	
	void uti( ) {
		System.out.println("Status: UTI");
	}
	
	void quarto() {
		System.out.println("Status: Quarto");
	}
	
	void alta() {
		System.out.println("Status: Está de Alta hospitalar");
	}	

}
