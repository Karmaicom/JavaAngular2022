package principal;

import javax.swing.JOptionPane;

import entities.Cliente;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("\nAula 01 - Java Webdeveloper COTI Informática\n");

		Cliente cliente = new Cliente();
		
		cliente.setIdCliente(1);
		cliente.setNome(JOptionPane.showInputDialog("Informe o nome do Cliente"));
		cliente.setEmail(JOptionPane.showInputDialog("Informe o email do Cliente"));
		cliente.setCpf(JOptionPane.showInputDialog("Informe o cpf do Cliente"));
				
		System.out.println("Dados do cliente:");
		System.out.println("Id................: " + cliente.getIdCliente());
		System.out.println("Nome..............: " + cliente.getNome());
		System.out.println("Email.............: " + cliente.getEmail());
		System.out.println("CPF...............: " + cliente.getCpf());
	}

}
