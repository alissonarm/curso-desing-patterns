package br.com.alura.loja.teste;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.loja.pedido.DadosdoPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.LogDePedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoBancoDeDados;

public class TestaPedido {

	public static void main(String[] args) {

		String cliente = "Rodrigo";
		BigDecimal valor = new BigDecimal("150");
//		int quantidadeItens = Integer.parseInt(args[2]);
		int quantidadeItens = 5;

		DadosdoPedido nota = new DadosdoPedido(cliente, valor, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new SalvarPedidoBancoDeDados(), new LogDePedido(), new EnviarEmailPedido()));

		handler.execute(nota);
	}

}
