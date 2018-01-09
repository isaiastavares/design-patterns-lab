package br.com.alura.dp.interpreter;

import br.com.alura.dp.visitor.Visitor;

public class Soma implements Expressao {
	
	private Expressao esquerda;
	private Expressao direita;

	public Soma(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	public int avalia() {
		int valorDaEsquerda = esquerda.avalia();
		int valorDaDireita = direita.avalia();
		
		return valorDaEsquerda + valorDaDireita;
	}
	
	public Expressao getEsquerda() {
		return esquerda;
	}
	
	public Expressao getDireita() {
		return direita;
	}

	public void aceita(Visitor impressora) {
		impressora.visitaSoma(this);
	}

}
