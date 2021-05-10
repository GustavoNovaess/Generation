/* Exercicio 2(Classe) - Orientação a Objeto
 * Autor: Gustavo Novaes Lima
 * Data: 10/05/2021
 */

package br.com.classes;

import java.util.Scanner;

public class Ex2Aviao {

	Scanner entrada = new Scanner(System.in);
	//Atributos
	String nomeFabricante, modelo, empresa;
	int assentos, identificacao, anoFabricacao;
	double velocidadeMax, velocidadeCruzeiro, velocidade;
	
	
	//Métodos
	void inserirSistema() { // Cadastro do avião no sistema
		
		System.out.println("Entre com os dados requisitados para cadastrar o avião no sistema.");
		
		System.out.println("\nInsira o modelo do avião: ");
		modelo = entrada.nextLine();
		
		System.out.println("\nInsira o nome da fabricante do " + modelo + ": ");
		nomeFabricante = entrada.nextLine();
		
		System.out.println("\nInsira o nome da empresa de aviação responsável pelo " + modelo + " que está sendo cadastrado: ");
		empresa = entrada.nextLine();
		
		System.out.println("\nInsira o ano em que o modelo foi fabricado: ");
		anoFabricacao = entrada.nextInt();
		
		System.out.println("\nInsira o código de identificação do " + modelo + " cadastrado: ");
		identificacao = entrada.nextInt();
		
		System.out.println("\nInsira o número de assentos do " + modelo + ": ");
		assentos = entrada.nextInt();
		
		System.out.println("\nInsira a velocidade máxima que o avião pode atingir: ");
		velocidadeMax = entrada.nextDouble();
		
		System.out.println("\nInsira a velocidade de Cruzeiro do avião: ");
		velocidadeCruzeiro = entrada.nextDouble();
	}
	
	void dadosAviao() { // Visualização dos dados do avião
		System.out.println("\n====================\n");
		System.out.println("Modelo: " + modelo);
		System.out.println("Fabricante: " + nomeFabricante);
		System.out.println("Empresa responsável: " + empresa);
		System.out.println("Ano de fabricação: " + anoFabricacao);
		System.out.println("Número de identificação: " + identificacao);
		System.out.println("Assentos: " + assentos);
		System.out.println("Velocidade Máxima: " + velocidadeMax);
		System.out.println("Velocidade de Cruzeiro: " + velocidadeCruzeiro);
		System.out.println("\n====================\n");
	}
	
	void aumentarVelocidade(double aceleracao) {
		
		velocidade += aceleracao;
		
		if(velocidade > velocidadeMax ) { // Não permite que o usuário ultrapasse a velocidade máxima
			velocidade = velocidadeMax;
			System.out.println("A velocidade máxima (" + velocidadeMax +" km/h) foi atingida.");
		} else if (velocidade > (velocidadeCruzeiro-75) && velocidade < (velocidadeCruzeiro + 75)) { // Busca deixar o usuário informado quanto a velocidade de cruzeiro
			System.out.println("Velocidade próxima a velocidade de cruzeiro.");
		} else {
			System.out.println("Você está se distanciando da velocidade de cruzeiro;");
		}
		
	}
	
	void reduzirVelocidade(double desaceleracao) {
		
		velocidade -= desaceleracao;
		if (velocidade > (velocidadeCruzeiro-75) && velocidade < (velocidadeCruzeiro + 75)) { // Busca deixar o usuário informado quanto a velocidade de cruzeiro
			System.out.println("Velocidade próxima a velocidade de cruzeiro.");
		} else {
			System.out.println("Você está se distanciando da velocidade de cruzeiro;");
		}
		
	}
	
}
