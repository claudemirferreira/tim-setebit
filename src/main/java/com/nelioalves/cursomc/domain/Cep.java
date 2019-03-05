package com.nelioalves.cursomc.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cep")
public class Cep implements Serializable {

	private static final long serialVersionUID = 35589452936085797L;

	@Id
	@Column(name = "CEP", length = 8, nullable = false)
	private String cep;

	@Column(name = "UF", length = 2, nullable = false)
	private String uf;

	@Column(name = "CIDADE", length = 100, nullable = false)
	private String cidade;

	@Column(name = "BAIRRO", length = 100)
	private String bairro;

	@Column(name = "LOGRADOURO", length = 100, nullable = false)
	private String logradouro;
	
	public Cep() {}

	public Cep(String cep, String uf, String cidade, String bairro, String logradouro) {
		this.cep = cep;
		this.uf = uf;
		this.cidade = cidade;
		this.bairro = bairro;
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String toString() {
		return "Cep{cep='" + getCep() + "\', getLogradouro=" + getLogradouro() + "\'}";
	}

}