/* Exercicio 1(Classe) - Orienta��o a Objeto
 * Autor: Gustavo Novaes Lima
 * Data: 10/05/2021
 */

package br.com.classes;

import java.util.Scanner;


public class Ex1Cliente {

	// Atributos
	String nome, endereco, email, dataNascimento,cep,rg,cpf,telefone;
	
	// M�todos
	void cadastro() { // Toda inser��o de dados para o cadastro � feita em um �nico m�todo afim de mais simplicidade na aplica��o em que a classe ser� instanciada
		
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
		
		System.out.println("\nEndere�o: ");
		endereco = entrada.nextLine();
		
		System.out.println("\nEmail: ");
		email = entrada.nextLine();
		
		System.out.println("\nTelefone: ");
		telefone = entrada.nextLine();

		entrada.close();
		System.out.println("\nSeu cadastro foi finalizado com sucesso.\n");
	}
	
	void verificarCadastro(String documentoCPF) { // Passa o cpf para buscar se o cliente j� est� cadastrado no sistema
		if (documentoCPF == cpf) {
			System.out.println("***** " +nome + " j� est� cadastrado(a) no sistema. *****");
		} else {
			System.out.println("*****" +nome + " n�o est� cadastrado(a) no sistema. *****");
		}
	}
	
	
	void dadosCliente() { // Visualiza��o dos dados do cliente
		System.out.println("\n====================\n");
		System.out.println("Nome: " + nome);
		System.out.println("Data de Nascimento: " + dataNascimento);
		System.out.println("RG: " + rg);
		System.out.println("CPF: " + cpf);
		System.out.println("CEP: " + cep);
		System.out.println("Endere�o: " + endereco);
		System.out.println("Email: " + email);
		System.out.println("Telefone: " + telefone);
		System.out.println("\n====================");
	}
	
	
	
	
}
