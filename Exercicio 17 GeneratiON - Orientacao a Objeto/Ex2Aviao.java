/* Exercicio 2(Classe) - Orienta��o a Objeto
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
	
	
	//M�todos
	void inserirSistema() { // Cadastro do avi�o no sistema
		
		System.out.println("Entre com os dados requisitados para cadastrar o avi�o no sistema.");
		
		System.out.println("\nInsira o modelo do avi�o: ");
		modelo = entrada.nextLine();
		
		System.out.println("\nInsira o nome da fabricante do " + modelo + ": ");
		nomeFabricante = entrada.nextLine();
		
		System.out.println("\nInsira o nome da empresa de avia��o respons�vel pelo " + modelo + " que est� sendo cadastrado: ");
		empresa = entrada.nextLine();
		
		System.out.println("\nInsira o ano em que o modelo foi fabricado: ");
		anoFabricacao = entrada.nextInt();
		
		System.out.println("\nInsira o c�digo de identifica��o do " + modelo + " cadastrado: ");
		identificacao = entrada.nextInt();
		
		System.out.println("\nInsira o n�mero de assentos do " + modelo + ": ");
		assentos = entrada.nextInt();
		
		System.out.println("\nInsira a velocidade m�xima que o avi�o pode atingir: ");
		velocidadeMax = entrada.nextDouble();
		
		System.out.println("\nInsira a velocidade de Cruzeiro do avi�o: ");
		velocidadeCruzeiro = entrada.nextDouble();
	}
	
	void dadosAviao() { // Visualiza��o dos dados do avi�o
		System.out.println("\n====================\n");
		System.out.println("Modelo: " + modelo);
		System.out.println("Fabricante: " + nomeFabricante);
		System.out.println("Empresa respons�vel: " + empresa);
		System.out.println("Ano de fabrica��o: " + anoFabricacao);
		System.out.println("N�mero de identifica��o: " + identificacao);
		System.out.println("Assentos: " + assentos);
		System.out.println("Velocidade M�xima: " + velocidadeMax);
		System.out.println("Velocidade de Cruzeiro: " + velocidadeCruzeiro);
		System.out.println("\n====================\n");
	}
	
	void aumentarVelocidade(double aceleracao) {
		
		velocidade += aceleracao;
		
		if(velocidade > velocidadeMax ) { // N�o permite que o usu�rio ultrapasse a velocidade m�xima
			velocidade = velocidadeMax;
			System.out.println("A velocidade m�xima (" + velocidadeMax +" km/h) foi atingida.");
		} else if (velocidade > (velocidadeCruzeiro-75) && velocidade < (velocidadeCruzeiro + 75)) { // Busca deixar o usu�rio informado quanto a velocidade de cruzeiro
			System.out.println("Velocidade pr�xima a velocidade de cruzeiro.");
		} else {
			System.out.println("Voc� est� se distanciando da velocidade de cruzeiro;");
		}
		
	}
	
	void reduzirVelocidade(double desaceleracao) {
		
		velocidade -= desaceleracao;
		if (velocidade > (velocidadeCruzeiro-75) && velocidade < (velocidadeCruzeiro + 75)) { // Busca deixar o usu�rio informado quanto a velocidade de cruzeiro
			System.out.println("Velocidade pr�xima a velocidade de cruzeiro.");
		} else {
			System.out.println("Voc� est� se distanciando da velocidade de cruzeiro;");
		}
		
	}
	
}
