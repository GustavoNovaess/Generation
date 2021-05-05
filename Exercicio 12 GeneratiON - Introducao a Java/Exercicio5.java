/* Introdução a JAVA - Exercicio 5
 * Autor: Gustavo Novaes Lima
 * Data: 05/05/2021
 */

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		double peso1 = 0.23,peso2 = 0.5, peso3 = peso2 - peso1;
		
		System.out.println("Insira, respectivamente, as 3 notas do aluno:");
		nota1 = entrada.nextInt();
		nota2 = entrada.nextInt();
		nota3 = entrada.nextInt();
		entrada.close();
		
		media = peso1*nota1 + peso2*nota2 + peso3*nota3; // media ponderada das notas
		
		System.out.println("A media final do aluno é:\nMedia = ");
		System.out.printf("abc%.2f",media);
		
	}
	
}
