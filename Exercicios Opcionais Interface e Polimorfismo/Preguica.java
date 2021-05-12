/* Exercicios 1 e 2 - Herança/Poliformismo
 * Autor: Gustavo Novaes Lima
 * Data: 12/05/2021
 */

public class Preguica extends AnimalClasse implements Animalnterface {

	@Override
	public void emitirSom() {
		System.out.println("Som da Preguiça: Aaannn");
		
	}

	public void subirArvore() {
		System.out.println(super.getNome() + " está subindo a árvore.");
	}
	
}
