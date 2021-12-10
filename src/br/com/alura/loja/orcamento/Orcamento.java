package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadeItens;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    /**
     * @return A quantidade de itens de um orçamento.
     */
    public int getQuantidadeItens() {
        return quantidadeItens;
    }
}
