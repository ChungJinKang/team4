package phone.step1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class PhoneManager implements PhoneService2 {
	Phone[] phones = new Phone[100];
	int cnt = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	public PhoneManager() {
		//Scanner scanner2;
		try {
			Scanner scanner2 = new Scanner(new File("test.txt"));
			while(scanner2.hasNextLine()) {
				String readdata = scanner2.nextLine();
				String[] data = readdata.split("/");
				phones[cnt++] = new Phone(data[0], data[1]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	@Override
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

	@Override
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

	@Override
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
	
	@Override
	public void print() {
		Phone[] temp = new Phone[cnt];
		System.arraycopy(phones, 0, temp, 0, cnt);
		
		System.out.println("< 정렬 기준 입력 >");
		System.out.println("1. 전화번호 오름차순");
		System.out.println("2. 전화번호 내림차순");
		System.out.println("3. 이름 오름차순");
		System.out.println("4. 이름 내림차순");
		System.out.print("입력: ");
		
		int tempInt = Integer.parseInt(scanner.nextLine());
		temp[0].setMode(tempInt);
		
		if(temp[0].getMode() < 1 || temp[0].getMode() > 4) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		Arrays.sort(temp);
		System.out.println(Arrays.toString(temp));					
		
	}

}
