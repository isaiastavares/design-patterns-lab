package br.com.alura.dp.strategy.imposto;

public class CalculadorDeImpostos {

	public void calcula(Orcamento orcamento, Imposto estrategiaDeImposto) {
		double resultado = estrategiaDeImposto.calcula(orcamento);
		System.out.println(resultado);
	}

}
