package br.com.senai.shark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.shark.model.ModelProduto;

public interface ProdutoRepository extends JpaRepository<ModelProduto, Integer> {

}