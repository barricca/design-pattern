package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDesconto {

    public static void main(String[] args) {
        var primeiro = new Orcamento(new BigDecimal("501"), 4);
        var segundo = new Orcamento(new BigDecimal("200"), 5);
        var calculadoraDeDescontos = new CalculadoraDeDescontos();

        System.out.println(calculadoraDeDescontos.calcular(primeiro));
        System.out.println(calculadoraDeDescontos.calcular(segundo));

    }
}
