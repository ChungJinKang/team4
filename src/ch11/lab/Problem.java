package ch11.lab;

import java.util.ArrayList;
import java.util.List;

public class Problem {
	   public static void main(String[] args) {

	        List<Movie> favoriteList = new ArrayList<Movie>();

	        favoriteList.add(new Movie("곡성", 2013, "나홍진"));
	        favoriteList.add(new Movie("나의 사랑, 나의 신부", 1980, "이명세"));
	        favoriteList.add(new Movie("인셉션", 2010, "크리스토퍼 놀란"));
	        favoriteList.add(new Movie("나의 사랑, 나의 신부", 2014, "임찬상"));

	        System.out.println("변경 전");
	        showMovieList(favoriteList);

	        updateMovieYear(favoriteList, "곡성", 2016);
	        updateMovieYear(favoriteList, "나의 사랑, 나의 신부", 1990);

	        System.out.println("변경 후");
	        showMovieList(favoriteList);

	    }

	    /**
	     * 
	     * @param list 영화 리스트
	     * @param title 변경하고자 하는 영화의 타이틀
	     * @param year  새 개봉 연도
	     */
	    public static void updateMovieYear(List<Movie> list, String title, int year) {

	        // ========== 구현 시작 ==========
//	    	for(Movie mv: list) {
//	    		if(mv.getTitle().equals(title)) {
//	    			mv.setYear(year);
//	    		}
//	    	}
	    	for(int i = 0; i < list.size(); i++) {
	    		Movie m = list.get(i);
	    		
	    		if(m.getTitle().equals(title)) {
	    			m.setYear(year);
	    		}
	    	}
	    	/*
	    	// 요즘은 이렇게 체인형식으로 표현하는 추세래
	    	for(int i = 0; i < list.size(); i++) {
	    		if(list.get(i).getTitle().equals(title)) {
	    			list.get(i).setYear(year);
	    		}
	    	}*/
	        // ========== 구현 끝 ============
	    }

	    /**
	     * 해당 영화 리스트를 출력한다.
	     * @param list 출력할 영화 리스트
	     */
	    public static void showMovieList(List<Movie> list) {
	        for (Movie movie : list) {
	            System.out.println(movie);
	        }
	    }
}
