package br.com.generation.ex04;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		
		f1.nome = "Carlos";
		f1.cargo = "Gerente";
		f1.idade = 45;
		
		f2.nome = "Jefferson";
		f2.cargo = "Faxineiro";
		f2.idade = 43;
		
		f3.nome = "Sergio";
		f3.cargo = "Manobrista";
		f3.idade = 52;
		
		System.out.println("Quadro de Funcionários: ");
		System.out.println();
		
		System.out.println("Nome do Funcionário: " + f1.nome);
		System.out.println("Cargo: " + f1.cargo);
		System.out.println("Idade: " + f1.idade + " anos.");
		f1.empregado();
		
		System.out.println();
		
		System.out.println("Nome do Funcionário: " + f2.nome);
		System.out.println("Cargo: " + f2.cargo);
		System.out.println("Idade: " + f2.idade + " anos.");
		f2.desempregado();
		
		System.out.println();
		
		System.out.println("Nome do Funcionário: " + f3.nome);
		System.out.println("Cargo: " + f3.cargo);
		System.out.println("Idade: " + f3.idade + " anos.");
		f3.ferias();

	}

}
