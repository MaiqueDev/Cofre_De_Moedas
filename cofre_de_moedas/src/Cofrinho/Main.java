package Cofrinho;

import java.util.Scanner;

//Classe principal para interação com o usuário, professor Leonardo Gomes
public class Main {
    public static void main(String[] args) {
    	// Criação de um objeto Scanner para entrada de dados pelo usuário, professor Leonardo Gomes
        Scanner scanner = new Scanner(System.in);
     // Criação de um objeto Cofrinho para gerenciar as moedas
        Cofrinho cofrinho = new Cofrinho();
     // Variável para controlar se o programa deve continuar em execução
        boolean continuar = true;
        while (continuar) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total em reais");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            
         // Leitura da opção escolhida pelo usuário
            int opcao = scanner.nextInt();
            
         // Leitura da opção escolhida pelo usuário
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor da moeda: ");
                    double valor = scanner.nextDouble();
                    System.out.println("Escolha a moeda (1 - Dólar, 2 - Euro, 3 - Real): ");
                    int tipoMoeda = scanner.nextInt();
                    
                    Moeda moeda;
                 // Criação de uma instância de moeda com base na escolha do usuário
                    if (tipoMoeda == 1) {
                        moeda = new Dolar(valor);
                    } else if (tipoMoeda == 2) {
                        moeda = new Euro(valor);
                    } else {
                        moeda = new Real(valor);
                    }
                    
                 // Adiciona a moeda ao cofrinho
                    cofrinho.adicionarMoeda(moeda);
                    System.out.println("Moeda adicionada.");
                    break;
                
                case 2:
                	// Verifica se o cofrinho está vazio antes de remover uma moeda
                    if (cofrinho.isEmpty()) {
                        System.out.println("O cofrinho está vazio.");
                    } else {
                        System.out.print("Digite o índice da moeda a ser removida: ");
                        int indice = scanner.nextInt();
                     // Verifica se o cofrinho está vazio antes de remover uma moeda
                        cofrinho.removerMoeda(indice - 1);
                    }
                    break;
                
                case 3:
                	// Verifica se o cofrinho está vazio antes de remover uma moeda
                    cofrinho.listarMoedas();
                    break;
                
                case 4:
                	// Calcula o valor total de todas as moedas convertido para reais
                    System.out.println("Total em reais: " + cofrinho.calcularTotal());
                    break;
                
                case 5:
                	// Calcula o valor total de todas as moedas convertido para reais
                    continuar = false;
                    break;
                
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        
        System.out.println("Programa encerrado.");
        scanner.close();
    }
}