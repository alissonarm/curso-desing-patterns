package br.com.alura.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.exception.DomainException;
import br.com.alura.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {
	
	public BigDecimal calcularValorDescontoExtra(Orcamento o) {
		return BigDecimal.ZERO;
	}

	public void aprovar(Orcamento o) {
		throw new DomainException("Orcamento nao pode ser aprovado");
	}

	public void reprovar(Orcamento o) {
		throw new DomainException("Orcamento nao pode ser reprovado");
	}

	public void finalizar(Orcamento o) {
		throw new DomainException("Orcamento nao pode ser finalizado");
	}
	
	
}
