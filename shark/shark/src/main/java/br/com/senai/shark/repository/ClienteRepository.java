package br.com.senai.shark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.shark.model.ModelCliente;

public interface ClienteRepository extends JpaRepository<ModelCliente, Integer> {

}