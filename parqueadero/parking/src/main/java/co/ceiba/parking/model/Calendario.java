package co.ceiba.parking.model;

import java.util.Calendar;

public class Calendario {

	public int getActualDay() {
		return Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
	}
}
