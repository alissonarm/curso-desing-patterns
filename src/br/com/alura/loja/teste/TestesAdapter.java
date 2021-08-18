package br.com.alura.loja.teste;

import br.com.alura.loja.http.JavaHttpClient;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroDeOrcamento;

public class TestesAdapter {

	public static void main(String[] args) {

		Orcamento o = new Orcamento();
		o.aprovar();
		o.finalizar();
		
		RegistroDeOrcamento ro = new RegistroDeOrcamento(new JavaHttpClient());
		ro.registrar(o);
		
	}

}
