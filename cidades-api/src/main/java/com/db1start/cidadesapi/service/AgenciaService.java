package com.db1start.cidadesapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db1start.cidadesapi.domain.entity.Agencia;
import com.db1start.cidadesapi.domain.entity.Cidade;
import com.db1start.cidadesapi.repository.AgenciaRepository;

@Service
public class AgenciaService {

	@Autowired
	private AgenciaRepository agenciaRepository;
	
	public Agencia criar(String numero, String digito, String banco, Cidade cidade) {
		Agencia agencia = new Agencia(numero, digito, banco, cidade);
		return agenciaRepository.save(agencia);
	}
	public void limpar() {
		agenciaRepository.deleteAll();
	}
	public Agencia bucarPorNumero(String numero) {
		return agenciaRepository.findByNumero(numero).orElseThrow(()
				-> new RuntimeException("Agencia nao encontrada"));
	}
	public Agencia bucarPorId(Long id) {
		return agenciaRepository.findById(id).orElseThrow(()
				-> new RuntimeException("Agencia nao encontrada"));
	}
}
