package br.com.dio.projeto.desafio.dominio;

public class BaiaoDeDois {
    //atributos
    private String tipo;
    private String ingredientes;
    private String modoPreparo;
    private double tempoPreparo;

    public BaiaoDeDois() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
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

    @Override
    public String toString() {
        return "BaiaoDeDois [tipo=" + tipo + ", ingredientes=" + ingredientes + ", modoPreparo=" + modoPreparo
                + ", tempoPreparo=" + tempoPreparo + "]";
    }

    


}
