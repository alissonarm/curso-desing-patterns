package br.com.alura.loja.teste;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.OrcamentoProxy;

public class TesteProxy {

	public static void main(String[] args) {

		Orcamento o1 = new Orcamento();
		o1.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));
		o1.reprovar();
		
		Orcamento o2 = new Orcamento();
		o2.adicionarItem(new ItemOrcamento(new BigDecimal("2000")));
		o2.adicionarItem(o1);
		
		OrcamentoProxy proxy = new OrcamentoProxy(o1);
		
		System.out.println(proxy.getValor());
		System.out.println(proxy.getValor());
		
	}

}
