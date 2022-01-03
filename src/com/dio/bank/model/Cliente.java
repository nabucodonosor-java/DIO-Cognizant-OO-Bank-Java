package com.dio.bank.model;

public class Cliente {
	
	private String nome;
	private String rg;
	
	public Cliente() {
	}
	
	public Cliente(String nome, String rg) {
		this.nome = nome;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public String getRg() {
		return rg;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", rg=" + rg + "]";
	}
}
