package ch11.lab;

import java.util.ArrayList;
import java.util.List;

public class Problem {
	   public static void main(String[] args) {

	        List<Movie> favoriteList = new ArrayList<Movie>();

	        favoriteList.add(new Movie("�", 2013, "��ȫ��"));
	        favoriteList.add(new Movie("���� ���, ���� �ź�", 1980, "�̸�"));
	        favoriteList.add(new Movie("�μ���", 2010, "ũ�������� ���"));
	        favoriteList.add(new Movie("���� ���, ���� �ź�", 2014, "������"));

	        System.out.println("���� ��");
	        showMovieList(favoriteList);

	        updateMovieYear(favoriteList, "�", 2016);
	        updateMovieYear(favoriteList, "���� ���, ���� �ź�", 1990);

	        System.out.println("���� ��");
	        showMovieList(favoriteList);

	    }

	    /**
	     * 
	     * @param list ��ȭ ����Ʈ
	     * @param title �����ϰ��� �ϴ� ��ȭ�� Ÿ��Ʋ
	     * @param year  �� ���� ����
	     */
	    public static void updateMovieYear(List<Movie> list, String title, int year) {

	        // ========== ���� ���� ==========
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
	    	// ������ �̷��� ü���������� ǥ���ϴ� �߼���
	    	for(int i = 0; i < list.size(); i++) {
	    		if(list.get(i).getTitle().equals(title)) {
	    			list.get(i).setYear(year);
	    		}
	    	}*/
	        // ========== ���� �� ============
	    }

	    /**
	     * �ش� ��ȭ ����Ʈ�� ����Ѵ�.
	     * @param list ����� ��ȭ ����Ʈ
	     */
	    public static void showMovieList(List<Movie> list) {
	        for (Movie movie : list) {
	            System.out.println(movie);
	        }
	    }
}
