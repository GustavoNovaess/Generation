/* Lista de Exerc�cios -- Arrays
 * Exercicio 1
 * Autor : Gustavo Novaes Lima
 * Data: 07/05/2021
 */

public class Exercicio1 {

	public static void main(String[] args) {
		
		int somadasposicoes,i; 
		int A[] = {1,0,5,-2,-5,7}; // (a) Atribuindo os valores ao vetor
		
		//(b) guardando o valor da soma das posi��es A[0],A[1] e A[5]
		
		somadasposicoes = A[0] + A[1] + A[5];
		System.out.println("A soma das posi��es 0, 1 e 5 � igual a " + somadasposicoes);
		
		//(c) Modificando o vetor na posi��o 4
		
		A[4] = 100;
		
		//(d) Impress�o do vetor
		
		for(i = 0 ; i < A.length ; i++) {
			System.out.printf("\nA[%d] = %d ",i,A[i]);
		}
		
	}
	
}
