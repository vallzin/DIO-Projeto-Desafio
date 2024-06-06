package br.com.dio.projeto.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Cozinheiro {
    private String nome;
    private Set<Receita> receitaIniciada = new LinkedHashSet<>();
    private Set<Receita> receitaConcluida = new LinkedHashSet<>();

    public void iniciarReceita(CozerRefeicao cozerRefeicao){
        this.receitaIniciada.addAll(cozerRefeicao.getReceitas());
        cozerRefeicao.getCozinheiroNaCozinha().add(this);
    }

    public void cozido(){
        Optional<Receita> receita = this.receitaIniciada.stream().findFirst();
        if(receita.isPresent()){
            this.receitaConcluida.add(receita.get());
            this.receitaIniciada.remove(receita.get());
        }else{
            System.err.println("A receita não existe");
        }
    }

    public double calcularTotalNotaSabor(){
        return this.receitaConcluida
        .stream()
        .mapToDouble(receita -> receita.notaSabor())
        .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Set<Receita> getReceitaIniciada() {
        return receitaIniciada;
    }

    public void setReceitaIniciada(Set<Receita> receitaIniciada) {
        this.receitaIniciada = receitaIniciada;
    }

    public Set<Receita> getReceitaConcluida() {
        return receitaConcluida;
    }

    public void setReceitaConcluida(Set<Receita> receitaConcluida) {
        this.receitaConcluida = receitaConcluida;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((receitaIniciada == null) ? 0 : receitaIniciada.hashCode());
        result = prime * result + ((receitaConcluida == null) ? 0 : receitaConcluida.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cozinheiro other = (Cozinheiro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (receitaIniciada == null) {
            if (other.receitaIniciada != null)
                return false;
        } else if (!receitaIniciada.equals(other.receitaIniciada))
            return false;
        if (receitaConcluida == null) {
            if (other.receitaConcluida != null)
                return false;
        } else if (!receitaConcluida.equals(other.receitaConcluida))
            return false;
        return true;
    }

    

    

}
