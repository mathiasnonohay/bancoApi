package com.bancoMathias.bancoApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancoMathias.bancoApp.model.Pessoa;
import com.bancoMathias.bancoApp.repository.PessoaRepository;

@Service
public class ListarPessoasServiceImpl {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public List<Pessoa> listarTodasPessoas() {
		List<Pessoa> listPessoa = pessoaRepository.findAll();
		
		return listPessoa;
	}
}
