package com.dio.bank.model;

import java.math.BigDecimal;

public class ServicoBancario {
	
	private String tipo;
	private BigDecimal valor;
	
	public ServicoBancario() {
	}
	
	public ServicoBancario(String tipo, BigDecimal valor) {
		this.tipo = tipo;
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public BigDecimal getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "ServicoBancario [tipo=" + tipo + ", valor=" + valor + "]";
	}
	
}
