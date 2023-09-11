package br.com.senai.shark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.shark.dto.ClienteDto;
import br.com.senai.shark.dto.ContatoDto;
import br.com.senai.shark.model.ModelContato;
import br.com.senai.shark.repository.ClienteRepository;
import br.com.senai.shark.repository.ContatoRepository;

@Service
public class ContatoService {

	@Autowired
	private ContatoRepository contatoRepository;

	public ModelContato salvarContato(ContatoDto contato) {

		ModelContato novoContato = new ModelContato(contato);

		return contatoRepository.save(novoContato);

	}

	public List<ModelContato> listarTodos() {

		return contatoRepository.findAll();

	}

	public void excluirContato(Integer id) {

	}

}