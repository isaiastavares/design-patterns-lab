package br.com.alura.dp;

import br.com.alura.dp.strategy.Conservador;
import br.com.alura.dp.strategy.Conta;
import br.com.alura.dp.strategy.Investimento;
import br.com.alura.dp.strategy.RealizadorDeInvestimentos;

public class Teste {

	public static void main(String[] args) {
		testeOrcamento();

		testeInvestimento();
		
		testeTemplateMethod();
	}

	public static void testeOrcamento() {
		Orcamento reforma = new Orcamento(500.0);

		Imposto novoImposto = new ICCC();
		System.out.println(novoImposto.calcula(reforma));

	}

	public static void testeInvestimento() {
		Conta conta = new Conta();
		conta.deposita(100);

		Investimento investimento = new Conservador();

		RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();
		realizadorDeInvestimentos.realiza(conta, investimento);
	}
	
	public static void testeTemplateMethod() {
		Orcamento reforma = new Orcamento(500.0);

		Imposto icpp = new ICPP();
		System.out.println(icpp.calcula(reforma));
		
		Imposto ikcv = new IKCV();
		System.out.println(ikcv.calcula(reforma));

	}
}