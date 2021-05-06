/* Exercicio 6
 * Autor: Gustavo Novaes Lima
 * Data: 06/05/2021
 */

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero, media = 0, multiplos = 0;
		
		System.out.println("Caso deseje parar, digite 0.\n");
		
		do {
		
			System.out.println("Digite um número");
			numero = entrada.nextInt();
			
			// quando é encontrado um numero múltiplo, media soma o numero e múltiplo é incrementado
			if(numero != 0 && numero%3 == 0) { // numero != 0 pois 0%3 é igual a 0.
				media += numero;
				multiplos++;
			}
			
		} while (numero !=0);
		
		entrada.close();
		// media contém a soma dos números multiplos, portanto dividimos media pela quantidade multiplos para obter a media aritmetica
		media /= multiplos ; 
		
		System.out.println("A média dos números múltiplos de 3 é:\nM = " + media);
	}
	
}
