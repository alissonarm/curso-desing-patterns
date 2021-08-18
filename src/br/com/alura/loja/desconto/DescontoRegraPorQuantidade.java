package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoRegraPorQuantidade extends Desconto {

	public DescontoRegraPorQuantidade(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento o) {
		return o.getValor().multiply(new BigDecimal("0.10"));
	}

	@Override
	public boolean deveAplicar(Orcamento o) {
		return o.getQuantidadeDeItens() > 5;
	}

}
