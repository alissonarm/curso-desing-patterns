package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);
	}

	public BigDecimal efetuarCalculo(Orcamento o) {
		return BigDecimal.ZERO;
	}

	@Override
	public boolean deveAplicar(Orcamento o) {
		return true;
	}

}
