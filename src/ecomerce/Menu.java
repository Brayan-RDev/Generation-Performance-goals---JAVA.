package ecomerce;

import java.util.InputMismatchException;
import java.util.Scanner;

import ecomerce.controller.ProdutoController;
import ecomerce.model.ProdutoCamiseta;

public class Menu {

	public static void main(String[] args) {		
	Scanner scan = new Scanner(System.in);
	ProdutoController produto = new ProdutoController();
	int escolha, id, quantidade;
	String tamanho = "", nome, tipoDeProduto;
	float preco;
	
	ProdutoCamiseta c1 = new ProdutoCamiseta(produto.gerarNumero(), "M", "Camiseta", "Camiseta Poliester Branca", 50f, 32);
	produto.cadastrar(c1);
	
	ProdutoCamiseta c2 = new ProdutoCamiseta(produto.gerarNumero(), "P", "Camiseta Social", "Camiseta Social Preta", 150f, 13);
	produto.cadastrar(c2);
	
	ProdutoCamiseta c3 = new ProdutoCamiseta(produto.gerarNumero(), "G", "Camiseta Polo", "Camiseta Polo Lilás", 100f, 17);
	produto.cadastrar(c3);
	
		do {
			System.out.println("-------- E-commerce-Roupas --------\n"
							 + "1 - Cadastrar Produto\n" 
							 + "2 - Listar Todos Produtos\n" 
							 + "3 - Buscar Produto por ID\n" 
							 + "4 - Atualizar Dados do Produto\n"
							 + "5 - Deletar Produto\n"
							 + "6 - Sair\n"
							 + "-----------------------------------\n"
							 + "Entre com a opção desejada: ");
			
			try {
				escolha = scan.nextInt();
				scan.nextLine();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				scan.nextLine();
				escolha = 0;
			}
			
			switch (escolha) {
				case 1:{
					System.out.println("\nCADASTRAR PRODUTO");
					
					do{
						try {
							System.out.println("\nEscolha o tamanho da Camiseta"
											 + "1 - P\n" 
											 + "2 - M\n" 
											 + "3 - G\n");
							escolha = scan.nextInt();
							scan.nextLine();
						}catch(InputMismatchException e){
							System.out.println("\nDigite valores inteiros!");
							scan.nextLine();
							escolha = 0;
						}
						
						switch(escolha) {
							case 1: {
								tamanho = "P";
								break;
							}
							case 2: {
								tamanho = "M";
								break;
							}
							case 3: {
								tamanho = "G";
								break;
							}
							default:{
								System.out.println("\nOpção Invalida!");
								break;
							}
						}
					}while(escolha != 1 && escolha != 2 && escolha != 3);
					
					System.out.println("\nDigite o tipo de produto");
					tipoDeProduto = scan.nextLine();
					
					System.out.println("\nDigite o Nome do produto");
					nome = scan.nextLine();
					
					System.out.println("\nDigite o Preço do produto");
					preco = scan.nextFloat();
					
					System.out.println("\nDigite a Quantidade de produtos dispiniveis");
					quantidade = scan.nextInt();
					scan.nextLine();
					
					produto.cadastrar(new ProdutoCamiseta(produto.gerarNumero(), tamanho, tipoDeProduto, nome, preco, quantidade));
					
					break;
				}
				case 2:{
					System.out.println("\nLISTAR PRODUTOS");
					produto.listarTodas();
					break;
				}
				case 3:{
					System.out.println("\nBUSCAR PRODUTOS PELO ID");
					System.out.println("\nEntre Com o ID do produto: ");
					id = scan.nextInt();
					scan.nextLine();
					
					produto.procurarPorNumero(id);
					break;
				}
				case 4:{
					System.out.println("\nATUALIZAR DADOS DO PRODUTO");
					break;
				}
				case 5:{
					System.out.println("\nDELETAR PRODUTO");
					break;
				}
				case 6:{
					break;			
				}
				default:{
					System.out.println("\nOpção Invalida!");
					break;
				}
			}
		}while(escolha != 6);
		
		System.out.println("\nPrograma Finalizado");
		scan.close();
	}

}
