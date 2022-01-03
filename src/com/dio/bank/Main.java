package com.dio.bank;

import java.math.BigDecimal;

import com.dio.bank.model.Cliente;
import com.dio.bank.model.Conta;
import com.dio.bank.model.ContaCorrente;
import com.dio.bank.model.ContaPoupanca;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente("ObiWan", "111");
		Cliente cl2 = new Cliente("Windu", "112");

		Conta c1 = new ContaCorrente("0012", "745852-7", cl1, new BigDecimal("10.0"));
		Conta c2 = new ContaPoupanca("0013", "745852-1", cl2, new BigDecimal("0.0"));
		
		c1.deposito(new BigDecimal("10.0"));
		
		c1.saque(new BigDecimal("5.0"));
		
		c1.transfere(c2, new BigDecimal("5.0"));
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.imprimirExtrato();
		

	}

}
