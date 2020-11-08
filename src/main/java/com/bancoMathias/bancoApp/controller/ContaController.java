package com.bancoMathias.bancoApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancoMathias.bancoApp.model.Conta;
import com.bancoMathias.bancoApp.services.ListarContasService;

@RestController
@RequestMapping(value="conta")
public class ContaController {
	@Autowired
	ListarContasService serviceListar;
	
	@GetMapping("/listar")
	private List<Conta> listarContas() {
		return serviceListar.listarTodasContas();
	}

}
