package br.com.alura.loja.teste;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadorDeDescontos;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteDesconto {

	public static void main(String[] args) {

		Orcamento o1 = new Orcamento();
		o1.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));
		
		Orcamento o2 = new Orcamento();
		o2.adicionarItem(new ItemOrcamento(new BigDecimal("2000")));
		
		CalculadorDeDescontos cd = new CalculadorDeDescontos();
		System.out.println(cd.calcular(o1));
		System.out.println(cd.calcular(o2));
		
	}

}
