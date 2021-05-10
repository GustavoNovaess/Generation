/* Exercicio 3(Aplicação) - Orientação a Objeto
 * Autor: Gustavo Novaes Lima
 * Data: 10/05/2021
 */

package br.com.classes;

public class Ex3AplicacaoProdutoEletronico {

	public static void main(String[] args) {
		//Instanciação do objeto
		Ex3ProdutoEletronico produto1 = new Ex3ProdutoEletronico();
		
		//Aplicação utilizando os métodos do objeto
		produto1.cadastro();
		produto1.promocao();
		produto1.dadosProduto();
		
	}
	
}
