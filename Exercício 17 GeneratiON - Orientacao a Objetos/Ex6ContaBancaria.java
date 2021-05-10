/* Exercicio 6(Classe) - Orientação a Objeto
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
	
	//Métodos
	void cadastro() { // Cadastro do dono da conta bancária no sistema
		System.out.println("=====\tCADASTRO CONTA BANCÁRIA\t=====");
		System.out.println("INSIRA OS DADOS SOLICITADOS");
		
		System.out.println("\nNome do Cliente:");
		nomeCliente = entrada.nextLine();
		
		System.out.println("\nBanco:");
		nomeBanco = entrada.nextLine();
		
		System.out.println("\nNúmero da Conta:");
		numeroConta = entrada.nextLine();
		
		System.out.println("\nAgência:");
		agencia = entrada.nextLine();
		
		System.out.println("\nGerente da Agência:");
		agenciaGerente = entrada.nextLine();
		
		System.out.println("\nSaldo atual");
		saldo = entrada.nextDouble();
		
		System.out.println("\nO cadastro foi finalizado com sucesso.\n");
	}
	
	
	void dadosContaBancaria() { // Visualização dos Dados da Conta Bancária
		System.out.println("\n====================\n");
		System.out.println("Nome do Cliente: " + nomeCliente);
		System.out.println("Banco: " + nomeBanco);
		System.out.println("Número da Conta: " + numeroConta);
		System.out.println("Agência: " + agencia);
		System.out.println("Gerenta da Agência: " + agenciaGerente);
		System.out.println("Saldo: R$ " + saldo);
		System.out.print("Cartão de Crédito? ");
		System.out.println("\n====================");
	}
	
	
}
