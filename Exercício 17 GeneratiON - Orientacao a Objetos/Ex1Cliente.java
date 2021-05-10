/* Exercicio 1(Classe) - Orientação a Objeto
 * Autor: Gustavo Novaes Lima
 * Data: 10/05/2021
 */

package br.com.classes;

import java.util.Scanner;


public class Ex1Cliente {

	// Atributos
	String nome, endereco, email, dataNascimento,cep,rg,cpf,telefone;
	
	// Métodos
	void cadastro() { // Toda inserção de dados para o cadastro é feita em um único método afim de mais simplicidade na aplicação em que a classe será instanciada
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("=====\tCADASTRO\t=====");
		System.out.println("INSIRA OS DADOS SOLICITADOS");
		
		System.out.println("\nNome completo: ");
		nome = entrada.nextLine();
		
		System.out.println("\nData de nascimento: ");
		dataNascimento = entrada.nextLine();
		
		System.out.println("\nRG: ");
		rg = entrada.nextLine();
		
		System.out.println("\nCPF: ");
		cpf = entrada.nextLine();
		
		System.out.println("\nCEP: ");
		cep = entrada.nextLine();
		
		System.out.println("\nEndereço: ");
		endereco = entrada.nextLine();
		
		System.out.println("\nEmail: ");
		email = entrada.nextLine();
		
		System.out.println("\nTelefone: ");
		telefone = entrada.nextLine();

		entrada.close();
		System.out.println("\nSeu cadastro foi finalizado com sucesso.\n");
	}
	
	void verificarCadastro(String documentoCPF) { // Passa o cpf para buscar se o cliente já está cadastrado no sistema
		if (documentoCPF == cpf) {
			System.out.println("***** " +nome + " já está cadastrado(a) no sistema. *****");
		} else {
			System.out.println("*****" +nome + " não está cadastrado(a) no sistema. *****");
		}
	}
	
	
	void dadosCliente() { // Visualização dos dados do cliente
		System.out.println("\n====================\n");
		System.out.println("Nome: " + nome);
		System.out.println("Data de Nascimento: " + dataNascimento);
		System.out.println("RG: " + rg);
		System.out.println("CPF: " + cpf);
		System.out.println("CEP: " + cep);
		System.out.println("Endereço: " + endereco);
		System.out.println("Email: " + email);
		System.out.println("Telefone: " + telefone);
		System.out.println("\n====================");
	}
	
	
	
	
}
