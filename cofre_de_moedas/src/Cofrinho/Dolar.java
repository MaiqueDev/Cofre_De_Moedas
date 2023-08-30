package Cofrinho;

class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor);
    }
    
    @Override
    public double converterParaReal() {
        // Suponhamos uma taxa de conversão fictícia
        return valor * 5.0;
    }
}