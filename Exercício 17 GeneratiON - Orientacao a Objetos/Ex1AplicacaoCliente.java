/* Exercicio 1(Aplicação) - Orientação a Objeto
 * Autor: Gustavo Novaes Lima
 * Data: 10/05/2021
 */

package br.com.classes;

public class Ex1AplicacaoCliente {

	public static void main(String[] args) {
		//Instanciação do objeto
		Ex1Cliente cliente1 = new Ex1Cliente();
		
		//Aplicação utilizando os métodos do objeto
		cliente1.cadastro();
		cliente1.verificarCadastro(cliente1.cpf);
		cliente1.dadosCliente();
		cliente1.verificarCadastro("123");
		
	}
	
}
