package br.com.professorisidro.naturassp.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.professorisidro.naturassp.dao.ProdutoDAO;
import br.com.professorisidro.naturassp.model.Categoria;
import br.com.professorisidro.naturassp.model.Produto;

@Component
public class ProdutoServiceImpl implements IProdutoService {

	@Autowired	
	private ProdutoDAO dao;
	
	@Override
	public Produto inserirNovoProduto(Produto produto) {
		
		try {
			dao.save(produto);
			return produto;
		}
		catch(Exception ex){
			System.out.println("----- ProdutoService.inserirNovoProduto -----");
			ex.printStackTrace();
			System.out.println("---------------------------------------------");
		}
		return null;
	}

	@Override
	public Produto alterarProduto(Produto produto) {
		try {
			dao.save(produto);
			return produto;
		}
		catch(Exception ex){
			System.out.println("----- ProdutoService.alterarProduto -----");
			ex.printStackTrace();
			System.out.println("---------------------------------------------");
		}
		return null;
	}

	@Override
	public ArrayList<Produto> listarTodos() {
	
		return (ArrayList<Produto>)dao.findAll();
	}

	@Override
	public ArrayList<Produto> listarDisponiveis() {
		
		return dao.findAllByDisponivel(1); //Considero todos os produtos 1 como disponivel
	}

	@Override
	public ArrayList<Produto> listarPorCategoria(Categoria categoria) {

		return dao.findAllByDisponivelAndCategoria(1, categoria);
	}

	@Override
	public ArrayList<Produto> listarIndisponiveis() {
	
		return dao.findAllByDisponivel(0);
	}

	@Override
	public Produto recuperarPorId( int id) {
	
		return dao.findById(id).orElse(null);
	}

}
