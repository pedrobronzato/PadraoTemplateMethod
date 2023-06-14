package org.example;

public abstract class Assinatura {

    protected String tipo;
    private float preco;
    protected String tipoAssinatura;


    public abstract String getTipo();

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public void setTipoAssinatura(String tipoAssinatura){
        this.tipoAssinatura = tipoAssinatura;
    }

    public String getTipoAssinatura(){
        return tipoAssinatura;
    }

    public abstract float getPreco();

    public double verificarPrecoAnual(){
        if(this.getTipoAssinatura().equals("Anual")){
            return (this.getPreco() * 12) - (0.1 * this.getPreco() * 12);
        }
        else {
            return this.getPreco() * 12;
        }
    }

    public String getInfo() {
        return getTipo() + "{" +
                "preco=" + this.getPreco() +
                ", tipoAssinatura='" + this.tipoAssinatura + '\'' +
                ", preco anual=" + this.verificarPrecoAnual() +
                '}';
    }

}
