package ecomerce.repository;

import ecomerce.model.Produto;

public interface ProdutoRepository {
	// CRUD do PRODUTO
	public void procurarPorNumero(int numero);	
	public void listarTodas();	
	public void cadastrar(Produto produto);	
	public void atualizar(Produto produto);	
	public void deletar(int numero);
}
