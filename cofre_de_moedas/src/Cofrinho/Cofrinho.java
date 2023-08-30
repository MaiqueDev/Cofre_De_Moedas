package Cofrinho;

import java.util.ArrayList;

class Cofrinho {
    private ArrayList<Moeda> moedas = new ArrayList<>();
    
    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }
    
 // Método para remover uma moeda do cofrinho por índice professor Leonardo Gomes
    
    public void removerMoeda(int indice) {
        if (indice >= 0 && indice < moedas.size()) {
            moedas.remove(indice);
        } else {
            System.out.println("Índice inválido.");
        }
    }
    
 // Método para listar todas as moedas no cofrinho teacher Leonardo Gomes
    public void listarMoedas() {
        if (moedas.isEmpty()) {
            System.out.println("O cofrinho está vazio.");
            return;
        }
        
        System.out.println("Moedas no cofrinho:");
        for (int i = 0; i < moedas.size(); i++) {
            Moeda moeda = moedas.get(i);
            System.out.println("Moeda " + (i + 1) + ": " + moeda.converterParaReal() + " reais");
        }
    }
    
 // Método para calcular o total de todas as moedas convertido para reais, professor Leonardo Gomes
    
    public double calcularTotal() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.converterParaReal();
        }
        return total;
    }
    
 // Método para verificar se o cofrinho está vazio professor Leonardo Gomes

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
}