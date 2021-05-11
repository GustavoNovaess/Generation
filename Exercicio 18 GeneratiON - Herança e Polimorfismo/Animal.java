/* Exercicio 1 - Herança/Polimorfismo
 * Autor: Gustavo Novaes Lima
 * Data: 11/05/2021
 */

package classes;

public class Animal {

	private String nome;
	private int Idade;
	private int som;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public int getSom() {
		return som;
	}
	
	public void setSom(int som) {
		//System.out.println("[1] Som de Cachorro");
		//System.out.println("[2] Som de Cavalo");
		//System.out.println("[3] Som de Preguiça");
		this.som = som;
		
	}
	
	public void emitirSom(int som) {
		
		switch(som) {
		case 1:
			System.out.println("***** Som de Cachorro *****");
			break;
		case 2:
			System.out.println("***** Som de Cavalo *****");
			break;
		case 3:
			System.out.println("***** Som de Preguiça *****");
			break;
		default:
			System.out.println("O som do animal não foi específicado corretamente.");
		}
			
	}
	
}
