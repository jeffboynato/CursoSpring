package br.com.JMSSistemas.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.JMSSistemas.domain.Cliente;

@Service
public class ClienteService {
	
	private List<Cliente> clientes = List.of(new Cliente(1L, "Jefersson"), new Cliente(2L, " & Tina"));

	public List<Cliente> listAll() {
		return clientes;

	}
	
	public Cliente findById(long id) {
		return clientes.stream()
				.filter(cliente -> cliente.getId().equals(id))
				.findFirst()
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Cliente not found"));
	}

}
