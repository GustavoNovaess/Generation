/* Exercicio 2(Aplica��o) - Orienta��o a Objeto
 * Autor: Gustavo Novaes Lima
 * Data: 10/05/2021
 */

package br.com.classes;

import java.util.Scanner;

public class Ex2AplicacaoAviao {

	public static void main(String[] args) {
		
		/* Exemplo de Avi�o
		 * Modelo: Boeing 787 Dreamliner
		 * Fabricante: Boeing
		 * Empresa: GOL
		 * Passageiros:242 a 420
		 * Ano de Fabricacao: 2007
		 * Identificacao: ********
		 * VelocidadeMax: 1051 km/h
		 * VelocidadeCruzeiro: 958 km/h
		 * Velocidade: ******
		 */
		
		//Instancia��o do objeto
		Scanner entrada = new Scanner(System.in);
		Ex2Aviao aviao1 = new Ex2Aviao();
		
		char controle;
		double velocidadeModificadora,finalizador = 0.0; //finalizador controla o loop
		
		aviao1.inserirSistema();
		
		//Controle de velocidade
		System.out.println("\nDigite a velocidade atual do avi�o: ");
		aviao1.velocidade = entrada.nextDouble();
		
		do {
			System.out.println("\nPRESSIONE:");
			System.out.println("A tecla '+' se deseja acelerar o avi�o;");
			System.out.println("A tecla '-' se deseja desacelerar o avi�o;");
			System.out.println("A tecla '=' se deseja conferir a velocidade atual do avi�o;");
			System.out.println("A tecla '/' caso queira conferir os dados de fabrica��o do avi�o;");
			System.out.println("A tecla '*' se deseja parar o controle de velocidade.");
			controle = entrada.next(".").charAt(0);
			switch(controle) {
			
			case '+':
				System.out.println("Digite a quantidade de km/h que deseja acelerar:");
				velocidadeModificadora = entrada.nextDouble();
				aviao1.aumentarVelocidade(velocidadeModificadora);
				break;
			case '-':
				System.out.println("Digite a quantidade de km/h que deseja desacelerar:");
				velocidadeModificadora = entrada.nextDouble();
				aviao1.reduzirVelocidade(velocidadeModificadora);
				break;
			case '=':
				System.out.println("A velocidade atual � de " + aviao1.velocidade +" km/h.");
				break;
			case '/':
				aviao1.dadosAviao();
				break;
			case '*':
				System.out.println("Controle de Velocidade Finalizado.");
				finalizador = 1.0;
				break;
			default:
				System.out.println("\nOPERA��O INV�LIDA\n");
			}
		}while(finalizador == 0.0);
		
		entrada.close();
	}
	
}
