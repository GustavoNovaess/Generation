/* Exerc�cios Adicionais - Exerc�cio 4
 * Autor: Gustavo Novaes Lima
 * Data: 05/05/2021
 * 4-	Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar.
 *  Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
 */

import java.util.Scanner;

public class ExercicioAdicional4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Insira um n�mero:");
		numero = entrada.nextDouble();
		entrada.close();
		
		if(numero%2 == 0) {
			System.out.println("O n�mero inserido � par e sua raiz quadrada � " + Math.sqrt(numero));
		} else {
			System.out.println("O n�mero inserido � impar e seu quadrado � " + Math.pow(numero,2));
		}
		
	}
	
}
