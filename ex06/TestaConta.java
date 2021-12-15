package br.com.generation.ex06;

import java.util.Scanner;

public class TestaConta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Conta c1 = new Conta();
		
		System.out.println("Alterador de senha Bancário");
		System.out.print("Nome: ");
		c1.setNome(sc.nextLine());
		System.out.print("Email: ");
		c1.setEmail(sc.nextLine());
		System.out.print("Senha Antiga: ");
		c1.setSenha(sc.nextInt());
		System.out.print("Senha Nova: ");
		c1.setSenhanova(sc.nextInt());
		
		System.out.println("----------------------------------");
		System.out.println("Nome: " + c1.getNome());
		System.out.println("Email: " + c1.getEmail());
		System.out.println("Nova senha: " + c1.getSenhanova());
		
		System.out.println("Sua senha foi alterada com sucesso");
		
		System.out.println("----------------------------------");
		
		sc.close();

	}

}
