package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Movie;
import model.MovieLogic;

/**
 * @author noahc - nmchung
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */
public class TestMovie2 {
	Movie movie = new Movie();
	MovieLogic mvLogic = new MovieLogic();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testYearsSinceRelease() {
		// tested with the current year 2021 since if I gave the
	    // the same logic it would defeat the purpose of testing
		movie.setReleaseDate(1983);
		int yearsSince = mvLogic.yearsSinceRelease(movie);
		
		assertEquals(38, yearsSince);
	}
}
