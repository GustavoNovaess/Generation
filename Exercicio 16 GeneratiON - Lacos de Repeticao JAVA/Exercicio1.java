/* Exerc�cio 1
 * Autor: Gustavo Novaes Lima
 * Data: 06/05/2021
 */

//import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		//Scanner entrada = new Scanner(System.in);
		int i,c = 0; // c � um contador usado para pular linhas
		
		for (i = 1000 ; i <= 1999 ; i++) {
			
			if(i%11 == 5) {
				
				System.out.print(i + "\t"); // imprime os m�ltiplos de 11 de maneira tabulada.
				c++;
				
			}
			
			if(c == 5) {
				System.out.println(); // para melhor visualiza��o, pula uma linha a cada 5 n�meros impressos 
				c = 0;
			}
			
		}
		
	}
	
}
