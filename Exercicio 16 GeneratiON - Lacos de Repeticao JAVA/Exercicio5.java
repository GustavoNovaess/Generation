/* Exercicio 5
 * Autor: Gustavo Novaes Lima
 * Data: 06/05/2021
 */

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero, soma = 0;
		
		System.out.println("Caso deseje parar, digite 0.\n");
		
		do {
			
			System.out.println("Digite um número:");
			numero = entrada.nextInt();
			soma += numero;
			
		}while(numero != 0);
	
		entrada.close();
		System.out.println("A soma dos números inseridos é: " + soma);
		
	}
	
}
