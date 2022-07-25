package br.com.fiap.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.fiap.smarticities.entity.Cliente;

import br.com.fiap.service.ClienteService;

public class RMIClient {

	public static void main(String[] args) throws Exception {
		Registry registro = LocateRegistry.getRegistry("127.0.0.1",8081);
		//127.0.0.1 - ip localhost
		
		ClienteService service = (ClienteService) registro.lookup("cliente");
		
		Cliente cliente = service.buscar(3);
		
		System.out.println(cliente.getNome());
		System.out.println(cliente.getId());
	}

}
