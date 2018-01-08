package br.com.alura.dp.strategy.imposto;

public class TesteDeImpostos {
	
	 public static void main(String[] args) {
         Imposto iss = new ISS();
         Imposto icms = new ICMS();
         Imposto iccc = new ICCC();

         Orcamento orcamento = new Orcamento(500.0);

	     CalculadorDeImpostos calculador = new CalculadorDeImpostos();
	
	     // Calculando o ISS
	     calculador.calcula(orcamento, iss);
	
	     // Calculando o ICMS        
	     calculador.calcula(orcamento, icms);
	     
	     // Calculando o ICCC  
	     calculador.calcula(orcamento, iccc);
     }

}
