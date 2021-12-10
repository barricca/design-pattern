package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadeItens;
    private String situacao;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDoDescontoExtra = BigDecimal.ZERO;
        if (situacao.equals("EM_ANALISE")) {
            valorDoDescontoExtra = new BigDecimal("0.05");
        } else if (situacao.equals("APROVADO")) {
            valorDoDescontoExtra = new BigDecimal("0.02");
        }
        this.valor = this.valor.subtract(valorDoDescontoExtra);
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
