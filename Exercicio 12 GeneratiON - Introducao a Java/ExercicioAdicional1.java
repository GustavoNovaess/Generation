/* Exercícios Adicionais - Exercício 1
 * Autor: Gustavo Novaes Lima
 * Data: 05/05/2021
 * 1 - Faça um programa que receba três inteiros e diga qual deles é o maior.
 */

import java.util.Scanner;

public class ExercicioAdicional1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int a,b,c,maior;
		
		System.out.println("Insira os 3 inteiros que deseja comparar:");
		
		a = entrada.nextInt();
		maior = a; //inicializamos maior com o valor de "a", já que quando a é inserido, ele é o maior inteiro
		
		b = entrada.nextInt();
		if(b > maior) { // caso b seja maior que o valor da varíavel "maior", substitua
			maior = b;
		}
		
		c = entrada.nextInt();
		if(c > maior) { // caso c seja maior que o valor da varíavel "maior", substitua
			maior = c;
		}
		entrada.close();
		
		System.out.println("O maior inteiro que você inseriu foi " + maior);
	}
	
}
