package br.com.alura.loja.acao;

import br.com.alura.loja.pedido.Pedido;

public class SalvarPedidoBancoDeDados implements AcaoAposGerarPedido {

    @Override
    public void executar(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados!");
    }
}
