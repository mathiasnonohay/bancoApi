package com.bancoMathias.bancoApp.services;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.bancoMathias.bancoApp.exception.PessoaResourceExc;
import com.bancoMathias.bancoApp.model.Conta;
import com.bancoMathias.bancoApp.model.Pessoa;
import com.bancoMathias.bancoApp.resources.PessoaContaResource;

@Component
public class PessoaConversor {
	Integer score = randomNum();
	public Pessoa conversor(PessoaContaResource pessoaContaResource) throws PessoaResourceExc {
		try {
			Pessoa pessoa = new Pessoa();
			String tip = tipPess(pessoaContaResource.getDocumento());

			pessoa.setNome(pessoaContaResource.getNome());
			pessoa.setTipoPessoa(tip);
			pessoa.setDocumento(pessoaContaResource.getDocumento());
			pessoa.setScore(score);

			return pessoa;
		} catch (Exception e) {
			throw new PessoaResourceExc(
					"Falha ao converter o resource para entidade Pessoa, resource: " + pessoaContaResource);
		}
	}

	public Conta conversorConta(PessoaContaResource pessoaContaResource) throws PessoaResourceExc {

		try {
			Conta conta = new Conta();
			String tipo = tipConta(pessoaContaResource.getDocumento());
			String cartao = limiteCartao(score);
			String cheque = limiteCheque(score);
			Integer numConta = numRandomConta();
			conta.setAgencia(pessoaContaResource.getAgencia());
			conta.setNumConta(numConta);
			conta.setTipo(tipo);
			conta.setCartao(cartao);
			conta.setCheque(cheque);

			return conta;
		} catch (Exception e) {
			throw new PessoaResourceExc(
					"Falha ao converter o resource para entidade Conta, resource: " + pessoaContaResource);
		}
	}
	
	public Integer randomNum() {
		Random gerador = new Random();
		Integer num = gerador.nextInt(9);
		return num;
	}

	public String tipPess(String documento) {
		Integer lgt = documento.length();
		String tipo = null;
		if (lgt == 11) {
			tipo = "Pessoa Física";
		} else {
			tipo = "Pessoa Jurídica";
		}
		return tipo;

	}

	public String tipConta(String documento) {
		Integer lgt = documento.length();
		String tipo = null;
		if (lgt == 11) {
			tipo = "Conta Corrente";
		} else {
			tipo = "Conta Empresarial";
		}
		return tipo;

	}

	public Integer numRandomConta() {
		Integer num = (int) (100000 + Math.random() * 899999);
		return num;

	}
	
	public String limiteCartao(Integer score) {
		String limiteCartao = null;
		
		if (score < 2) {
			limiteCartao = "Não é possivel ter um cartão de crédito";
		} else if (2 <= score && score < 6) {
			limiteCartao = "Limite de R$ 200,00";
		} else if (6 <= score && score < 9) {
			limiteCartao = "Limite de R$ 2000,00";
		} else {
			limiteCartao = "Limite de R$ 15000,00";
		}
		return limiteCartao;
	}
	public String limiteCheque(Integer score) {
		String limiteCheque = null;
		
		if (score < 2) {
			limiteCheque = "Não é possivel ter cheque especial";
		} else if (2 <= score && score < 6) {
			limiteCheque = "Limite de R$ 1000,00";
		} else if (6 <= score && score < 9) {
			limiteCheque = "Limite de R$ 2000,00";
		} else {
			limiteCheque = "Limite de R$ 5000,00";
		}
		return limiteCheque;
	}
	
}
