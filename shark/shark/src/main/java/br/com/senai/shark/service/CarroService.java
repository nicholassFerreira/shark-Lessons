package br.com.senai.shark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.shark.dto.CarroDto;
import br.com.senai.shark.model.Carro;
import br.com.senai.shark.repository.CarroRepository;
import jakarta.transaction.Transactional;

@Service
public class CarroService {
	
	
	@Autowired
	private CarroRepository carroRepository;
	
	@Transactional
	public void excluirPorMarca(String marca) {
		
		carroRepository.deleteByMarca(marca);
		
	}
	
	public List<Carro> listarPorAnoMenor(Integer ano){
		
		return carroRepository.findByAnoLessThan(ano);
		
	}
	
	public Carro salvarCarro(CarroDto carroDto) {
		
		Carro carro = new Carro(carroDto);
		return carroRepository.save(carro);
		
	}
	
	public List<Carro> listarCarros() {
		
		return carroRepository.findAll();
		
	}
	
	public void excluirCarro(Integer id) {
		
		carroRepository.deleteById(id);
		
	}
	
	public List<Carro> listarPorMarca(String marca) {
		
		return carroRepository.findByMarca(marca);
		
		
	}
	
	public List<Carro> listarPorModeloEAno(String modelo, Integer ano) {
		
		return carroRepository.findByModeloAndAno(modelo, ano);
		
	}

	public List<CarroDto> findCarroBy(String filtro, int indiceFiltro, List<CarroDto> listaCarro) {

		// 1 - marca / 2 - modelo / 3 - ano

		switch (indiceFiltro) {
		case 1:

			List<CarroDto> listaRetornoMarca = listaCarro.stream().filter(carro -> carro.getMarca().equals(filtro))
					.toList();

			return listaRetornoMarca;

		case 2:

			List<CarroDto> listaRetornoModelo = listaCarro.stream().filter(carro -> carro.getModelo().equals(filtro))
					.toList();

			return listaRetornoModelo;

		case 3:

			List<CarroDto> listaRetornoAno = listaCarro.stream()
					.filter(carro -> carro.getAno() == (Integer.parseInt(filtro))).toList();

			return listaRetornoAno;

		default:

			return null;

		}

	}

}
