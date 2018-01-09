package br.com.alura.dp.observer;

import br.com.alura.dp.builder.ItemDaNota;
import br.com.alura.dp.builder.NotaFiscal;
import br.com.alura.dp.builder.NotaFiscalBuilder;

public class TesteAcoes {

	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.adicionarAcao(new EnviadorDeEmail());
		builder.adicionarAcao(new NotaFiscalDao());
		builder.adicionarAcao(new EnviadorDeSms());
		builder.adicionarAcao(new Impressora());

		NotaFiscal nf = builder.paraEmpresa("Caelum").comCnpj("123").comItem(new ItemDaNota("nome", 100))
				.comObservacoes("obs").constroi();
		
		System.out.println(nf.getValorBruto());
	}

}
