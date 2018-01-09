package br.com.alura.dp.singleton;

import br.com.alura.dp.facade.EmpresaFacade;

public class EmpresaFacadeSingleton {
	
	private static EmpresaFacade instancia;
	
	public EmpresaFacade getInstancia() {
		if (instancia == null) {
			instancia = new EmpresaFacade();
		}
		
		return instancia;
	}

}
