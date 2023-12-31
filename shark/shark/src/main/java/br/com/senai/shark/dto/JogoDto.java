package br.com.senai.shark.dto;

import java.time.LocalDate;

import br.com.senai.shark.model.Jogo;

public class JogoDto {

	private int id;
	private String titulo;
	private String desc;
	private double preco;
	private LocalDate dtLancamento;
	private String nomeDesenvolvedora;
	private String nomePublisher;

	public JogoDto(Jogo modelJogo) {

		this.id = modelJogo.getId();
		this.titulo = modelJogo.getTitulo();
		this.desc = modelJogo.getDesc();
		this.dtLancamento = modelJogo.getDtLancamento();
		this.nomeDesenvolvedora = modelJogo.getNomeDesenvolvedora();
		this.nomePublisher = modelJogo.getNomePublisher();
		this.preco = modelJogo.getPreco();

	}

	public JogoDto(int id, String titulo, String desc, double preco, LocalDate dtLancamento, String nomeDesenvolvedora,
			String nomePublisher) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.desc = desc;
		this.preco = preco;
		this.dtLancamento = dtLancamento;
		this.nomeDesenvolvedora = nomeDesenvolvedora;
		this.nomePublisher = nomePublisher;
	}

	public JogoDto() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public LocalDate getDtLancamento() {
		return dtLancamento;
	}

	public void setDtLancamento(LocalDate dtLancamento) {
		this.dtLancamento = dtLancamento;
	}

	public String getNomeDesenvolvedora() {
		return nomeDesenvolvedora;
	}

	public void setNomeDesenvolvedora(String nomeDesenvolvedora) {
		this.nomeDesenvolvedora = nomeDesenvolvedora;
	}

	public String getNomePublisher() {
		return nomePublisher;
	}

	public void setNomePublisher(String nomePublisher) {
		this.nomePublisher = nomePublisher;
	}

}
