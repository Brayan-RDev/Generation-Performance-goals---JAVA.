package ecomerce;

import java.util.InputMismatchException;
import java.util.Scanner;

import ecomerce.model.ProdutoCamiseta;

public class Menu {

	public static void main(String[] args) {		
	Scanner scan = new Scanner(System.in);
	int escolha;
	
	ProdutoCamiseta c1 = new ProdutoCamiseta();
	
	c1.setId(1);
	c1.setNome("Camiseta Branca Poliester");
	c1.setTamanho("M");
	c1.setPreco(20f);
	c1.setTipoDeProduto("Camiseta");
	c1.setQuantidade(30);
	c1.visualizar();
	
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
					break;
				}
				case 2:{
					System.out.println("\nLISTAR PRODUTOS");
					break;
				}
				case 3:{
					System.out.println("\nBUSCAR PRODUTOS PELO ID");
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
				}
			}
		}while(escolha != 6);
		
		System.out.println("\nPrograma Finalizado");
		scan.close();
	}

}
