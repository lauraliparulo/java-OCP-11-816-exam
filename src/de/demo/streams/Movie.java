package de.demo.streams;

import java.util.stream.Stream;

public class Movie {

	String title;
	double rating;

	Movie(String title, double rating) {
		this.title = title;
		this.rating = rating;
	}

	public static void main(String[] args) {
		Movie m1 = new Movie("The godfather", 9.5);
		Movie m2 = new Movie("Aliens", 5.5);
		Movie m3 = new Movie("Ghostbusters", 8.5);
		Movie m4 = new Movie("XMen", 9.5);
		
		
		//the filtered elements are printed twice: in the peek and for each methods
		Stream.of(m1,m2,m3,m4).peek( m -> System.out.println(m.title))
				.filter(m -> m.rating >= 9.0)
				.forEach(m -> System.out.println(m.title));
	}
}
