package com.bancoMathias.bancoApp.services;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancoMathias.bancoApp.exception.PessoaResourceExc;
import com.bancoMathias.bancoApp.model.Conta;
import com.bancoMathias.bancoApp.model.Pessoa;
import com.bancoMathias.bancoApp.repository.ContaRepository;
import com.bancoMathias.bancoApp.repository.PessoaRepository;
import com.bancoMathias.bancoApp.resources.PessoaContaResource;

@Service
public class PessoaServiceCadastroImpl {

	private static final Logger LOG = Logger.getLogger(PessoaServiceCadastroImpl.class);

	@Autowired
	private PessoaRepository pessoaRepository;

	@Autowired
	ContaRepository contaRepository;

	@Autowired
	private PessoaConversor service;

	public void cadastro(PessoaContaResource pessoaContaResource) {

		try {
			Pessoa pessoa = service.conversor(pessoaContaResource);
			Conta conta = service.conversorConta(pessoaContaResource);
			contaRepository.saveAndFlush(conta);
			pessoaRepository.saveAndFlush(pessoa);
		} catch (PessoaResourceExc e) {
			LOG.error("Erro ao salvar Pessoa: " + e.getMessage(), e);
		}
	}

}
