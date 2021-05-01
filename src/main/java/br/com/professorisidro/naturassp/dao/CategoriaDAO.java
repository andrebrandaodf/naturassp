package br.com.professorisidro.naturassp.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.professorisidro.naturassp.model.Categoria;

@Repository
public interface CategoriaDAO extends CrudRepository<Categoria, Integer> {
	
	public List<Categoria> findByNomeContaining(String palavra);
	
}
