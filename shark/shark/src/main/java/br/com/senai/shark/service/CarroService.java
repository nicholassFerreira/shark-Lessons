package br.com.senai.shark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.shark.dto.CarroDto;
import br.com.senai.shark.model.Carro;
import br.com.senai.shark.repository.CarroRepository;

@Service
public class CarroService {
	
	
	@Autowired
	private CarroRepository carroRepository;
	
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
