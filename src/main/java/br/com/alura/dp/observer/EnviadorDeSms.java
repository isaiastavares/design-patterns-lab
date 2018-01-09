package br.com.alura.dp.observer;

import br.com.alura.dp.builder.AcaoAposGerarNota;
import br.com.alura.dp.builder.NotaFiscal;

public class EnviadorDeSms implements AcaoAposGerarNota {

	public void executa(NotaFiscal nf) {
		System.out.println("enviei sms");
	}

}
