package com.nelioalves.cursomc;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.nelioalves.cursomc.services.CepServiceImpl;

@Component
@EnableScheduling
public class ScheduleCsv {

	@Autowired
	CepServiceImpl service;

	@Scheduled(fixedDelay = 5000)
	public void verificaPorHora() {
		// Código que realiza a consulta de fluxo de vendas
		System.out.println("222222");
		try {
			service.importCep();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
