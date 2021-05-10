/* Exercicio 4(Classe) - Orienta��o a Objeto
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
	
	//M�todos
	
	void cadastro() {
		
		System.out.println("=====\tCADASTRO DE FUNCION�RIO\t=====");
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
		
		System.out.println("\nSal�rio: ");
		salario = entrada.nextDouble();
		
		System.out.println("\nO cadastro foi finalizado com sucesso.\n");
	}
	
	void dadosFuncionario() { // Visualiza��o dos dados do Funcion�rio
		System.out.println("\n====================\n");
		System.out.println("Nome: " + nome);
		System.out.println("Data de Nascimento: " + dataNascimento);
		System.out.println("Setor: " + setor);
		System.out.println("Cargo: " + cargo);
		System.out.println("Registro: " + registro);
		System.out.println("Salario: R$ " + salario);
		System.out.println("\n====================");
	}
	
	
	void aumentoSalario() { // Caso seja desejado dar um aumento ao funcion�rio
		System.out.println("Deseja dar um aumento a este funcion�rio? (Digite 's' para sim e 'n' para n�o)");
		aumento = entrada.next(".").charAt(0);
		if (aumento == 's') {
			salario *= 1.10;
			dadosFuncionario();
		}
	}
}
