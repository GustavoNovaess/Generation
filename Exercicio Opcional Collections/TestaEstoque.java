package br.com.exercicio3.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaEstoque {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);		
		Estoque estoque = new Estoque("0",0);
		
		String nomeProduto, s1, s2;
		int finalizador = 0,removido = -1, incrementado = -1, atualizador;
		int operacao;
		
		ArrayList <Estoque> estoqueGeral = new ArrayList<>();
		
		
		do {
			
			System.out.println("\nDIGITE O NÚMERO QUE REPRESENTE A OPERAÇÃO QUE DESEJA REALIZAR:\n");
			System.out.println("[1] - INSERIR PRODUTO");
			System.out.println("[2] - REMOVER PRODUTO");
			System.out.println("[3] - ATUALIZAR QUANTIDADE");
			System.out.println("[4] - CHECAR ESTOQUE");
			System.out.println("[0] - FINALIZAR PROGRAMA");
			
			System.out.print("ESPERANDO OPERAÇÃO... ");
			operacao = entrada.nextInt();
			
			switch(operacao) {
			
			case '1': // Adicionar produto ao estoque
				System.out.println("\nInsira, respectivamente, o nome do produto e quantidade que deseja inserir:");
				entrada.nextLine();
				estoque = new Estoque(entrada.nextLine(), entrada.nextInt());
				entrada.nextLine();
				estoqueGeral.add(estoque);
				break;
				
			case '2': // Remover produto do estoque
				System.out.println("\nInsira o nome do produto que deseja retirar:");
				entrada.nextLine();
				nomeProduto = entrada.nextLine();
				s1 = nomeProduto;
				
				for(int i = 0 ; i < estoqueGeral.size(); i++) {
					s2 = estoqueGeral.get(i).getNomeProduto();
					if (s1.equals(s2)) {
						removido = i;
					}
					
				}
				
				if (removido != -1) {
					estoqueGeral.remove(estoqueGeral.get(removido));
					removido = -1;
				} else {
					System.err.println("\nProduto não encontrado.");
				}
				
				break;
				
			case '3': // Executar instruções da classe funcionário
				System.out.println("\nInsira o nome do produto o qual deseja atualizar a quantidade:");
				entrada.nextLine();
				nomeProduto = entrada.nextLine();
				s1 = nomeProduto;
				
				for(int i = 0 ; i < estoqueGeral.size(); i++) {
					s2 = estoqueGeral.get(i).getNomeProduto();
					if (s1.equals(s2)) {
						incrementado = i;
					}
					
				}
				
				if (incrementado != -1) {
					System.out.println("\nInsira a quantidade que deseja alterar do produto: ");
					atualizador = entrada.nextInt();
					estoqueGeral.get(incrementado).setQuantidade(estoqueGeral.get(incrementado).getQuantidade() + atualizador);
					incrementado = -1;
				} else {
					System.err.println("\nProduto não encontrado.");
				}
				
				
				break;
				
			case '4': // Checar o Estoque **
				System.out.println("\n" + estoqueGeral);
				break;
				
			case '0': // finalizar o programa
				System.err.println("\nPROGRAMA FINALIZADO\n");
				finalizador = 1;
				break;
				
			default: // caso o usuário digite algo errado
				System.err.println("\nOPERAÇÃO INVÁLIDA. POR FAVOR INSIRA UMA OPERAÇÃO VÁLIDA\n");
				break;
				
			}
			
		}while(finalizador == 0);
		
		
	}
	
}
