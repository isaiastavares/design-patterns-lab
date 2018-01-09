package br.com.alura.dp.templatemethod;

import java.util.List;

public abstract class Relatorio {

	protected abstract void cabecalho();

	protected abstract void rodape();

	protected abstract void corpo(List<Conta> conta);

	public void imprime(List<Conta> contas) {
		cabecalho();
		corpo(contas);
		rodape();
	}

}
