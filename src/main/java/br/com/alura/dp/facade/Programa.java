package br.com.alura.dp.facade;

import br.com.alura.dp.singleton.EmpresaFacadeSingleton;

public class Programa {
	
	public static void main(String[] args) {
		EmpresaFacade facade = new EmpresaFacadeSingleton().getInstancia();
		facade.buscaCliente(cpf);
		facade.criaFatura(cliente, valor);
	}

}
