package com.db1start.cidadesapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Long> {
	
	Optional<ContaRepository> findByNome(String nome);
	Optional<ContaRepository> findById(Long id);

	
}
