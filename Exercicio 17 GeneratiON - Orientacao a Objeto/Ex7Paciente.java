/* Exercicio 7(Classe) - Orientação a Objeto
 * Autor: Gustavo Novaes Lima
 * Data: 10/05/2021
 */

package br.com.classes;

import java.util.Scanner;

public class Ex7Paciente {

	Scanner entrada = new Scanner(System.in);
	
	//Atributos
	String nomePaciente,nomeMedico, leito, leitoTipo, alta, enfermidade, registro;
	
	//Métodos
	void cadastro() { // Cadastro do Paciente no Sistema
		System.out.println("=====\tCADASTRO DE PACIENTE\t=====");
		System.out.println("INSIRA OS DADOS SOLICITADOS");
		
		System.out.println("\nNome do Paciente: ");
		nomePaciente = entrada.nextLine();
		
		System.out.println("\nCódigo de Registro do Paciente: ");
		registro = entrada.nextLine();
		
		System.out.println("\nNome do Médico Responsável: ");
		nomeMedico = entrada.nextLine();
		
		System.out.println("\nEnfermidade do Paciente: ");
		enfermidade = entrada.nextLine();
		
		System.out.println("\nTipo de leito no qual o paciente está: ");
		leitoTipo = entrada.nextLine();
		
		System.out.println("\nLeito do paciente: ");
		leito = entrada.nextLine();
		
		System.out.println("\nHá previsão de alta para o paciente, se sim quantos dias?");
		alta = entrada.nextLine();
		
		System.out.println("\nO cadastro foi finalizado com sucesso.\n");
	}
	
	void dadosPaciente() { // Visualização dos dados do Paciente
		System.out.println("\n====================\n");
		System.out.println("Nome do paciente: " + nomePaciente);
		System.out.println("Código de registro do paciente: " + registro);
		System.out.println("Nome do Médico Responsável: " + nomeMedico);
		System.out.println("Enfermidade do Paciente: " + enfermidade);
		System.out.println("Tipo de Leito do Paciente: " + leitoTipo);
		System.out.println("Leito do Paciente: " + leito);
		System.out.println("Previsão de Alta: " + alta);
		System.out.println("\n====================\n");
	}
	
	void mudarMedicoResponsavel() { // Caso seja desejado mudar o médico responsável pelo caso
		System.out.println("Insira o novo médico responsável pelo paciente " + nomePaciente);
		nomeMedico = entrada.nextLine();
	}
}
