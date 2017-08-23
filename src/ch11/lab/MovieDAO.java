package ch11.lab;

import java.util.ArrayList;
import java.util.List;

// DAO(Data Access Object)
public class MovieDAO {
	public static List<Movie> makeMovie() {
        List<Movie> favoriteList = new ArrayList<Movie>();

        favoriteList.add(new Movie("곡성", 2013, "나홍진"));
        favoriteList.add(new Movie("나의 사랑, 나의 신부", 1980, "이명세"));
        favoriteList.add(new Movie("인셉션", 2010, "크리스토퍼 놀란"));
        favoriteList.add(new Movie("나의 사랑, 나의 신부", 2014, "임찬상"));
        
        return favoriteList;
	}
}
