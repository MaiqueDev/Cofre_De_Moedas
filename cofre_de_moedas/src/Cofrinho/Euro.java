package Cofrinho;

class Euro extends Moeda {
    public Euro(double valor) {
        super(valor);
    }
    
    @Override
    public double converterParaReal() {
        // Suponhamos uma taxa de conversão fictícia
        return valor * 6.0;
    }
}