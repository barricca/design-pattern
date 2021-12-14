package br.com.alura.loja.acao;

import br.com.alura.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    @Override
    public void executar(Pedido pedido) {
        System.out.println("Enviando Email com dados do pedido!");
    }
}
