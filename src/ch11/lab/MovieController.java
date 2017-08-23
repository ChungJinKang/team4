package ch11.lab;

import java.util.List;

public class MovieController {
	
	public static void main(String[] args) {
		List<Movie> mlist = MovieDAO.makeMovie();
		MovieView.print(mlist);
	}

}
