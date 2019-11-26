package com.db1start.cidadesapi.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "cidade")
public class Cidade {
	@Column(name = "nome", length = 60)
	private String nome;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "estado_id")
	private Estado uf;
	
	
	

	public Cidade(String nome, Estado uf) {
		this.nome = nome;
		this.uf = uf;
		
	}




	public String getNome() {
		return nome;
	}




	public Long getId() {
		return id;
	}




	public Estado getUf() {
		return uf;
	}
	
	
	
	
	
	

}
