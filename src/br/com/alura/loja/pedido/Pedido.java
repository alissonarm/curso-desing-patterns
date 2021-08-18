package br.com.alura.loja.pedido;

import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;

public class Pedido {

	private String cliente;
	private LocalDateTime data;
	private Orcamento o;
		
	public Pedido(String cliente, LocalDateTime data, Orcamento o) {
		this.cliente = cliente;
		this.data = data;
		this.o = o;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Orcamento getO() {
		return o;
	}

	public void setO(Orcamento o) {
		this.o = o;
	}
	

	
	
	
}
