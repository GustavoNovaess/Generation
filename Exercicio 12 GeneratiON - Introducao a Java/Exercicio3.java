/* Introdução a JAVA - Exercicio 3
 * Autor: Gustavo Novaes Lima
 * Data: 05/05/2021
 */

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int segundos, minutos, horas;
		
		System.out.println("Insira a duração do evento em segundos:");
		segundos = entrada.nextInt();
		
		entrada.close();
		
		// divisão para obter horas,minutos e segundos
		horas = segundos/3600;
		minutos = (segundos%3600)/60;
		segundos = (segundos%3600)%60;
		
		System.out.println("O evento durou " + horas + " Horas, " + minutos + " Minutos e " +
							segundos + " Segundos.");
		
		
	}
	
}
