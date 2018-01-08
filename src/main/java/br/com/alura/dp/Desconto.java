package br.com.alura.dp;

public interface Desconto {
	
	double desconta(Orcamento orcamento);
	
	void setProximo(Desconto desconto);
	
}
