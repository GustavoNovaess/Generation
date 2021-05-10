/* Exercicio 4(Classe) - Orientação a Objeto
 * Autor: Gustavo Novaes Lima
 * Data: 10/05/2021
 */

package br.com.classes;

import java.util.Scanner;

public class Ex4Funcionario {

	Scanner entrada = new Scanner(System.in);
	
	//Atributos
	String nome,setor,cargo,dataNascimento, registro;
	double salario;
	char aumento;
	
	//Métodos
	
	void cadastro() {
		
		System.out.println("=====\tCADASTRO DE FUNCIONÁRIO\t=====");
		System.out.println("INSIRA OS DADOS SOLICITADOS");
		
		System.out.println("\nNome: ");
		nome = entrada.nextLine();
		
		System.out.println("\nData de Nascimento: ");
		dataNascimento = entrada.nextLine();
		
		System.out.println("\nSetor: ");
		setor = entrada.nextLine();
		
		System.out.println("\nCargo: ");
		cargo = entrada.nextLine();
		
		System.out.println("\nRegistro: ");
		registro = entrada.nextLine();
		
		System.out.println("\nSalário: ");
		salario = entrada.nextDouble();
		
		System.out.println("\nO cadastro foi finalizado com sucesso.\n");
	}
	
	void dadosFuncionario() { // Visualização dos dados do Funcionário
		System.out.println("\n====================\n");
		System.out.println("Nome: " + nome);
		System.out.println("Data de Nascimento: " + dataNascimento);
		System.out.println("Setor: " + setor);
		System.out.println("Cargo: " + cargo);
		System.out.println("Registro: " + registro);
		System.out.println("Salario: R$ " + salario);
		System.out.println("\n====================");
	}
	
	
	void aumentoSalario() { // Caso seja desejado dar um aumento ao funcionário
		System.out.println("Deseja dar um aumento a este funcionário? (Digite 's' para sim e 'n' para não)");
		aumento = entrada.next(".").charAt(0);
		if (aumento == 's') {
			salario *= 1.10;
			dadosFuncionario();
		}
	}
}
