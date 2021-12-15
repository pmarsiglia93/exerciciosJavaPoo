package br.com.generation.ex05;

public class TestaPatinete {

	public static void main(String[] args) {
		
		Patinete p1 = new Patinete();
		Patinete p2 = new Patinete();
		
		p1.modelo = "Paulos Patientes";
		p1.marca = "Pauloi";
		p1.cor = "Verde";
		
		p2.modelo = "Paulos Patinete - Elétrico";
		p2.marca = "Pauloi";
		p2.cor = "Branco";
		
		System.out.println("Quadro de disponibilidade:");
		System.out.println();
		
		System.out.println("Modelo: " + p1.modelo );
		System.out.println("Marca: " + p1.marca);
		System.out.println("Cor: " + p1.cor);
		p1.disponivel();
		
		System.out.println();
		
		System.out.println("Modelo: " + p2.modelo );
		System.out.println("Marca: " + p2.marca);
		System.out.println("Cor: " + p2.cor);
		p2.indisponivel();

	}

}
