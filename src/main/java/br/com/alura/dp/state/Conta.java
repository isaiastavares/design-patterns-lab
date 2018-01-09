package br.com.alura.dp.state;

public class Conta {
	
	protected double saldo;
	protected EstadoDaConta estado;

	public Conta() {
		estado = new Positivo();
	}

	public void saca(double valor) {
		estado.saca(this, valor);
	}

	public void deposita(double valor) {
		estado.deposita(this, valor);
	}
}
