package ch11.lab;

import java.util.ArrayList;
import java.util.List;

// DAO(Data Access Object)
public class MovieDAO {
	public static List<Movie> makeMovie() {
        List<Movie> favoriteList = new ArrayList<Movie>();

        favoriteList.add(new Movie("�", 2013, "��ȫ��"));
        favoriteList.add(new Movie("���� ���, ���� �ź�", 1980, "�̸�"));
        favoriteList.add(new Movie("�μ���", 2010, "ũ�������� ���"));
        favoriteList.add(new Movie("���� ���, ���� �ź�", 2014, "������"));
        
        return favoriteList;
	}
}
