package br.com.senai.shark.dto;

import br.com.senai.shark.model.Carro;

public class CarroDto {

	private int id;
	private String marca;
	private String modelo;
	private int ano;

	public CarroDto(String marca, String modelo, int ano, int id) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.id = id;
	}

	public CarroDto() {
		super();
	}
	
	public CarroDto(Carro carro) {
		
		this.id = carro.getId();
		this.marca = carro.getMarca();
		this.modelo = carro.getModelo();
		this.ano = carro.getAno();
		
	}
	
	public CarroDto(int id, String marca, String modelo, int ano) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setData(int ano) {
		this.ano = ano;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	
}
