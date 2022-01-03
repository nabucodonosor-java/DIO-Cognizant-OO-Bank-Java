package com.dio.bank.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.dio.bank.model.interfaces.OperacaoBancaria;

public abstract class Conta implements OperacaoBancaria {
	
	private String agencia;
	private String numero;
	private BigDecimal saldo;
	private Cliente cliente;
	private List<ServicoBancario> servicos = new ArrayList<>();
	
	public Conta() {}
	
	public Conta(String agencia, String numero, Cliente cliente, BigDecimal saldo) {
		super();
		this.agencia = agencia;
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public List<ServicoBancario> getServicos() {
		return servicos;
	}
	
	public String getAgencia() {
		return agencia;
	}

	public String getNumero() {
		return numero;
	}

	public Cliente getCliente() {
		return cliente;
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
			servicos.add(new ServicoBancario("Depósito", valor));
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
			servicos.add(new ServicoBancario("Saque", valor));
		}
	}

	@Override
	public void transfere(Conta destino, BigDecimal valor) {
		if (verificarValorInvalido(valor)) {
			System.out.println("O valor do depósito deve ser maior que ZERO!");
		} else if (valor.compareTo(this.saldo) == 1) {
			System.out.println("Saldo Insuficiente!");
		} else {
			BigDecimal saldoTempD = destino.getSaldo().add(valor);
			destino.setSaldo(saldoTempD);;
			BigDecimal saldoTemp = this.saldo.subtract(valor);
			this.saldo = saldoTemp;
			servicos.add(new ServicoBancario("Transferência", valor));
		}
		
	}
	
	public void imprimirExtrato() {
		for (ServicoBancario s : this.servicos) {
			System.out.println(s);
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
		return "Conta [agencia=" + agencia + ", numero=" + numero + ", cliente=" + cliente.getNome() + ", saldo=" + saldo + "]";
	}	

}
