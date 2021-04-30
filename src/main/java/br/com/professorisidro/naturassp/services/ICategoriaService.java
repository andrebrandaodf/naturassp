package br.com.professorisidro.naturassp.services;

import java.util.List;

import br.com.professorisidro.naturassp.model.Categoria;

public interface ICategoriaService {

	public Categoria inseriNovaCategoria(Categoria categoria);
	
	public Categoria alterarCategoria(Categoria categoria);
	
	public List<Categoria> recuperarTodasCategorias();
	
	public List<Categoria> recuperarPorPalavraChave(String palavra);
	
}
