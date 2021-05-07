/* Lista de Exerc�cios -- Arrays
 * Exercicio 4
 * Autor : Gustavo Novaes Lima
 * Data: 07/05/2021
 */

import java.util.Scanner;

public class Exercicio4 {
	
	public static void imprimirMatriz(double M[][]) { // Fun�ao utilizada para impress�o das 3 matrizes
		for(int i = 0 ; i < M.length ; i++) {
			System.out.print("\t|");
			for(int j = 0 ; j < M[0].length ; j++) {
				System.out.printf("%.2f%s",M[i][j],(j < M[0].length -1 ) ? "\t":"|");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		char comando;
		int i, j, c, finalizador = 0;
		double  m1[][] = new double[2][2], m2[][] = new double[2][2], m3[][] = new double[2][2];
		
		System.out.println("Insira os elementos da primeira matriz m1[2][2]:");
		for(i = 0 ; i < m1.length ; i++) {
			for(j = 0 ; j < m1[0].length ; j++) {
				m1[i][j] = entrada.nextDouble();
			}
		}
		
		System.out.println("Insira os elementos da segunda matriz m2[2][0]:");
		for(i = 0 ; i < m2.length ; i++) {
			for(j = 0 ; j < m2[0].length ; j++) {
				m2[i][j] = entrada.nextDouble();
			}
		}
		
		
		
		// Utiliza-se um loop para que o usu�rio possa inserir um comando diversas vezes, com 5 sendo a chave para o fim da execu��o do programa.
		do{	
			System.out.println("\n********\tAperta o n�mero que represente a op��o\t\t********\n");
			System.out.println("(1)SOMAR AS DUAS MATRIZES");
			System.out.println("(2)SUBTRAIR A PRIMEIRA MATRIZ DA SEGUNDA");
			System.out.println("(3)ADICIONAR UMA CONSTANTE AS DUAS MATRIZES");
			System.out.println("(4)IMPRIMIR AS MATRIZES");
			System.out.println("(5)FINALIZAR O PROGRAMA");
			
			System.out.print("ESPERANDO COMANDO...  ");
			comando = entrada.next(".").charAt(0);// Pega o comando que representa��o a op��o requisitada pelo usu�rio.
			
			switch(comando) {
				case '1':// Soma das duas matrizes
					
					for(i = 0 ; i < m1.length ; i++) {
						for(j = 0 ; j < m1[0].length ; j++) {
							m3[i][j] = m1[i][j] + m2[i][j];
						}
					}
					break;
					
				case '2':// Subtra��o das duas matrizes (m1-m2)
					
					for(i = 0 ; i < m1.length ; i++) {
						for(j = 0 ; j < m1[0].length ; j++) {
							m3[i][j] = m1[i][j] - m2[i][j];
						}
					}
					break;
					
				case '3':// Soma uma constante as matrizes
					
					System.out.println("Insira a constante que deseja adicionar as matrizes:");
					c = entrada.nextInt();
					for(i = 0 ; i < m1.length ; i++) {
						for(j = 0 ; j < m1[0].length ; j++) {
							m1[i][j] += c;
							m2[i][j] += c;
						}
					}
					break;
					
				case '4':// Imprime as matrizes
					
					System.out.println("\n\t MATRIZ 1\n");
					imprimirMatriz(m1);
					
					System.out.println("\n\t MATRIZ 2\n");
					imprimirMatriz(m2);
					
					System.out.println("\n\t MATRIZ 3\n");
					imprimirMatriz(m3);
					break;
					
				case '5':// Muda o valor de finalizador para que o programa saia do loop
					finalizador = 1;
					break;
					
				default:// No caso de uma op��o inv�lida ser inserida
					System.out.println("\n********\tOP��O INV�LIDA\t\t********\n");
					break;
					
			}
			
			
		}while(finalizador == 0); // enquanto nossa vari�vel finalizador n�o for atualizada, o programa ficar� no loop pedindo instru��es ao usu�rio
		
		System.out.println("\n********\tFIM DA EXECU��O DO PROGRAMA\t\t********\n");
	}

}
	