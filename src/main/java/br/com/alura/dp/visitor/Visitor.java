package br.com.alura.dp.visitor;

import br.com.alura.dp.interpreter.Divisao;
import br.com.alura.dp.interpreter.Multiplicacao;
import br.com.alura.dp.interpreter.Numero;
import br.com.alura.dp.interpreter.Soma;
import br.com.alura.dp.interpreter.Subtracao;

public interface Visitor {
	
	void visitaSoma(Soma soma);
	
	void visitaSubtracao(Subtracao subtracao);
	
	void visitaMultiplicacao(Multiplicacao multiplicacao);
	
	void visitaDivisao(Divisao divisao);
	
	void visitaNumero(Numero numero);

}
