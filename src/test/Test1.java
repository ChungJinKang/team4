package test;

import java.util.ArrayList;

public class Test1 {

	public static ArrayList<Integer> lineList(ArrayList<Integer> myArray[]) {
		ArrayList<Integer> info2 = new ArrayList<>();

		int prev = myArray[0].get(0);
		int cur;
		for(int i = 0; i < 6; i++) {
			
			for(int j = 0; j < myArray[i].size(); j++) {
				cur = myArray[i].get(j);
				if(prev == cur) {
					info2.add(cur);
				} else if(myArray[i].size() == j + 1) {	// 같은 원소가 하나도 없을 때
					// 전 역과 이번역이랑 동일한 노선 찾고
					// 리스트에 추가
					ArrayList<Integer> tmplist = new ArrayList<>();
					for(int tmp : myArray[i-1]) {
						if(tmp != prev) {
							tmplist.add(tmp);
						}
					} // for
					for(int idx = 0; idx < tmplist.size(); idx++) {
						for(int idx2 = 0; idx2 < myArray[i].size(); idx2++) {
							if(tmplist.get(idx) == myArray[i].get(idx2)) {
								info2.add(myArray[i].get(idx2));
								info2.add(myArray[i].get(idx2));
								prev = myArray[i].get(idx2);
							}
						}
					}
				} // else if
				
			} // for j
		} // for i
		
		System.out.println("======================");
		for(int j : info2) {
			System.out.print(j + " ");
		} System.out.println();
		
		return info2;
		
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> myArray[] = new ArrayList[100];
		
		myArray[0] = new ArrayList<Integer>();
		myArray[1] = new ArrayList<Integer>();
		myArray[2] = new ArrayList<Integer>();
		myArray[3] = new ArrayList<Integer>();
		myArray[4] = new ArrayList<Integer>();
		myArray[5] = new ArrayList<Integer>();
		
		myArray[0].add(4);
		myArray[1].add(2);
		myArray[1].add(4);
		myArray[2].add(3);
		myArray[2].add(4);
		myArray[3].add(1);
		myArray[3].add(4);
		myArray[4].add(1);
		myArray[4].add(3);
		myArray[5].add(3);
		myArray[5].add(4);
		
		for(int i = 0; i < 6; i++) {
			for(int j : myArray[i]) {
				System.out.print(j + " ");
			} System.out.println();
		}
		
		lineList(myArray);
		
		
//		//ArrayList<Integer> info = new ArrayList<>();
//		ArrayList<Integer> info2 = new ArrayList<>();
//
//		int prev = myArray[0].get(0);
//		int cur;
//		for(int i = 0; i < 6; i++) {
//			
//			for(int j = 0; j < myArray[i].size(); j++) {
//				cur = myArray[i].get(j);
//				if(prev == cur) {
//					info2.add(cur);
//				} else if(myArray[i].size() == j + 1) {	// 같은 원소가 하나도 없을 때
//					// 전 역과 이번역이랑 동일한 노선 찾고
//					// 리스트에 추가
//					ArrayList<Integer> tmplist = new ArrayList<>();
//					for(int tmp : myArray[i-1]) {
//						if(tmp != prev) {
//							tmplist.add(tmp);
//						}
//					} // for
//					for(int idx = 0; idx < tmplist.size(); idx++) {
//						for(int idx2 = 0; idx2 < myArray[i].size(); idx2++) {
//							if(tmplist.get(idx) == myArray[i].get(idx2)) {
//								info2.add(myArray[i].get(idx2));
//								info2.add(myArray[i].get(idx2));
//								prev = myArray[i].get(idx2);
//							}
//						}
//					}
//				} // else if
//				
//			} // for j
//		} // for i
//		
//		System.out.println("======================");
//		for(int j : info2) {
//			System.out.print(j + " ");
//		} System.out.println();
		
	} // main
}

