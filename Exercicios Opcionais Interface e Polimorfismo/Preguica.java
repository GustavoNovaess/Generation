/* Exercicios 1 e 2 - Heran�a/Poliformismo
 * Autor: Gustavo Novaes Lima
 * Data: 12/05/2021
 */

public class Preguica extends AnimalClasse implements Animalnterface {

	@Override
	public void emitirSom() {
		System.out.println("Som da Pregui�a: Aaannn");
		
	}

	public void subirArvore() {
		System.out.println(super.getNome() + " est� subindo a �rvore.");
	}
	
}
