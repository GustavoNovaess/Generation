/* Exercicios 1 e 2 - Herança/Poliformismo
 * Autor: Gustavo Novaes Lima
 * Data: 12/05/2021
 */

public class Cavalo extends Quadrupede implements Animalnterface {

	@Override
	public void emitirSom() {
		System.out.println("O cavalo emite o som: HIN HIN");
		
	}

}
