package day17.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		//Map �÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//��ü ����
		map.put("��α�", 85);
		map.put("�ۿ���", 90);
		map.put("������", 80);
		map.put("������", 95);
		
		//�� Entry �� ���
		System.out.println("==== �� Entry �� ====");
		System.out.println("map�� ũ��" + map.size());
		
		//��ü ã��....�ۿ����� ������ ����Ͻÿ�	
		System.out.println("==== �ۿ��� ã�� ====");
		for(String key : map.keySet()) {
			if("�ۿ���".equals(key)) {
				System.out.println("�ۿ����� ����: " + map.get(key));
				break;
			}
		} 
		//System.out.println(map.get("�ۿ���"));
		
		//��ü�� �ϳ��� ó��...map�� ��� ����(Ű�� ���� ����Ͻÿ�)
		System.out.println("==== map�� ��� ���� ====");
		for(String key : map.keySet()) {
			System.out.println(key + "�� ����: " + map.get(key));
		}
		
		//��ü ����....��α⸦ �����ϰ� map�� ũ�⸦ ����Ͻÿ�
		System.out.println("==== ��α� ���� ====");
		for(String key : map.keySet()) {
			if("��α�".equals(key)) {
				map.remove(key);
				break;
			}
		} // map.remove("��α�");
		System.out.println("���� �� map�� ũ��: " + map.size());
		
		//��ü�� �ϳ��� ó��....map.entrySet()�� �̿�
		System.out.println("==== map.entrySet() ����Ͽ� map���� ��� ====");
		for(Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + " --> " + val);
		}
		
		//��ü ��ü ����.....clear
		 map.clear();

	}

}
