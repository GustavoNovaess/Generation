/* Lista de Exercícios -- Arrays
 * Exercicio 3
 * Autor : Gustavo Novaes Lima
 * Data: 07/05/2021
 */

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int i, j, maiores10 = 0, matriz[][] = new int[3][3]; // declara uma matriz de dimensões 3x3
		
		for(i = 0 ; i < matriz.length ; i++) {
			for(j = 0 ; j < matriz[0].length ; j++) {
				System.out.println("Digite o elemento que deseja inserir na matriz:");
				matriz[i][j] = entrada.nextInt();
				
				if(matriz[i][j] > 10) { // analisa já na inserção dos dados se o elemento inserido é maior que 10
					maiores10++;
				}
				
			}
		}
		
		System.out.println("A quantidade de elementos maiores que 10 na matriz é de " +
							maiores10 + " elementos.");
	}
	
}
