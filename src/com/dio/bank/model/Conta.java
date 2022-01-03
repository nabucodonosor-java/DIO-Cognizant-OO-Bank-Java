package com.dio.bank.model;

import java.math.BigDecimal;

import com.dio.bank.model.interfaces.OperacaoBancaria;

public abstract class Conta implements OperacaoBancaria {
	
	private String agencia;
	private String numero;
	private String titular;
	private BigDecimal saldo;
	
	public Conta() {}
	
	public Conta(String agencia, String numero, String titular, BigDecimal saldo) {
		super();
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getAgencia() {
		return agencia;
	}

	public String getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}
	
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	@Override
	public void deposito(BigDecimal valor) {
		if (verificarValorInvalido(valor)) {
			System.out.println("O valor do depósito deve ser maior que ZERO!");
		} else {
			BigDecimal saldoTemp = this.saldo.add(valor);
			this.saldo = saldoTemp;
		}
		
	}

	@Override
	public void saque(BigDecimal valor) {
		if (verificarValorInvalido(valor)) {
			System.out.println("O valor do depósito deve ser maior que ZERO!");
		} else if (valor.compareTo(this.saldo) == 1) {
			System.out.println("Saldo Insuficiente!");
		} else {
			BigDecimal saldoTemp = this.saldo.subtract(valor);
			this.saldo = saldoTemp;
		}
	}

	@Override
	public void transfere(Conta destino, BigDecimal valor) {
		if (verificarValorInvalido(valor)) {
			System.out.println("O valor do depósito deve ser maior que ZERO!");
		} else if (valor.compareTo(this.saldo) == 1) {
			System.out.println("Saldo Insuficiente!");
		} else {
			destino.deposito(valor);
			this.saque(valor);
		}
		
	}
	
	private boolean verificarValorInvalido(BigDecimal valor) {
		
		if (valor.compareTo(BigDecimal.ZERO) <= 0) {
			return true;
		}
		
		return false;
	}
	

	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
	

}
