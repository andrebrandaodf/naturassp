package br.com.professorisidro.naturassp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.professorisidro.naturassp.dao.CategoriaDAO;
import br.com.professorisidro.naturassp.model.Categoria;

@Component
public class CategoriaServiceImpl implements ICategoriaService {

	@Autowired
	private CategoriaDAO dao;

	@Override
	public Categoria inseriNovaCategoria(Categoria categoria) {
		try {
			if(categoria.getNome() != null && categoria.getNome().trim().length() > 0) {
				dao.save(categoria);
				return categoria;
			}
		}
		catch (IllegalArgumentException ex) {
			System.out.println("DEBUG = "+ex.getMessage());
		}
		catch (Exception ex) {
			System.out.println("DEBUG = "+ex.getMessage());
		}
		return null;
	}

	@Override
	public Categoria alterarCategoria(Categoria categoria) {
		try {

			if(categoria.getId() != null && categoria.getNome() != null && categoria.getNome().trim().length() > 0) {
				dao.save(categoria);
				return categoria;
			}
		} 
		catch (Exception ex) {
			System.out.println("DEBUG = "+ex.getMessage());
		}
		return null;
	}

	@Override
	public List<Categoria> recuperarTodasCategorias() {

		return (List<Categoria>)dao.findAll();
	}

	@Override
	public List<Categoria> recuperarPorPalavraChave(String palavraChave) {

		if(palavraChave != null) {
			return dao.findByNomeContainig(palavraChave);
		}
		return null;
	}


}
