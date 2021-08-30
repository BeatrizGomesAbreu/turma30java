package com.games.lojaGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.games.lojaGames.model.produto;

public interface produtoRepository extends JpaRepository<produto, Long> {
	public List<produto> findAllByDescricaoContainingIgnoreCase(String descricao);

}
