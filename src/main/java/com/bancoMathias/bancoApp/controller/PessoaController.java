package com.bancoMathias.bancoApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancoMathias.bancoApp.model.Pessoa;
import com.bancoMathias.bancoApp.resources.PessoaContaResource;
import com.bancoMathias.bancoApp.services.ListarPessoasServiceImpl;
import com.bancoMathias.bancoApp.services.PessoaServiceCadastroImpl;


@RestController
@RequestMapping(value="/pessoa")
public class PessoaController {

	@Autowired
	PessoaServiceCadastroImpl serviceCadastro;
	
	@Autowired
	ListarPessoasServiceImpl serviceListar;
	
	@PostMapping("/cadastrar")
	private void novaPessoa(@RequestBody PessoaContaResource pessoa) {
		serviceCadastro.cadastro(pessoa);
	}
	
	@GetMapping("/listar")
	private List<Pessoa> listarPessoas() {
		return serviceListar.listarTodasPessoas();
	}
	
}
