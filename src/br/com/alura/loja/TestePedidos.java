package br.com.alura.loja;

import br.com.alura.loja.acao.EnviarEmailPedido;
import br.com.alura.loja.acao.SalvarPedidoBancoDeDados;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;

import java.math.BigDecimal;
import java.util.List;

public class TestePedidos {

    public static void main(String[] args) {
        var cliente = args[0];
        var valorOrcamento = new BigDecimal(args[1]);
        var quantidadeItens = Integer.parseInt(args[2]);

        var gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        var handler = new GeraPedidoHandler(
                List.of(new SalvarPedidoBancoDeDados(), new EnviarEmailPedido())
        );
        handler.execute(gerador);

        System.out.println("Cliente: " + cliente + ", Valor: " + valorOrcamento + ", Quantidade: " + quantidadeItens);

    }
}
