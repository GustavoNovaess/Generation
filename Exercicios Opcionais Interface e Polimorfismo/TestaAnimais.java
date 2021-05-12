/* Exercicios 1 e 2 - Herança/Poliformismo
 * Autor: Gustavo Novaes Lima
 * Data: 12/05/2021
 */

public class TestaAnimais {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica sloth = new Preguica();
		
		// Preenche os Atributos
		dog.setNome("Jubileu");
		dog.setIdade(10);
		
		horse.setNome("Agro");
		horse.setIdade(15);
		
		sloth.setNome("Luiz");
		sloth.setIdade(30);
		
		// Imprime os Atributos e Chama os Métodos
		
		System.out.println("===== ANIMAIS =====");
		// Dados Cachorro
		System.out.println("\nNome do Cachorro: " + dog.getNome());
		System.out.println("Idade do Cachorro: " + dog.getIdade());
		dog.emitirSom();
		dog.correr();
		
		// Dados Cavalo
		System.out.println("\nNome do Cavalo: " + horse.getNome());
		System.out.println("Idade do Cavalo: " + horse.getIdade());
		horse.emitirSom();
		horse.correr();
		
		// Dados Preguiça
		System.out.println("\nNome da Preguiça: " + sloth.getNome());
		System.out.println("Idade da Preguiça: " + sloth.getIdade());
		sloth.emitirSom();
		sloth.subirArvore();
		
	}
	
}
