package br.com.senai.shark.dto;

import br.com.senai.shark.model.Cliente;

public class ClienteDto {

	private int id;
	private String nome;
	private String endereco;
	private String email;
	private String dtNascimento;
	private String cpf;

	public ClienteDto(int id, String nome, String endereco, String email, String dtNascimento, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.dtNascimento = dtNascimento;
		this.cpf = cpf;
	}

	public ClienteDto (Cliente cliente) {
		
			this.id = cliente.getId();
			this.nome = cliente.getNome();
			this.endereco = cliente.getEndereco();
			this.email = cliente.getEmail();
			this.dtNascimento = cliente.getDtNascimento();
			this.cpf = cliente.getCpf();
		
	}
	
	public ClienteDto() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
