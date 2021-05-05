/* Introdução a JAVA - Exercicio 7
 * Autor: Gustavo Novaes Lima
 * Data: 05/05/2021
 */

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Insira, respectivamente, os coeficientes a,b,c,d,e,f:");
		a = entrada.nextDouble();
		b = entrada.nextDouble();
		c = entrada.nextDouble();
		d = entrada.nextDouble();
		e = entrada.nextDouble();
		f = entrada.nextDouble();
		entrada.close();
		
		x =(c*e - b*f)/(a*e - b*d);
		y =(a*f - c*d)/(a*e - b*d);
		
		System.out.println("Resultado:\nx = " + x + "\ny = " + y);
		
	}
	
}
