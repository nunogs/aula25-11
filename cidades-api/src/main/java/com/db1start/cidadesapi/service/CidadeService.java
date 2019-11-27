package com.db1start.cidadesapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db1start.cidadesapi.domain.entity.Cidade;
import com.db1start.cidadesapi.domain.entity.Estado;
import com.db1start.cidadesapi.repository.CidadeRepository;

@Service
public class CidadeService {

		@Autowired
		CidadeRepository cidadeRepository;
		
		public Cidade criar(String nome, Estado uf) {
			Cidade cidade = new Cidade(nome, uf);
			return cidadeRepository.save(cidade);
		}
		
		public void limpar() {
			cidadeRepository.deleteAll();
		}
		
		public Cidade buscarPorNome(String nome) {
			return cidadeRepository.findByNome(nome).orElseThrow(()
					-> new RuntimeException("Cidade nao encontrada"));
		}
		
		public Cidade buscarPorId(Long id) {
			return cidadeRepository.findById(id).orElseThrow(()
					-> new RuntimeException("Cidade nao encontrada"));
		}
		
		
		
}
