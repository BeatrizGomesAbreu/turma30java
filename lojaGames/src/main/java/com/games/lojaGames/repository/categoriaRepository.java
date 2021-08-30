package com.games.lojaGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.games.lojaGames.model.categoria;

@Repository
public interface categoriaRepository extends JpaRepository<categoria, Long> {
  public List <categoria> findAllByNomeContainingIgnoreCase(String nome);
	
}
