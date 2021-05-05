/* Exercícios Adicionais - Exercício 4
 * Autor: Gustavo Novaes Lima
 * Data: 05/05/2021
 * 4-	Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar.
 *  Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
 */

import java.util.Scanner;

public class ExercicioAdicional4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Insira um número:");
		numero = entrada.nextDouble();
		entrada.close();
		
		if(numero%2 == 0) {
			System.out.println("O número inserido é par e sua raiz quadrada é " + Math.sqrt(numero));
		} else {
			System.out.println("O número inserido é impar e seu quadrado é " + Math.pow(numero,2));
		}
		
	}
	
}
