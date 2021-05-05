/* Introdução a JAVA - Exercicio 6
 * Autor: Gustavo Novaes Lima
 * Data: 05/05/2021
 */

import java.util.Scanner;
import java.lang.Math;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double x1, y1, x2, y2, distEuclidiana;
		
		System.out.println("Insira as coordenadas (x1,y1) do primeiro ponto:");
		x1 = entrada.nextDouble();
		y1 = entrada.nextDouble();
		
		System.out.println("Insira as coordenadas (x2,y2) do segundo ponto:");
		x2 = entrada.nextDouble();
		y2 = entrada.nextDouble();
		
		entrada.close();
		
		distEuclidiana = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
		
		System.out.println("A distância euclidiana entre os pontos é:\nd = ");
		System.out.printf("%.2f",distEuclidiana);
	}
	
}
