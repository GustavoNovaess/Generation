package org.generation.lojaGames.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import org.generation.lojaGames.model.Categoria;
import org.generation.lojaGames.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
	
	public List<Produto> findAllByCategoria(Categoria categoria);
	
	//public List<Produto> findAllByCategoriaAndDescricao(Categoria categoria, String descricao);
}
