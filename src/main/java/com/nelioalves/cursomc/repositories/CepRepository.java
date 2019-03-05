package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nelioalves.cursomc.domain.Cep;

public interface CepRepository extends JpaRepository<Cep, String> {

}