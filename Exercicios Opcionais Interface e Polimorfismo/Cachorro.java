/* Exercicios 1 e 2 - Heran�a/Poliformismo
 * Autor: Gustavo Novaes Lima
 * Data: 12/05/2021
 */

public class Cachorro extends Quadrupede implements Animalnterface {

	@Override
	public void emitirSom() {
		System.out.println("Som do Cachorro: au au");
	}

}
