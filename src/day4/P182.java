package day4;

public class P182 {

	public static void main(String[] args) {
		int cnt = 5, sum = 0;
		int[] score = new int[cnt];	// new �Ҷ� �������� �迭 ���� ������ 
		
		/*
		//System.out.println(score.length);
		//score[0] = 99;	// �ε��� ���� �Ѿ�� ��Ÿ�� ���� �߻�
		
		System.out.print(score[0] + " ");
		System.out.print(score[1] + " ");
		System.out.print(score[2] + " ");
		System.out.print(score[3] + " ");
		System.out.print(score[4] + " ");
		//System.out.println(score[5] + " ");
		*/
		
		for(int i = 0; i < score.length; i++) {
			score[i] = (int)(Math.random()*10 + 1);
			System.out.print(score[i] + " ");
		} System.out.println();
		
		for( int data : score ) {	//jdk 1.5���� �߰��� ���
			//System.out.print(data + " ");
			sum += data;
		}
		System.out.println("����: " + sum + ", ���: " + sum / score.length + " ");
	}

}
