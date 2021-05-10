/* Exercicio 7(Classe) - Orienta��o a Objeto
 * Autor: Gustavo Novaes Lima
 * Data: 10/05/2021
 */

package br.com.classes;

import java.util.Scanner;

public class Ex7Paciente {

	Scanner entrada = new Scanner(System.in);
	
	//Atributos
	String nomePaciente,nomeMedico, leito, leitoTipo, alta, enfermidade, registro;
	
	//M�todos
	void cadastro() { // Cadastro do Paciente no Sistema
		System.out.println("=====\tCADASTRO DE PACIENTE\t=====");
		System.out.println("INSIRA OS DADOS SOLICITADOS");
		
		System.out.println("\nNome do Paciente: ");
		nomePaciente = entrada.nextLine();
		
		System.out.println("\nC�digo de Registro do Paciente: ");
		registro = entrada.nextLine();
		
		System.out.println("\nNome do M�dico Respons�vel: ");
		nomeMedico = entrada.nextLine();
		
		System.out.println("\nEnfermidade do Paciente: ");
		enfermidade = entrada.nextLine();
		
		System.out.println("\nTipo de leito no qual o paciente est�: ");
		leitoTipo = entrada.nextLine();
		
		System.out.println("\nLeito do paciente: ");
		leito = entrada.nextLine();
		
		System.out.println("\nH� previs�o de alta para o paciente, se sim quantos dias?");
		alta = entrada.nextLine();
		
		System.out.println("\nO cadastro foi finalizado com sucesso.\n");
	}
	
	void dadosPaciente() { // Visualiza��o dos dados do Paciente
		System.out.println("\n====================\n");
		System.out.println("Nome do paciente: " + nomePaciente);
		System.out.println("C�digo de registro do paciente: " + registro);
		System.out.println("Nome do M�dico Respons�vel: " + nomeMedico);
		System.out.println("Enfermidade do Paciente: " + enfermidade);
		System.out.println("Tipo de Leito do Paciente: " + leitoTipo);
		System.out.println("Leito do Paciente: " + leito);
		System.out.println("Previs�o de Alta: " + alta);
		System.out.println("\n====================\n");
	}
	
	void mudarMedicoResponsavel() { // Caso seja desejado mudar o m�dico respons�vel pelo caso
		System.out.println("Insira o novo m�dico respons�vel pelo paciente " + nomePaciente);
		nomeMedico = entrada.nextLine();
	}
}
