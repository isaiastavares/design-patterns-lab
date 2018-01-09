package br.com.alura.dp.facade;

public class EmpresaFacade {
	
	public Cliente buscaCliente(String cpf) {
		Cliente cliente = new ClienteDao().buscaPorCpf(cpf);
		return cliente;
	}
	
	public Fatura criaFatura(Cliente cliente, double valor) {
		Fatura fatura = new Fatura(cliente, valor);
		return fatura;
	}
	
	public Cobranca geraCobranca(Fatura fatura) {
		Cobranca cobranca = new Cobranca(Tipo.BOLETO, fatura);
		cobranca.emite();
		return cobranca;
	}
	
	public Contato fazContato(Cliente cliente, Cobranca cobranca) {
		ContatoCliente contato = new ContatoCliente(cliente, cobranca);
		contato.dispara();
		return contato;
	}

}
