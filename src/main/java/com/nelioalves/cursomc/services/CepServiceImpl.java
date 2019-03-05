package com.nelioalves.cursomc.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Cep;
import com.nelioalves.cursomc.repositories.CepRepository;

@Service
public class CepServiceImpl {

	@Autowired
	private CepRepository repository;

	@SuppressWarnings("unused")
	private HashSet<Cep> importarDadosCsv() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("cep.csv"));
		String line;
		HashSet<Cep> list = new HashSet<Cep>();

		while ((line = reader.readLine()) != null) {
			String[] fields = line.split(";");
			list.add(new Cep(fields[7], fields[2], fields[3], fields[5], fields[8]));
		}
		reader.close();
		return list;
	}

	public void importCep() throws IOException {
		HashSet<Cep> list = importarDadosCsv();
		repository.saveAll(list);
	}

	public List<Cep> findAll() {
		return repository.findAll();
	}
}