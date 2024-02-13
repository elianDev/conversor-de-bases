package entities;

public abstract class Numero {

    protected Integer valor;

    public Numero(Integer valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public abstract Integer converterParaOutroFormato();
}
