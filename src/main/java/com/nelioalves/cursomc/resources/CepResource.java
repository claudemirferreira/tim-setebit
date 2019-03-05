package com.nelioalves.cursomc.resources;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Cep;
import com.nelioalves.cursomc.services.CepServiceImpl;

@RestController
@RequestMapping(value = "/cep")
public class CepResource {

	@Autowired
	private CepServiceImpl service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Cep>> findAll() {
		List<Cep> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	// @PreAuthorize("hasAnyRole('ADMIN')")
	@RequestMapping(value = "/importCep", method = RequestMethod.POST)
	public ResponseEntity<Void> importCep() {
		try {
			service.importCep();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.noContent().build();
	}

}
