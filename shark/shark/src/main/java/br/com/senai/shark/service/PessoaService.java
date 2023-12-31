package br.com.senai.shark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.shark.model.Pessoa;
import br.com.senai.shark.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public Pessoa inserePessoa(Pessoa p) {
		return pessoaRepository.save(p);

	}

	public List<Pessoa> listarPessoas() {

		return pessoaRepository.findAll();

	}

	public void deletePessoaBy(Pessoa p) {

		pessoaRepository.deleteById(p.getId());

	}

}
