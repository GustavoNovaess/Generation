/* Exercicio 6(Classe) - Orienta��o a Objeto
 * Autor: Gustavo Novaes Lima
 * Data: 10/05/2021
 */

package br.com.classes;

import java.util.Scanner;

public class Ex6ContaBancaria {

	Scanner entrada = new Scanner(System.in);

	//Atributos
	String nomeCliente, nomeBanco, agencia, numeroConta, agenciaGerente,cartaoCredito ="";
	double saldo;
	char possuiCartao;
	
	//M�todos
	void cadastro() { // Cadastro do dono da conta banc�ria no sistema
		System.out.println("=====\tCADASTRO CONTA BANC�RIA\t=====");
		System.out.println("INSIRA OS DADOS SOLICITADOS");
		
		System.out.println("\nNome do Cliente:");
		nomeCliente = entrada.nextLine();
		
		System.out.println("\nBanco:");
		nomeBanco = entrada.nextLine();
		
		System.out.println("\nN�mero da Conta:");
		numeroConta = entrada.nextLine();
		
		System.out.println("\nAg�ncia:");
		agencia = entrada.nextLine();
		
		System.out.println("\nGerente da Ag�ncia:");
		agenciaGerente = entrada.nextLine();
		
		System.out.println("\nSaldo atual");
		saldo = entrada.nextDouble();
		
		System.out.println("\nO cadastro foi finalizado com sucesso.\n");
	}
	
	
	void dadosContaBancaria() { // Visualiza��o dos Dados da Conta Banc�ria
		System.out.println("\n====================\n");
		System.out.println("Nome do Cliente: " + nomeCliente);
		System.out.println("Banco: " + nomeBanco);
		System.out.println("N�mero da Conta: " + numeroConta);
		System.out.println("Ag�ncia: " + agencia);
		System.out.println("Gerenta da Ag�ncia: " + agenciaGerente);
		System.out.println("Saldo: R$ " + saldo);
		System.out.print("Cart�o de Cr�dito? ");
		System.out.println("\n====================");
	}
	
	
}
