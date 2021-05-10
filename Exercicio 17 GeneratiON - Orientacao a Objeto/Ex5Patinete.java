/* Exercicio 5(Classe) - Orienta��o a Objeto
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
	
	//M�todos
	
	void inserirSistema() { //Cadastro do Patinete no sistema 
		
		System.out.println("*****\tDigite os dados referentes ao Patinete que ser� inserido no sistema\t*****");
		
		System.out.println("\nModelo:");
		modelo = entrada.nextLine();
		
		System.out.println("\nMarca:");
		marca = entrada.nextLine();
		
		System.out.println("\nInfantil? (Digite 's' para sim e 'n' para n�o)");
		infantil = entrada.next(".").charAt(0);
		
		System.out.println("\nN�mero de rodas:");
		rodas = entrada.nextInt();
		
		System.out.println("\nPeso M�ximo que o Patinete aguenta:");
		pesoMax = entrada.nextDouble();
		
		System.out.println("\nPre�o:");
		preco = entrada.nextDouble();
		
		System.out.println("\nQuantidade em estoque:");
		qtdEstoque = entrada.nextInt();
	}
	
	
	void dadosPatinete() { //Visualiza��o dos dados do patinete
		
		System.out.println("\n====================\n");
		System.out.println("Modelo: " + modelo);
		System.out.println("Marca: " + marca);
		
		if(infantil == 's' ) {
			System.out.println("Infantil: SIM");
		} else if (infantil == 'n' ) {
			System.out.println("Infantil: N�O");
		} else {
			System.out.println("Infantil: ???");
		}
		
		System.out.println("N�mero de rodas: " + rodas);
		System.out.println("Peso M�ximo: " + pesoMax + " kg");
		System.out.println("Pre�o: R$ " + preco);
		System.out.println("Quantida em Estoque: " + qtdEstoque);
		System.out.println("\n====================\n");
		
	}
	
	
	void estoque() { // Verifica se h� patinetes no estoque
		if(qtdEstoque > 0) {
			System.out.println("H� " + qtdEstoque + " patinetes do modelo ||" + modelo + "|| no estoque.");
		} else {
			System.out.println("N�o h� patinetes do modelo ||" + modelo + "|| no estoque.");
		}
	}
}
