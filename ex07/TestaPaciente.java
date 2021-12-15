package br.com.generation.ex07;

public class TestaPaciente {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente();
		Paciente p2 = new Paciente();
		Paciente p3 = new Paciente();
		
		p1.nome = "Rafael";
		p1.idade = 45;
		
		p2.nome = "Maria";
		p2.idade = 52;
		
		p3.nome = "Victor";
		p3.idade = 28;
		
		System.out.println("Quadro de Pacientes: ");
		System.out.println();
		
		System.out.println("Nome do Paciente: " + p1.nome);
		System.out.println("Idade: " + p1.idade + " anos.");
		p1.uti();
		
		System.out.println();
		
		System.out.println("Nome do Paciente: " + p2.nome);
		System.out.println("Idade: " + p2.idade + " anos.");
		p2.quarto();
		
		System.out.println();
		
		System.out.println("Nome do Paciente: " + p3.nome);
		System.out.println("Idade: " + p3.idade + " anos.");
		p3.alta();

	}

}
