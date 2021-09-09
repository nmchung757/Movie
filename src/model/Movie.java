package model;

/**
 * @author noahc - nmchung
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */
public class Movie {
	private String name;
	private int releaseDate;
	private int lengthMinutes;
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(String name, int releaseDate, int lengthMinutes) {
		super();
		this.name = name;
		this.releaseDate = releaseDate;
		this.lengthMinutes = lengthMinutes;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}
	public int getLengthMinutes() {
		return lengthMinutes;
	}
	public void setLengthMinutes(int lengthMinutes) {
		this.lengthMinutes = lengthMinutes;
	}
}
