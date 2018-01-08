package br.com.alura.dp.chainofresponsibility;

public interface Resposta {
	
	void responde(Requisicao req, Conta conta);

	void setProxima(Resposta resposta);
}