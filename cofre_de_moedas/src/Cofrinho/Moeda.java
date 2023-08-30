package Cofrinho;

abstract class Moeda {
    protected double valor;
    
    public Moeda(double valor) {
        this.valor = valor;
    }
    
    public abstract double converterParaReal();
}