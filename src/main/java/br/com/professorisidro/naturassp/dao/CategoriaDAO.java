package br.com.professorisidro.naturassp.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.professorisidro.naturassp.model.Categoria;

public interface CategoriaDAO extends CrudRepository<Categoria, Integer> {
	
	public List<Categoria> findByNomeContainig(String palavra);
	
}
