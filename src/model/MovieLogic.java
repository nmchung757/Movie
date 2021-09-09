package model;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author noahc - nmchung
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */
public class MovieLogic {
	public boolean isLong(Movie movie) {
		if (movie.getLengthMinutes() > 100) {
			return true;
		} else {
			return false;
		}
	}
	
	public int yearsSinceRelease(Movie movie) {
		Calendar calendar = new GregorianCalendar();
		int currYear = calendar.get(Calendar.YEAR);
		
		int yearsSinceRelease = currYear - movie.getReleaseDate();
		return yearsSinceRelease;
	}
}
