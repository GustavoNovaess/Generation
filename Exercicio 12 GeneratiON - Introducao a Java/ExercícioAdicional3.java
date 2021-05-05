/* Exerc�cios Adicionais - Exerc�cio 3
 * Autor: Gustavo Novaes Lima
 * Data: 05/05/2021
 * 3-	Fa�a um programa que receba a idade de uma pessoa e 
 * mostre na sa�da em qual categoria ela se encontra:
 * 10-14 infantil
 * 15-17 juvenil
 * 18-25 adulto
 */

import java.util.Scanner;

public class Exerc�cioAdicional3 {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Insira a idade da pessoa");
		idade = entrada.nextInt();
		entrada.close();
		
		if (idade >= 10 && idade <=14) {
			System.out.println("Infantil.");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("Juvenil.");
		} else if (idade >= 18 && idade <= 25) {
			System.out.println("Adulto.");
		} else {
			System.out.println("N�o h� categoria para a idade inserida.");
		}
		
	}
	
}
