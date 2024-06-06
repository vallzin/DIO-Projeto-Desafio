package br.com.dio.projeto.desafio.dominio;


public abstract class Receita {
    //atributo
    protected static final double NOTA_SABOR = 10d;

    private String tipo;
    private String ingrediente;
    private String modoPreparo;
    private double tempoPreparo;

    public abstract double notaSabor();

    public static double getNotaSabor() {
        return NOTA_SABOR;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }

    public double getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(double tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    
}
