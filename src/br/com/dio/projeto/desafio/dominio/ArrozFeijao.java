package br.com.dio.projeto.desafio.dominio;


public class ArrozFeijao  extends Receita{
    //atributos
    
    public ArrozFeijao() {
    }


    @Override
    public double notaSabor() {
        return NOTA_SABOR + 20d;
    }


    @Override
    public String toString() {
        return "ArrozFeijao = " + getTipo() + ", ingredientes=" + getIngrediente() + ", modoPreparo=" + getModoPreparo()
                + ", tempoPreparo=" + getTempoPreparo() + "]\n";
    }

    

}
