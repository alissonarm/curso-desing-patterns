package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoRegraPorValor extends Desconto {

	public DescontoRegraPorValor(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento o) {
		return o.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public boolean deveAplicar(Orcamento o) {
		return o.getValor().compareTo(new BigDecimal("500")) > 0;
	}

}
