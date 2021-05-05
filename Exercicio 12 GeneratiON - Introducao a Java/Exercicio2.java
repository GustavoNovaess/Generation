/* Introdução a JAVA - Exercicio 2
 * Autor: Gustavo Novaes Lima
 * Data: 05/05/2021
 */

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int dias, meses = 0, anos = 0, bissexto = 0;
		
		System.out.println("Insira sua idade expressa em dias:");
		dias = entrada.nextInt();
		
		entrada.close();
		
		while(dias >= 365) { // vai subtraindo a quantidade de dias por 365 e incrementando a quantidade de anos por 1
			anos++;
			dias -= 365;
			bissexto++;
			
			if (bissexto == 4) { // a cada 4 anos descontamos um dia do ano bissexto
				dias--;
				bissexto = 0;
			}
		}
		
		while(dias >= 30) { // vai subtraindo os dias por 30 e incrementando a quantidade de meses
			meses++;
			dias -= 30;
		}
		
		System.out.println("Você tem " + anos + " Anos, " + meses + " Meses e " +
							dias + " Dias de idade.");
		
	}
	
}
