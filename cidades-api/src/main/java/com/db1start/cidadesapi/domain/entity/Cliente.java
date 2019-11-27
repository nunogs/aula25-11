package com.db1start.cidadesapi.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name = "nome")
	String nome;
	
	@Column(name = "nome")
	String cpf;
	
	@Column
	String telefone;
	
	@OneToOne
	@JoinColumn(name = "conta_id")
	Conta conta;

	public Cliente(String nome, String cpf, String telefone, Conta conta) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.conta = conta;
	}
	
	

}
