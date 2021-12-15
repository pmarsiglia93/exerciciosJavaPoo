package br.com.generation.ex01;

public class TestaClientes {

	public static void main(String[] args) {
		
		//instanciar o objeto --> Criar o objeto
		Clientes c1 = new Clientes();
				
		c1.nome = "Ana";
		c1.telefone = "(11) 9 95847-8795";
		c1.idade = 25;
		c1.horario = "15h";
		
		System.out.println("Nome da Cliente: " + c1.nome);
		System.out.println("Telefone:" + c1.telefone);
		System.out.println("Idade: " + c1.idade + "anos.");
		System.out.println("Horário de atendimento: " + c1.horario);
		System.out.println();
		c1.agendado();
	}

}
