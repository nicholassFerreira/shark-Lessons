package br.com.senai.shark.model;

import br.com.senai.shark.dto.ContatoDto;

public class ModelContato {

	private Integer id;
	private String nome;
	private String numero;
	private char tipo;

	public ModelContato(int id, String nome, String numero, char tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.numero = numero;
		this.tipo = tipo;
	}

	public ModelContato(ContatoDto contatoDto) {

		this.id = contatoDto.getId();
		this.nome = contatoDto.getNome();
		this.numero = contatoDto.getNumero();
		this.tipo = contatoDto.getTipo();

	}

	public ModelContato() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

}