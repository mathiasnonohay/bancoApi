package com.bancoMathias.bancoApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bancoMathias.bancoApp.model.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long>{
	Conta findById(long idConta);
}
