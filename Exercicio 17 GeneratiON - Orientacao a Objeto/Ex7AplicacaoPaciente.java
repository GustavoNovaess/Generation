/* Exercicio 7(Aplicação) - Orientação a Objeto
 * Autor: Gustavo Novaes Lima
 * Data: 10/05/2021
 */

package br.com.classes;

public class Ex7AplicacaoPaciente {

	public static void main(String[] args) {
		//Instanciação do objeto
		Ex7Paciente paciente1 = new Ex7Paciente();
		
		//Aplicação utilizando os métodos do objeto
		paciente1.cadastro();
		paciente1.dadosPaciente();
		paciente1.mudarMedicoResponsavel();
		
	}
	
}
