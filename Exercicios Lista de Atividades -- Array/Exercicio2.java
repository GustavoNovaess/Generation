/* Lista de Exercícios -- Arrays
 * Exercicio 2
 * Autor : Gustavo Novaes Lima
 * Data: 07/05/2021
 */

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int i, somapar = 0, somaimpar = 0, numero[] = new int[6];
		
		for(i = 0 ; i < numero.length ; i++) { // Entrada de dados
			System.out.println("Insira um número inteiro:");
			numero[i] = entrada.nextInt();
		}
		
		
		System.out.println("\n===== NUMEROS PARES =====\n");
		for(i = 0 ; i < numero.length ; i++) { 
			if(numero[i]%2 == 0) { // realiza a impressão e soma dos números pares
				System.out.print(numero[i] + "\t");
				somapar += numero[i];
			}
		}
		
		System.out.println("\n\nA soma dos números pares digitados é igual a: " + somapar);
		System.out.println("\n===== NUMEROS ÍMPARES =====\n");
		for(i = 0 ; i < numero.length ; i++) {
			if(numero[i]%2 != 0) { // realiza a impressão e soma dos números ímpares
				System.out.print(numero[i] + "\t");
				somaimpar += numero[i];
			}
		}
		
		System.out.println("\n\nA soma dos números ímpares digitados é igual a: " + somaimpar);
	}
}
