package br.com.dio.projeto.desafio.dominio;

public class BaiaoDeDois extends Receita{
    //atributos

    public BaiaoDeDois() {
    }

    

    @Override
    public double notaSabor() {
        return NOTA_SABOR + 20d;
    }

    @Override
    public String toString() {
        return "BaiaoDeDois = " + getTipo() + ", ingredientes=" + getIngrediente() + ", modoPreparo=" + getModoPreparo()
                + ", tempoPreparo=" + getTempoPreparo() + "]\n";
    }
}
