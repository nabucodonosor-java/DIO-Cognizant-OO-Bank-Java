package com.dio.bank.model;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca(String agencia, String numero, Cliente cliente, BigDecimal saldo) {
		super(agencia, numero, cliente, saldo);
	}
}
