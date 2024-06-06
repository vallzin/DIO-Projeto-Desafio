package br.com.dio.projeto.desafio.dominio;

import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CozerRefeicao {
    //atributos
    private String prato;
    private String descricao;
    private Date data;
    private Set<Cozinheiro> cozinheiroNaCozinha = new HashSet<>();
    private Set<Receita> receitas = new LinkedHashSet<>();
    
    public String getPrato() {
        return prato;
    }
    
    public void setPrato(String prato) {
        this.prato = prato;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public Set<Cozinheiro> getCozinheiroNaCozinha() {
        return cozinheiroNaCozinha;
    }
    public void setCozinheiroNaCozinha(Set<Cozinheiro> cozinheiroNaCozinha) {
        this.cozinheiroNaCozinha = cozinheiroNaCozinha;
    }
    public Set<Receita> getReceitas() {
        return receitas;
    }
    public void setReceitas(Set<Receita> receitas) {
        this.receitas = receitas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((prato == null) ? 0 : prato.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + ((cozinheiroNaCozinha == null) ? 0 : cozinheiroNaCozinha.hashCode());
        result = prime * result + ((receitas == null) ? 0 : receitas.hashCode());
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
        CozerRefeicao other = (CozerRefeicao) obj;
        if (prato == null) {
            if (other.prato != null)
                return false;
        } else if (!prato.equals(other.prato))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;
        if (cozinheiroNaCozinha == null) {
            if (other.cozinheiroNaCozinha != null)
                return false;
        } else if (!cozinheiroNaCozinha.equals(other.cozinheiroNaCozinha))
            return false;
        if (receitas == null) {
            if (other.receitas != null)
                return false;
        } else if (!receitas.equals(other.receitas))
            return false;
        return true;
    }

    
}
