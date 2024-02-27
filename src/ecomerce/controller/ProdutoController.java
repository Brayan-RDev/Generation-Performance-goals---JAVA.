package ecomerce.controller;

import java.util.ArrayList;

import ecomerce.model.Produto;
import ecomerce.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository{
	
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int id) {
		var produto = buscarNaCollection(id);
		
		if(produto != null) {
			produto.visualizar();
		}
		else {
			System.out.println("\nProduto de ID: " + id + " Não foi encontrada!");
		}
	}

	@Override
	public void listarTodas() {
		for (var produto : listaProdutos){
			 produto.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO Produto de ID: " + produto.getId() + " Foi Cadastrado com sucesso!");
	}

	@Override
	public void atualizar(Produto produto) {
		var buscarConta = buscarNaCollection(produto.getId());
		
		if(buscarConta != null) {
			listaProdutos.set(listaProdutos.indexOf(buscarConta), produto);
			System.out.println("\nA conta número: " + produto.getId() + " Foi atualizada com sucesso!");
		}
		else {
			System.out.println("\nA conta número: " + produto.getId() + " não foi encontrada!");
		}
	}

	@Override
	public void deletar(int id) {
	var produto = buscarNaCollection(id);
		
		if(produto != null) {
			if(listaProdutos.remove(produto) == true) {
				System.out.println("\nA conta número: " + numero + " foi deletada com sucesso!");
			}
		}
		else {
			System.out.println("\nA conta número: " + produto.getId() + " não foi encontrada!");
		}
	}
	
	public int gerarNumero(){
		return numero = listaProdutos.size() + 1;
	}
	
	public Produto buscarNaCollection(int id) {
		for (var produto : listaProdutos) {
			if(produto.getId() == id) {
				return produto;
			}
		}
		return null;	
	}

}
