package br.usjt.produtosgerenciador.service;

import java.util.List;

import br.produtosgerenciador.dao.ProdutoDAO;
import br.usjt.produtosgerenciador.model.Produto;



public class ProdutoService {
	
private ProdutoDAO produtoDao = new ProdutoDAO();
	
	
	public void cadastrarProduto(Produto produto) {
		produtoDao.cadastrar(produto);
	}

	
	public Produto consultarProduto(int codigo) {
		
		return produtoDao.consultar(codigo);	
	}

	
	public void atualizarProduto(Produto produto) {
		produtoDao.alterar(produto);
	}

	
	public void deletarProduto(Produto produto) {
		produtoDao.excluir(produto);
	}
	
	
	public List<Produto> listarProdutos() {
		
		return produtoDao.listarProdutos();	
	}

}
