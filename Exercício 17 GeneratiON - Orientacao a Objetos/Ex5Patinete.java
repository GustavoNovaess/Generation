/* Exercicio 5(Classe) - Orientação a Objeto
 * Autor: Gustavo Novaes Lima
 * Data: 10/05/2021
 */

package br.com.classes;

import java.util.Scanner;

public class Ex5Patinete {

	Scanner entrada = new Scanner(System.in);	
	
	//Atributos
	String modelo, marca;
	double preco, pesoMax;
	int rodas, qtdEstoque;
	char infantil;
	
	//Métodos
	
	void inserirSistema() { //Cadastro do Patinete no sistema 
		
		System.out.println("*****\tDigite os dados referentes ao Patinete que será inserido no sistema\t*****");
		
		System.out.println("\nModelo:");
		modelo = entrada.nextLine();
		
		System.out.println("\nMarca:");
		marca = entrada.nextLine();
		
		System.out.println("\nInfantil? (Digite 's' para sim e 'n' para não)");
		infantil = entrada.next(".").charAt(0);
		
		System.out.println("\nNúmero de rodas:");
		rodas = entrada.nextInt();
		
		System.out.println("\nPeso Máximo que o Patinete aguenta:");
		pesoMax = entrada.nextDouble();
		
		System.out.println("\nPreço:");
		preco = entrada.nextDouble();
		
		System.out.println("\nQuantidade em estoque:");
		qtdEstoque = entrada.nextInt();
	}
	
	
	void dadosPatinete() { //Visualização dos dados do patinete
		
		System.out.println("\n====================\n");
		System.out.println("Modelo: " + modelo);
		System.out.println("Marca: " + marca);
		
		if(infantil == 's' ) {
			System.out.println("Infantil: SIM");
		} else if (infantil == 'n' ) {
			System.out.println("Infantil: NÃO");
		} else {
			System.out.println("Infantil: ???");
		}
		
		System.out.println("Número de rodas: " + rodas);
		System.out.println("Peso Máximo: " + pesoMax + " kg");
		System.out.println("Preço: R$ " + preco);
		System.out.println("Quantida em Estoque: " + qtdEstoque);
		System.out.println("\n====================\n");
		
	}
	
	
	void estoque() { // Verifica se há patinetes no estoque
		if(qtdEstoque > 0) {
			System.out.println("Há " + qtdEstoque + " patinetes do modelo ||" + modelo + "|| no estoque.");
		} else {
			System.out.println("Não há patinetes do modelo ||" + modelo + "|| no estoque.");
		}
	}
}
