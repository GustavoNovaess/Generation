package org.generation.farmaciaAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.generation.farmaciaAPI.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
}
