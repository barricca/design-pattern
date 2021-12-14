package br.com.alura.loja.pedido;

import br.com.alura.loja.acao.AcaoAposGerarPedido;
import br.com.alura.loja.orcamento.Orcamento;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private final List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados) {
        var orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        var pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(acaoAposGerarPedido -> acaoAposGerarPedido.executar(pedido));
    }
}
