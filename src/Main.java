import br.com.dio.projeto.desafio.dominio.ArrozFeijao;
import br.com.dio.projeto.desafio.dominio.BaiaoDeDois;
import br.com.dio.projeto.desafio.dominio.CozerRefeicao;
import br.com.dio.projeto.desafio.dominio.Cozinheiro;


public class Main {
    public static void main(String[] args) throws Exception {

        
        BaiaoDeDois baiaoDeDois1 = new BaiaoDeDois();
        baiaoDeDois1.setTipo("Baião Nordestino");
        baiaoDeDois1.setIngrediente("Arroz, Feijao, verdura");
        baiaoDeDois1.setModoPreparo("juntas ingrediente numa panela de barro e cozer");
        baiaoDeDois1.setTempoPreparo(0.30);
        
        BaiaoDeDois baiaoDeDois2 = new BaiaoDeDois();
        baiaoDeDois2.setTipo("Baião Nordestino");
        baiaoDeDois2.setIngrediente("Arroz, Feijao, verdura");
        baiaoDeDois2.setModoPreparo("juntas ingrediente numa panela de barro e cozer");
        baiaoDeDois2.setTempoPreparo(0.30);
        
        BaiaoDeDois baiaoDeDois3 = new BaiaoDeDois();
        baiaoDeDois3.setTipo("Baião Nordestino");
        baiaoDeDois3.setIngrediente("Arroz, Feijao, verdura");
        baiaoDeDois3.setModoPreparo("juntas ingrediente numa panela de barro e cozer");
        baiaoDeDois3.setTempoPreparo(0.30);

        ArrozFeijao arrozFeijao1 = new ArrozFeijao();
        arrozFeijao1.setTipo("Arroz com feijão tipo carioca");
        arrozFeijao1.setIngrediente("Arroz, Feijão, verdura");
        arrozFeijao1.setModoPreparo("Cozer o arroz na pressão, cozer o feijão na pressão, junta em um prato");
        arrozFeijao1.setTempoPreparo(0.45);
        
        ArrozFeijao arrozFeijao2 = new ArrozFeijao();
        arrozFeijao2.setTipo("Arroz com feijão tipo carioca");
        arrozFeijao2.setIngrediente("Arroz, Feijão, verdura");
        arrozFeijao2.setModoPreparo("Cozer o arroz na pressão, cozer o feijão na pressão, junta em um prato");
        arrozFeijao2.setTempoPreparo(0.45);
        
        ArrozFeijao arrozFeijao3 = new ArrozFeijao();
        arrozFeijao3.setTipo("Arroz com feijão tipo carioca");
        arrozFeijao3.setIngrediente("Arroz, Feijão, verdura");
        arrozFeijao3.setModoPreparo("Cozer o arroz na pressão, cozer o feijão na pressão, junta em um prato");
        arrozFeijao3.setTempoPreparo(0.45);
        // System.out.println();
        // System.out.println(baiaoDeDois);

        CozerRefeicao cozinha = new CozerRefeicao();
        cozinha.setPrato("Baião de dois");
        cozinha.setDescricao("Baião de dois nordestino");
        cozinha.getReceitas().add(baiaoDeDois1);
        cozinha.getReceitas().add(baiaoDeDois2);
        
        
        CozerRefeicao cozinha1 = new CozerRefeicao();
        cozinha1.setPrato("Baião de dois");
        cozinha1.setDescricao("Baião de dois nordestino");
        cozinha1.getReceitas().add(baiaoDeDois1);
        CozerRefeicao cozinha2 = new CozerRefeicao();
        cozinha2.setPrato("Baião de dois");
        cozinha2.setDescricao("Baião de dois nordestino");
        cozinha2.getReceitas().add(baiaoDeDois2);
        cozinha2.getReceitas().add(baiaoDeDois3);
        CozerRefeicao cozinha3 = new CozerRefeicao();
        cozinha3.setPrato("Baião de dois");
        cozinha3.setDescricao("Arroz com feijão tipo carioca");
        cozinha3.getReceitas().add(arrozFeijao1);
        cozinha3.getReceitas().add(arrozFeijao2);
        cozinha3.getReceitas().add(arrozFeijao3);


        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.setNome("Jorge");
        cozinheiro.iniciarReceita(cozinha);
        System.out.println();
        System.out.println("Receitas para Jorge preparar: \n"+ cozinheiro.getReceitaIniciada());
        System.out.println();
        cozinheiro.cozido();
        cozinheiro.cozido();
        cozinheiro.cozido();
        cozinheiro.cozido();
        System.out.println("Receitas para Jorge preparar: \n"+ cozinheiro.getReceitaIniciada());
        System.out.println("Receitas preparadas por Jorge: \n"+ cozinheiro.getReceitaConcluida());
        System.out.println();
        System.out.println("Ponto de Jorge; "+cozinheiro.calcularTotalNotaSabor());
        System.out.println("****************************************************");
        
        Cozinheiro cozinheiro1 = new Cozinheiro();
        cozinheiro1.setNome("Maria");
        cozinheiro1.iniciarReceita(cozinha1);
        System.out.println("******************************************************");
        System.out.println("Receitas para Maria preparar: "+ cozinheiro1.getReceitaIniciada());
        cozinheiro1.cozido();
        System.out.println();
        System.out.println("Receitas para Maria preparar: \n"+ cozinheiro1.getReceitaIniciada());
        System.out.println("Receitas preparadas por Maria: \n"+ cozinheiro1.getReceitaConcluida());
        System.out.println("*********************************************************");
        cozinheiro1.iniciarReceita(cozinha2);
        cozinheiro1.cozido();
        System.out.println();
        System.out.println("Receitas para Maria preparar: \n"+ cozinheiro1.getReceitaIniciada());
        System.out.println();
        cozinheiro1.iniciarReceita(cozinha3);
        System.out.println();
        System.out.println("Receitas para Maria preparar: \n"+ cozinheiro1.getReceitaIniciada());
        System.out.println();

    }
}
