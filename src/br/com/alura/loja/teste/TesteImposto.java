package br.com.alura.loja.teste;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImposto;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteImposto {

	public static void main(String[] args) {

		Orcamento o = new Orcamento();
		o.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
				
		CalculadoraDeImposto cal = new CalculadoraDeImposto();
				
		System.out.println(cal.calcular(o, new ISS(null)));
		System.out.println(cal.calcular(o, new ICMS(new ISS(null))));
		
	}

}
