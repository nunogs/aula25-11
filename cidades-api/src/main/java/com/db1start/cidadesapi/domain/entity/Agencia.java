package com.db1start.cidadesapi.domain.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "agencia")
public class Agencia {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name = "numero")
	String número;
	
	@Column(name = "digito")
	String dígito;
	
	@Column(name = "banco")
	String banco;
	
	@ManyToOne
	@JoinColumn(name = "cidade")
	Cidade cidade;
	
	@OneToMany(mappedBy = "agencia", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Conta> contas;

	public Agencia(String número, String dígito, String banco, Cidade cidade) {
		this.número = número;
		this.dígito = dígito;
		this.banco = banco;
		this.cidade = cidade;
	}

	public Long getId() {
		return id;
	}

	public String getNúmero() {
		return número;
	}

	public String getDígito() {
		return dígito;
	}

	public String getBanco() {
		return banco;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public List<Conta> getContas() {
		return contas;
	}
	
	

	

}
