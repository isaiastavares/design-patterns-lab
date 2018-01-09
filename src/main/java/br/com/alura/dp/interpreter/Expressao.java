package br.com.alura.dp.interpreter;

import br.com.alura.dp.visitor.Visitor;

public interface Expressao {
	
	int avalia();

	void aceita(Visitor impressora);
	
}
