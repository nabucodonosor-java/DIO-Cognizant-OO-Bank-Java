package com.dio.bank.model;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(String agencia, String numero, String titular, BigDecimal saldo) {
		super(agencia, numero, titular, saldo);
	}

}
