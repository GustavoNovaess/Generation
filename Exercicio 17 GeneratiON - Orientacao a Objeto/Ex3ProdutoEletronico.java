/* Exercicio 3(Classe) - Orienta��o a Objeto
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
	void cadastro() { // Cadastro do produto eletr�nico
		System.out.print("\nDigite o tipo de produto eletr�nico que deseja cadastrar no sistema: ");
		tipo = entrada.nextLine();
		
		System.out.println("\nDigite o modelo do produto: ");
		modelo = entrada.nextLine();
		
		System.out.println("\nDigite o nome da fabricante: ");
		fabricante = entrada.nextLine();
		
		System.out.println("\nInsira o c�digo do produto: ");
		codigoProduto = entrada.nextLine();
		
		System.out.println("\nInsira o pre�o pelo qual o produto ser� vendido: ");
		preco = entrada.nextDouble();
		
	}
	
	void dadosProduto() { // Visualiza��o dos dados do produto eletr�nico
		
		System.out.println("\n====================\n");
		System.out.println("Tipo de produto eletr�nico: " + tipo);
		System.out.println("Modelo: " + modelo);
		System.out.println("Fabricante: " + fabricante);
		System.out.println("Pre�o: R$ " + preco);
		System.out.println("C�digo: " + codigoProduto);
		
		if (promocao == 's') {
			System.out.println("Pre�o na promo��o: R$ " + precoPromocao);
		} else {
			System.out.println("O produto em quest�o n�o est� em promo��o.");
		}
		
		System.out.println("\n====================\n");
		
	}
	
	void promocao() { // D� um desconto de 10%;
		
		System.out.println("Deseja colocar o produto em promo��o? (Digite 's' para sim e 'n' para n�o)");
		promocao = entrada.next(".").charAt(0);
		
		if(promocao == 's') {
			precoPromocao =  preco*(0.90);
		}
		
	}
}
