package principal;

import javax.swing.JOptionPane;

import entities.ArquivoExportado;
import entities.Cliente;
import repositories.ClienteRepository;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("\nAula 01 - Java Webdeveloper COTI Informática\n");

		Cliente cliente = new Cliente();
		ClienteRepository repo = new ClienteRepository();
		
		try {
			cliente.setIdCliente(Integer.valueOf(JOptionPane.showInputDialog("Informe o Id do Cliente")));
			cliente.setNome(JOptionPane.showInputDialog("Informe o nome do Cliente"));
			cliente.setEmail(JOptionPane.showInputDialog("Informe o email do Cliente"));
			cliente.setCpf(JOptionPane.showInputDialog("Informe o cpf do Cliente"));
			
			System.out.println("Dados do cliente:");
			System.out.println("Id................: " + cliente.getIdCliente());
			System.out.println("Nome..............: " + cliente.getNome());
			System.out.println("Email.............: " + cliente.getEmail());
			System.out.println("CPF...............: " + cliente.getCpf());
			
			ArquivoExportado arquivoExportado = repo.exportarDados(cliente);
			
			System.out.println("Arquivo " + arquivoExportado.getCanonicalFile() + " gravado com sucesso, no caminho " + arquivoExportado.getCanonicalPath());
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, e, e.getMessage(), JOptionPane.ERROR_MESSAGE, null);
			e.printStackTrace();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
			e.printStackTrace();
		}
				
		
	}

}
