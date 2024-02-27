package ecomerce.model;

public abstract class Produto{
	private int id;
	private String tamanho;
	private String tipoDeProduto;
	private String nome;
	private float preco;
	
	public Produto(int id, String tamanho, String tipoDeProduto, String nome, float preco) {
		this.id = id;
		this.tamanho = tamanho;
		this.tipoDeProduto = tipoDeProduto;
		this.nome = nome;
		this.preco = preco;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getTipoDeProduto() {
		return tipoDeProduto;
	}

	public void setTipoDeProduto(String tipoDeProduto) {
		this.tipoDeProduto = tipoDeProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void visualizar() {		
		System.out.println("--------Informações do Produto--------");
		System.out.println("ID do produto: " + this.id);
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Tipo de Produto: " + this.tipoDeProduto);
		System.out.println("Nome do Produto: " + this.nome);
		System.out.println("Preço Unitário: " + this.preco 
						 + "\n------------------------------------");
	}

	public Produto() {
		
	}
}
