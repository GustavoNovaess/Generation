/* Exercicio 2 - Herança/Polimorfismo
 * Autor: Gustavo Novaes Lima
 * Data: 11/05/2021
 */

package classes;

import java.util.Scanner;

public class TestaAnimal {

	public static void main(String[] args) {
		//Instanciando objetos
		Scanner entrada = new Scanner(System.in);
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica sloth = new Preguica();
		
		//Definindo os Atributos dos objetos
		
		dog.setNome(entrada.nextLine());
		dog.setIdade(entrada.nextInt());
		dog.setSom();
		entrada.nextLine(); // Limpa o buffer do teclado
		
		horse.setNome(entrada.nextLine());
		horse.setIdade(entrada.nextInt());
		horse.setSom();
		entrada.nextLine(); // Limpa o buffer do teclado
		
		sloth.setNome(entrada.nextLine());
		sloth.setIdade(entrada.nextInt());
		sloth.setSom();
		entrada.nextLine(); // Limpa o buffer do teclado
		
		entrada.close();

		System.out.println("===== ANIMAIS =====");
		// Dados Cachorro
		System.out.println("\nNome do Cachorro: " + dog.getNome());
		System.out.println("Idade do Cachorro: " + dog.getIdade());
		System.out.println("Som: " + dog.getSom());
		dog.emitirSom(dog.getSom()); // Emite o som do cachorro
		
		// Dados Cavalo
		System.out.println("\nNome do Cavalo: " + horse.getNome());
		System.out.println("Idade do Cavalo: " + horse.getIdade());
		System.out.println("Som: " + horse.getSom());
		horse.emitirSom(horse.getSom()); // Emite o som do Cavalo
		
		// Dados Preguiça
		System.out.println("\nNome da Preguiça: " + sloth.getNome());
		System.out.println("Idade da Preguiça: " + sloth.getIdade());
		System.out.println("Som: " + sloth.getSom());
		sloth.emitirSom(sloth.getSom()); // Emite o som da Preguiça
		
		
	}
	
}
