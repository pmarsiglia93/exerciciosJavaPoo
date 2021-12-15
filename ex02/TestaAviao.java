package br.com.generation.ex02;

public class TestaAviao {

	public static void main(String[] args) {
			
		int acel = 500;
		
		Aviao a1 = new Aviao();
		
		a1.modelo = "Boeing-Paulo";
		a1.marca = "Aero Paulo";
		a1.anoFabricacao = 2021;
		a1.velocidade = 0;
		
		System.out.println("Modelo: " + a1.modelo);
		System.out.println("Marca: " + a1.marca);
		System.out.println("Ano de Fabricação: " + a1.anoFabricacao);
		System.out.println();
		System.out.println("Velocidade: " + a1.velocidade + " Km/h");
				
		a1.acelerar(acel);
		
		System.out.println("Velocidade: " + a1.velocidade + " Km/h");
		
		a1.freiar(100);
		
		System.out.println("Velocidade: " + a1.velocidade + " Km/h");
		
		a1.freiar(100);
		
		System.out.println("Velocidade: " + a1.velocidade + " Km/h");
		
		a1.freiar(100);
		
		System.out.println("Velocidade: " + a1.velocidade + " Km/h");
		
		a1.freiar(100);
		
		System.out.println("Velocidade: " + a1.velocidade + " Km/h");
		System.out.println();
		
		a1.pousou();		
		
		}
		
		

	}

