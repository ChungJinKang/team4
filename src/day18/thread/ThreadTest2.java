package day18.thread;

// 공유 데이터
class BathRoom {
	boolean first = true;
	
	public synchronized void use(String name) {
		if(first && name.equals("호우날두11")) {
			try {
				wait();	// 스레드 대기상태로
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		first = false;
		notify();	// 대기상태의 스레드 깨움
		
		System.out.println("====================");
		System.out.println(name + " 입장합니다.");
		System.out.println(name + " 사용합니다.");
		System.out.println(name + " 퇴장합니다.");
	}
}

// 여러 흐름
class MulCamThread extends Thread {
	BathRoom room;
	String std;
	
	MulCamThread(BathRoom room, String std) {
		this.room = room;
		this.std = std;
	}
	
	@Override
	public void run() {
		// 3번 쓰도록 해보자
		for(int i = 0; i < 3; i++) {
			room.use(std);
		}
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		BathRoom room = new BathRoom();	// 공우 자원 생성 
		MulCamThread t1 = new MulCamThread(room, "호우날두11");	// 자원 생성할 사람
		MulCamThread t2 = new MulCamThread(room, "호우날22");	// 자원 생성할 사람
		MulCamThread t3 = new MulCamThread(room, "호우33");		// 자원 생성할 사람
		MulCamThread t4 = new MulCamThread(room, "호우날두우44");	// 자원 생성할 사람
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
