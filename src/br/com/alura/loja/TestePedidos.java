package br.com.alura.loja;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;

import java.math.BigDecimal;

public class TestePedidos {

    public static void main(String[] args) {
        var cliente = args[0];
        var valorOrcamento = new BigDecimal(args[1]);
        var quantidadeItens = Integer.parseInt(args[2]);

        var gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        var handler = new GeraPedidoHandler();
        handler.execute(gerador);

    }
}
