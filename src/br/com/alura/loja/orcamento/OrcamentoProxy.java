package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class OrcamentoProxy extends Orcamento {
	
	private BigDecimal v;
	private Orcamento o;
	
	public OrcamentoProxy(Orcamento o) {
		this.o = o;
	}

	@Override
	public BigDecimal getValor() {
		if (v == null) {
			this.v = o.getValor();
		} 
		return this.v;
	}
	
}
