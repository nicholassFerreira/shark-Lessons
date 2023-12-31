package br.com.senai.shark.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.dto.PessoaDto;
import br.com.senai.shark.model.Pessoa;
import br.com.senai.shark.service.PessoaService;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	private static List<PessoaDto> listaPessoaDtos = new ArrayList<>();

	@Autowired
	private PessoaService pessoaService;
	
	@PostMapping
	public ResponseEntity<PessoaDto> criaPessoa(@RequestBody PessoaDto pessoaDto) {

		Pessoa pessoa = new Pessoa(pessoaDto);
		
		pessoa = pessoaService.inserePessoa(pessoa);

		listaPessoaDtos.add(pessoaDto);

		return ResponseEntity.ok(new PessoaDto(pessoa));

	}

	@GetMapping()
	public ResponseEntity<List<PessoaDto>> findPessoa(@RequestParam(required = false) String nome) {

		if (nome != null) {

			List<PessoaDto> pessoaRetornoStream = listaPessoaDtos.stream().filter(p -> p.getNome().equals(nome))
					.toList();

			return ResponseEntity.ok(pessoaRetornoStream);

		}

		return ResponseEntity.ok(listaPessoaDtos);

	}

}
