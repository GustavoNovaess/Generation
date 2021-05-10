/* Exercicio 3(Classe) - Orientação a Objeto
 * Autor: Gustavo Novaes Lima
 * Data: 10/05/2021
 */

package br.com.classes;

import java.util.Scanner;

public class Ex3ProdutoEletronico {

	Scanner entrada = new Scanner(System.in);
	
	//Atributos
	String tipo, modelo, fabricante,codigoProduto;
	double preco, precoPromocao; 
	char promocao;
	
	//Metodos
	void cadastro() { // Cadastro do produto eletrônico
		System.out.print("\nDigite o tipo de produto eletrônico que deseja cadastrar no sistema: ");
		tipo = entrada.nextLine();
		
		System.out.println("\nDigite o modelo do produto: ");
		modelo = entrada.nextLine();
		
		System.out.println("\nDigite o nome da fabricante: ");
		fabricante = entrada.nextLine();
		
		System.out.println("\nInsira o código do produto: ");
		codigoProduto = entrada.nextLine();
		
		System.out.println("\nInsira o preço pelo qual o produto será vendido: ");
		preco = entrada.nextDouble();
		
	}
	
	void dadosProduto() { // Visualização dos dados do produto eletrônico
		
		System.out.println("\n====================\n");
		System.out.println("Tipo de produto eletrônico: " + tipo);
		System.out.println("Modelo: " + modelo);
		System.out.println("Fabricante: " + fabricante);
		System.out.println("Preço: R$ " + preco);
		System.out.println("Código: " + codigoProduto);
		
		if (promocao == 's') {
			System.out.println("Preço na promoção: R$ " + precoPromocao);
		} else {
			System.out.println("O produto em questão não está em promoção.");
		}
		
		System.out.println("\n====================\n");
		
	}
	
	void promocao() { // Dá um desconto de 10%;
		
		System.out.println("Deseja colocar o produto em promoção? (Digite 's' para sim e 'n' para não)");
		promocao = entrada.next(".").charAt(0);
		
		if(promocao == 's') {
			precoPromocao =  preco*(0.90);
		}
		
	}
}
