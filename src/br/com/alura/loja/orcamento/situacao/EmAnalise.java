package br.com.alura.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class EmAnalise extends SituacaoOrcamento {
	
	public BigDecimal calcularValorDescontoExtra(Orcamento o) {
		return o.getValor().multiply(new BigDecimal("0.01"));
	}
	
	public void aprovar(Orcamento o) {
		o.setSituacao(new Aprovado());
	}
	
	public void reprovar(Orcamento o) {
		o.setSituacao(new Reprovado());
	}


}
