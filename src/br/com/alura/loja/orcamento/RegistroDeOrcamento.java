package br.com.alura.loja.orcamento;

import java.util.Map;

import br.com.alura.loja.exception.DomainException;
import br.com.alura.loja.http.HttpAdapter;

public class RegistroDeOrcamento {
	
	private HttpAdapter http;
	
	public RegistroDeOrcamento(HttpAdapter http) {
		this.http = http;
	}

	public void registrar (Orcamento o ) {
		
		if (!o.isFinalizado()) {
			throw new DomainException("Orcamento nao finalizado!");
		}
		
		String url = "http://alura.com.br";    //  "http://api.externa/orcamento";
		Map<String, Object> dados = Map.of(
				"valor", o.getValor(),
				"quantidadeItens", o.getQuantidadeDeItens());
				
		http.post(url, dados);
	}

}
