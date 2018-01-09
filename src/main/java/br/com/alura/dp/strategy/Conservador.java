package br.com.alura.dp.strategy;

public class Conservador implements Investimento {
	
	public double calcula(Conta conta) {
		return conta.getSaldo() * 0.008;
	}
	
}