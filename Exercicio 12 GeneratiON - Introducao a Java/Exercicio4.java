/* Introdução a JAVA - Exercicio 4
 * Autor: Gustavo Novaes Lima
 * Data: 05/05/2021
 */

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int a, b, c, r, s, d;
		
		System.out.println("Insira, respectivamente, os valores de A, B e C:");
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		entrada.close();
		
		r = (a+b)*(a+b);
		s = (b+c)*(b+c);
		
		d = (r+s)/2;
		
		System.out.println("O resultado do sistema é:\nD = " + d);
		
	}
	
}
