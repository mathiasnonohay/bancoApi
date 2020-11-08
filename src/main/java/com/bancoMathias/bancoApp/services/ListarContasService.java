package com.bancoMathias.bancoApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancoMathias.bancoApp.model.Conta;
import com.bancoMathias.bancoApp.repository.ContaRepository;

@Service
public class ListarContasService {
	@Autowired
	private ContaRepository contaRepository;
	
	public List<Conta> listarTodasContas() {
		List<Conta> listConta = contaRepository.findAll();
		
		return listConta;
	}
}
