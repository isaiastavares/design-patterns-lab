package br.com.alura.dp;

public class TesteDeDescontoExtra {
	
	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500.0);
		
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		
		reforma.aprova();
		
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		
		reforma.finaliza();
		
		// reforma.aplicaDescontoExtra(); lancaria excecao, pois não pode dar desconto nesse estado
        // reforma.aprova(); lança exceção, pois não pode ir para aprovado
	}

}
