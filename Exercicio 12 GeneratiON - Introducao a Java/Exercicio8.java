/* Introdução a JAVA - Exercicio 8
 * Autor: Gustavo Novaes Lima
 * Data: 05/05/2021
 */

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double custoFabrica, custoConsumidor;
		
		System.out.println("Insira o custo de fábrica do carro:");
		custoFabrica = entrada.nextDouble();
		entrada.close();
		
		custoConsumidor = (custoFabrica*1.28)*1.45;// 28% do distribuidor e 45% dos impostos
		
		System.out.print("O custo ao consumidor será de R$");
		System.out.printf("%.2f", custoConsumidor);
	}

}
