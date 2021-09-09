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
public class TestMovie1 {
	Movie movie = new Movie();
	MovieLogic mvLogic = new MovieLogic();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsLong() {
		movie.setLengthMinutes(150);
		assertTrue(mvLogic.isLong(movie));
	}
	
	@Test
	public void testIsShort() {
		movie.setLengthMinutes(90);
		assertFalse(mvLogic.isLong(movie));
	}
}
