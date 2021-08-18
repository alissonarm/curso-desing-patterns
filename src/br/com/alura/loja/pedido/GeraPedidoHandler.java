
package br.com.alura.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class GeraPedidoHandler {

	private List<AcaoAposGerarPedido> acoes;
	
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void execute(DadosdoPedido dados) {
		Orcamento o = new Orcamento();
		o.adicionarItem(new ItemOrcamento(new BigDecimal("1500")));
		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), o);

		acoes.forEach(a -> a.executarAcao(pedido));
		
	}
	
}
