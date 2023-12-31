package br.com.senai.shark.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.service.NomesService;

@RestController
public class NomesController {

	@Autowired
	private NomesService nomesService;
	
	@GetMapping("/nomes")
	public String organizaNomes (@RequestParam String nomes) {
		
		String nomesOrganizados = NomesService.separaNomes(nomes);
		
		return nomesOrganizados;
		
	}
	
}
