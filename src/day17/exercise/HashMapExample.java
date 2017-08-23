package day17.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("김민기", 85);
		map.put("송원두", 90);
		map.put("이정욱", 80);
		map.put("나성아", 95);
		
		//총 Entry 수 출력
		System.out.println("==== 총 Entry 수 ====");
		System.out.println("map의 크기" + map.size());
		
		//객체 찾기....송원두의 점수를 출력하시오	
		System.out.println("==== 송원두 찾기 ====");
		for(String key : map.keySet()) {
			if("송원두".equals(key)) {
				System.out.println("송원두의 점수: " + map.get(key));
				break;
			}
		} 
		//System.out.println(map.get("송원두"));
		
		//객체를 하나씩 처리...map의 모든 정보(키와 값을 출력하시오)
		System.out.println("==== map의 모든 정보 ====");
		for(String key : map.keySet()) {
			System.out.println(key + "의 점수: " + map.get(key));
		}
		
		//객체 삭제....김민기를 삭제하고 map의 크기를 출력하시오
		System.out.println("==== 김민기 삭제 ====");
		for(String key : map.keySet()) {
			if("김민기".equals(key)) {
				map.remove(key);
				break;
			}
		} // map.remove("김민기");
		System.out.println("삭제 후 map의 크기: " + map.size());
		
		//객체를 하나씩 처리....map.entrySet()을 이용
		System.out.println("==== map.entrySet() 사용하여 map정보 출력 ====");
		for(Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + " --> " + val);
		}
		
		//객체 전체 삭제.....clear
		 map.clear();

	}

}
