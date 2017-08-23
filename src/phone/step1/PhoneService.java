package phone.step1;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneService {
	private Phone[] phones = new Phone[100];
	int cnt = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	{
		for(int i = 0; i <(int)(Math.random() * 20) + 1; i++) {
			phones[i] = new Phone("PPP" + i, ""+ 1000 + i);
			cnt++;
		}
	}
	
	// 데이터 입력 기능
	public void insertData() {
		if(cnt > 99) {
			System.out.println("더 이상 데이터를 입력할 수 없습니다.");
			return;
		}
		
		System.out.print("이름 입력: ");
		String nameTemp = scanner.nextLine();
		String numTemp = null;

		System.out.print("전화번호 입력: ");
		numTemp = scanner.nextLine();
		
		phones[cnt++] = new Phone(nameTemp, numTemp);
		System.out.println("입력이 완료되었습니다.");
	}
	
	// 데이터 삭제 기능
	public Phone deleteData() {
		System.out.print("삭제할 번호를 입력해주세요: ");
		String num = scanner.nextLine();
		Phone phoneTmp = new Phone(num);
		
		Phone temp = null;
		boolean flag = false;
		
		for(int i = 0; i < cnt; i++) {
			if(phones[i].equals(phoneTmp)) {
				temp = phones[i];
				// 한칸씩 앞으로 땡기기
				for(int j = i; j < cnt-1; j++) {
					phones[j] = phones[j+1];
				} phones[cnt] = null;
				cnt--; flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("없는 번호 삭제 시도입니다.");
		}
		
		return temp;
	}
	
	// 데이터 검색 기능
	public void searchData() {
		System.out.print("조회할 번호를 입력해주세요: ");
		String num = scanner.nextLine();
		
		Phone phoneTmp = new Phone(num);
		
		boolean flag = false;
		for(int i = 0; i < cnt; i++) {
			if(phones[i].equals(phoneTmp)) {
				System.out.println((phones[i]));
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("없는 번호 조회입니다.");
		}
	}
	
	// 데이터 보기 기능
	public void print() {
		Phone ph = null;
		
		System.out.println("< 정렬 기준 입력 >");
		System.out.println("1. 전화번호 오름차순");
		System.out.println("2. 전화번호 내림차순");
		System.out.println("3. 이름 오름차순");
		System.out.println("4. 이름 내림차순");
		System.out.print("입력: ");
		String tempString = scanner.nextLine();
		
		switch(tempString) {
		case "1":
			// 번호대로 오름차순 정렬
			for(int i = 0; i < cnt; i++) {
				for(int j = i+1; j < cnt; j++) {
					if(phones[i].getNumber().compareTo( phones[j].getNumber()) > 0) {
						ph = phones[i];
						phones[i] = phones[j];
						phones[j] = ph;
					}
				}
			}
			break;
		case "2":
			// 번호대로 내림차순 정렬
			for(int i = 0; i < cnt; i++) {
				for(int j = i+1; j < cnt; j++) {
					if(phones[i].getNumber().compareTo(phones[j].getNumber()) < 0) {
						ph = phones[i];
						phones[i] = phones[j];
						phones[j] = ph;
					}
				}
			}
			break;
		case "3":
			// 문자열 오름차순 정렬
			for(int i = 0; i < cnt; i++) {
				for(int j = 0; j < cnt; j++) {
					if(phones[i].getName().compareTo(phones[j].getName()) < 0) {
						ph = phones[i];
						phones[i] = phones[j];
						phones[j] = ph;
					}
				}
			}
			break;
		case "4":
			// 문자열 내림차순 정렬
			for(int i = 0; i < cnt; i++) {
				for(int j = 0; j < cnt; j++) {
					if(phones[i].getName().compareTo(phones[j].getName()) > 0) {
						ph = phones[i];
						phones[i] = phones[j];
						phones[j] = ph;
					}
				}
			}
			break;
		default:
			System.out.println("잘못된 번호입니다.");
			return;
		}
		
		
		// 출력
		for(int i = 0; i < cnt; i++) {
			System.out.println((phones[i]));
		}
	}
	
}
