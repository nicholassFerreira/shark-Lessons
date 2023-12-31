package br.com.senai.shark.model;

import br.com.senai.shark.dto.ClienteDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String endereco;
	private String email;
	private String dtNascimento;
	private String cpf;

	public Cliente(int id, String nome, String endereco, String email, String dtNascimento, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.dtNascimento = dtNascimento;
		this.cpf = cpf;
	}

	public Cliente(ClienteDto cliente) {

		this.id = cliente.getId();
		this.nome = cliente.getNome();
		this.endereco = cliente.getEndereco();
		this.email = cliente.getEmail();
		this.dtNascimento = cliente.getDtNascimento();
		this.cpf = cliente.getCpf();

	}

	public Cliente() {
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
