package br.com.alura.dp.bridges;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class GoogleMaps implements Mapa {

	public String devolveMapa(String rua) {
		try {
			String googleMaps = "http://maps.google.com.br/maps?q=rua+vergueiro";
			URL url = new URL(googleMaps);
			InputStream openStream = url.openStream();
			// ....
			return "mapa";
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}

}
