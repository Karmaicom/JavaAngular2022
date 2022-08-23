package repositories;

import java.io.File;
import java.io.PrintWriter;

import entities.ArquivoExportado;
import entities.Cliente;

public class ClienteRepository {

	public ArquivoExportado exportarDados(Cliente cliente) throws Exception{
	
		File file = new File("c:\\temp\\cliente.txt");
		PrintWriter printWriter = new PrintWriter(file);
		PrintWriter print = printWriter;
		
		print.write("\nID.............: " + cliente.getIdCliente());
		print.write("\nNOME...........: " + cliente.getNome());
		print.write("\nEMAIL..........: " + cliente.getEmail());
		print.write("\nCPF............: " + cliente.getCpf());
		
		print.flush();
		print.close();
		
		String canonicalFile = file.getName().toString();
		String canonicalPath = file.getCanonicalPath();
		
		ArquivoExportado arquivoExportado = new ArquivoExportado();
		arquivoExportado.setCanonicalFile(canonicalFile);
		arquivoExportado.setCanonicalPath(canonicalPath);
		
		return arquivoExportado;
	}
	
}
