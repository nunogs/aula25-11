package com.db1start.cidadesapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db1start.cidadesapi.domain.entity.Agencia;
import com.db1start.cidadesapi.domain.entity.Cliente;
import com.db1start.cidadesapi.domain.entity.Conta;
import com.db1start.cidadesapi.repository.ContaRepository;

@Service
public class ContaService {

		@Autowired
		ContaRepository contaRepository;
		

		public Conta criar(Agencia agencia, Cliente cliente) {
			Conta conta = new Conta(agencia, cliente);
			return contaRepository.save(conta);
		}
		
		public void limpar() {
			contaRepository.deleteAll();;
		}
		
		
		public Conta buscarPorId(Long id) {
			return contaRepository.findById(id).orElseThrow(() 
					-> new RuntimeException("Conta não encontrada"));
		}

}
