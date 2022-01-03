package com.dio.bank;

import java.math.BigDecimal;

import com.dio.bank.model.Conta;
import com.dio.bank.model.ContaCorrente;
import com.dio.bank.model.ContaPoupanca;

public class Main {
	
	public static void main(String[] args) {

		Conta c1 = new ContaCorrente("0012", "745852-7", "ObiWan", new BigDecimal("10.0"));
		Conta c2 = new ContaPoupanca("0013", "745852-1", "Windu", new BigDecimal("0.0"));
		
		c1.deposito(new BigDecimal("10.0"));
		
		c1.saque(new BigDecimal("5.0"));
		
		c1.transfere(c2, new BigDecimal("5.0"));
		
		System.out.println(c1);
		System.out.println(c2);
		

	}

}
