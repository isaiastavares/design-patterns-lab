package br.com.alura.dp.bridges;

public class Programa {
	
	public static void main(String[] args) {
		
		// regra de negocio
		
		Mapa mapa = new GoogleMaps();
		mapa.devolveMapa("rua vergueiro");
		
		// ....
	}

}
