package br.com.alura.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class Aprovado extends SituacaoOrcamento {

	public BigDecimal calcularValorDescontoExtra(Orcamento o) {
		return o.getValor().multiply(new BigDecimal("0.05"));
	}

	public void finalizar(Orcamento o) {
		o.setSituacao(new Finalizado());
	}

}
