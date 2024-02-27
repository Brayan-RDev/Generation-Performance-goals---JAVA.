package ecomerce.model;

public class ProdutoCamiseta extends Produto {
	private int quantidade;
	
	public ProdutoCamiseta(int id, String tamanho, String tipoDeProduto, String nome, float preco, int quantidade) {
		super(id, tamanho, tipoDeProduto, nome, preco);
		this.quantidade = quantidade;
	}
	
	public ProdutoCamiseta() {
		
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public void visualizar() {		
		System.out.println("--------Informações do Produto--------");
		System.out.println("ID do produto: " + getId());
		System.out.println("Tamanho: " + getTamanho());
		System.out.println("Tipo de Produto: " + getTipoDeProduto());
		System.out.println("Nome do Produto: " + getNome());
		System.out.println("Preço Unitário(R$): " + getPreco() + "\n"
						 + "Quantidade: " + getQuantidade()
						+ "\n--------------------------------------");
	}

}
