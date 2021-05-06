/* Exercicio 3
 * Autor: Gustavo Novaes Lima
 * Data: 06/05/2021
 */

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade = -1, pessoasMenor21 = 0 , pessoasMais50 = 0;
		
		System.out.println("Caso deseje parar a execução do programa, digite -99.\n");
		while(idade != -99) {
			
			System.out.println("Insira sua idade:");
			idade = entrada.nextInt();
			
			if(idade >= 0 && idade <= 21) {
				pessoasMenor21++;
			} else if (idade >= 50) {
				pessoasMais50++;
			}
			
		}
		
		entrada.close();
		System.out.println("Total de pessoas com menos de 21 anos: " + pessoasMenor21);
		System.out.println("Total de pessoas com mais de 50 anos: " + pessoasMais50);
		
	}
	
}
