package br.com.professorisidro.naturassp.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.professorisidro.naturassp.model.Categoria;
import br.com.professorisidro.naturassp.model.Produto;

public interface ProdutoDAO extends CrudRepository<Produto, Integer>{

	public ArrayList<Produto> findAllByCategoria(Categoria categoria);
	public ArrayList<Produto> findAllByDisponivel(int disponivel);
	public ArrayList<Produto> findAllByDisponivelAndCategoria(int disponivel, Categoria cat);
}
