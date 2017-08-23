package day4;

public class P182 {

	public static void main(String[] args) {
		int cnt = 5, sum = 0;
		int[] score = new int[cnt];	// new 할때 힙영역에 배열 공간 생성됨 
		
		/*
		//System.out.println(score.length);
		//score[0] = 99;	// 인덱스 범위 넘어가면 런타임 예외 발생
		
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
		
		for( int data : score ) {	//jdk 1.5에서 추가된 기능
			//System.out.print(data + " ");
			sum += data;
		}
		System.out.println("총합: " + sum + ", 평균: " + sum / score.length + " ");
	}

}
