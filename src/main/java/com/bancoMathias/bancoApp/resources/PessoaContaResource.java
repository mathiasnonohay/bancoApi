package com.bancoMathias.bancoApp.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PessoaContaResource {
	
	@JsonProperty("nome_pessoa")
	private String nome;
	
	@JsonProperty("tipo_pessoa")
	private String tipoPessoa;
	
	@JsonProperty("documento")
	private String documento;
	
	@JsonProperty("agencia")
	private String agencia;
	
	

	public PessoaContaResource(String nome, String tipoPessoa, String documento, String agencia) {

		this.nome = nome;
		this.tipoPessoa = tipoPessoa;
		this.documento = documento;
		this.agencia = agencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	
}
