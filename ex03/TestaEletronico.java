package br.com.generation.ex03;

import java.util.Scanner;

public class TestaEletronico {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Eletronico e1 = new Eletronico();
		
		System.out.println("Digite os dados do Eletrônico: ");
		System.out.print("Modelo: ");
		e1.setModelo(sc.nextLine());
		System.out.print("Marca: ");
		e1.setMarca(sc.nextLine());
		
		System.out.println("-----------------------------------------");
		
		System.out.println("Modelo do Eletrônico: " + e1.getModelo());
		System.out.println("Marca do Eletrônico: " + e1.getMarca());
		
		System.out.println("-----------------------------------------");
		sc.close();
		

	}

}
