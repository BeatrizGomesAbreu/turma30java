package com.farmacia.farmaciaPopular.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.farmaciaPopular.model.produto;

public interface produtoRepository extends JpaRepository<produto, Long>{
	public List<produto> findAllByDescricaoContainingIgnoreCase(String descricao);

}
