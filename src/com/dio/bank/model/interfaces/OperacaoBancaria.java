package com.dio.bank.model.interfaces;

import java.math.BigDecimal;

import com.dio.bank.model.Conta;

public interface OperacaoBancaria {
	
	void deposito(BigDecimal valor);
	void saque(BigDecimal valor);
	void transfere(Conta destino, BigDecimal valor);

}
