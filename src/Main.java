
import br.com.dio.projeto.desafio.dominio.BaiaoDeDois;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BaiaoDeDois baiaoDeDois = new BaiaoDeDois();
        baiaoDeDois.setTipo("Baião Nordestino");
        baiaoDeDois.setIngredientes("Arroz, Feijao, verdura");
        baiaoDeDois.setModoPreparo("juntas ingrediente numa panela de barro e cozer");
        baiaoDeDois.setTempoPreparo(0.30);

        System.out.println();
        System.out.println(baiaoDeDois);
    }
}
