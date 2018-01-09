package br.com.alura.dp.interpreter;

import br.com.alura.dp.visitor.Visitor;

public class Numero implements Expressao {
	
	private int numero;

	public Numero(int numero) {
		this.numero = numero;
	}

	public int avalia() {
		return numero;
	}

	public int getNumero() {
		return numero;
	}

	public void aceita(Visitor impressora) {
		impressora.visitaNumero(this);
	}

}
