package Cofrinho;

class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }
    
    @Override
    public double converterParaReal() {
        return valor;
    }
}