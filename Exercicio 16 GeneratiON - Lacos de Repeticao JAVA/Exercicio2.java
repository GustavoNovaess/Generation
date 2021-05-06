/* Exercício 2
 * Autor: Gustavo Novaes Lima
 * Data: 06/05/2021
 */

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero, contPar = 0, contImpar = 0;
		
		for(int i = 1 ; i <= 10 ; i++) {
			
			System.out.println("Insira um numero:");
			numero = entrada.nextInt();
			
			if(numero%2 == 0) { // incrementa o contador de numeros pares
				contPar++;
			} else { // incrementa o contador de numeros impares
				contImpar++;
			}
		}
		
		entrada.close();
		System.out.println("Quantidade de números pares: " + contPar);
		System.out.println("Quantidade de números ímpares: " + contImpar);
		
	}
	
}
