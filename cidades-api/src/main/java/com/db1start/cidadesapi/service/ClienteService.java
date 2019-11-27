package com.db1start.cidadesapi.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db1start.cidadesapi.domain.entity.Cliente;
import com.db1start.cidadesapi.domain.entity.Conta;
import com.db1start.cidadesapi.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;	
	
	public Cliente criar(String nome, String cpf, String telefone, Conta conta) {
		Cliente cliente = new Cliente(nome, cpf, telefone, conta);
		return clienteRepository.save(cliente);
	}
	
	public void limpar() {
		clienteRepository.deleteAll();
	}
	
	public Cliente buscarPorNome(String nome) {
		return clienteRepository.findByNome(nome).orElseThrow(()
				-> new RuntimeException("Cliente nao encontrado"));
	}
	

	public Cliente buscarPorId(Long id) {
		return clienteRepository.findById(id).orElseThrow(()
				-> new RuntimeException("Cliente nao encontrado"));
	}
	
	
	
}
