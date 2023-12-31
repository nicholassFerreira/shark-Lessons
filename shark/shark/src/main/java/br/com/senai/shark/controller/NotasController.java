package br.com.senai.shark.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.service.HelloService;
import br.com.senai.shark.service.NotasService;

@RestController
public class NotasController {

	@Autowired
	private NotasService notasService;

	@GetMapping("/media")
	public String retornaMedia(@RequestParam(defaultValue = "ninguem") String nome,
			@RequestParam(defaultValue = " 0 ") String notas) {

		double media = notasService.somaNota(notas);

		return "O aluno " + nome + " foi " + (media >= 7 ? "aprovado" : "reprovado") + "com média "
				+ media;

	}

}
