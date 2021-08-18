package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadorDeDescontos {

	public BigDecimal calcular(Orcamento o) {

		Desconto cadeiaDeDescontos = new DescontoRegraPorQuantidade(new DescontoRegraPorValor(new SemDesconto()));

		return cadeiaDeDescontos.calcular(o);

	}

}
