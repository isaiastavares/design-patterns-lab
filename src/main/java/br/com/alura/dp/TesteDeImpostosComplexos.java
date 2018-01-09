package br.com.alura.dp;

public class TesteDeImpostosComplexos {
	
	public static void main(String[] args) {
		Imposto impostos = new ISS(new ICMS());

        Orcamento orcamento = new Orcamento(500.0);

        System.out.println(impostos.calcula(orcamento));
	}

}
