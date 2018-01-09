package br.com.alura.dp.adapters;

import java.util.Calendar;

public class RelogioDoSistema implements Relogio {

	public Calendar hoje() {
		return Calendar.getInstance();
	}

}
