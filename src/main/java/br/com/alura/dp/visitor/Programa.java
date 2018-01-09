package br.com.alura.dp.visitor;

import br.com.alura.dp.interpreter.Expressao;
import br.com.alura.dp.interpreter.Numero;
import br.com.alura.dp.interpreter.Soma;
import br.com.alura.dp.interpreter.Subtracao;

public class Programa {

	public static void main(String[] args) {

		Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
		Expressao direita = new Soma(new Numero(2), new Numero(10));
		Expressao soma = new Soma(esquerda, direita);

		int resultado = soma.avalia();

		Visitor impressora = new ImpressoraVisitor();
		soma.aceita(impressora);
		System.out.print(" = " + resultado);
	}
}
