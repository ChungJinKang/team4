package ch11.lab;

import java.util.List;

public class MovieView {
	public static void print(List<Movie> favoriteList) {
		for(Movie m : favoriteList) {
			System.out.println(m);
		}
	}
}
