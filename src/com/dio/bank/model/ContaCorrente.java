package com.dio.bank.model;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(String agencia, String numero, Cliente cliente, BigDecimal saldo) {
		super(agencia, numero, cliente, saldo);
	}

}
