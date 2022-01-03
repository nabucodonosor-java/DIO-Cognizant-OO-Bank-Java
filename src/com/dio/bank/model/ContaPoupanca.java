package com.dio.bank.model;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca(String agencia, String numero, String titular, BigDecimal saldo) {
		super(agencia, numero, titular, saldo);
	}
}
