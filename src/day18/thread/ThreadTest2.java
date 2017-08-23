package day18.thread;

// ���� ������
class BathRoom {
	boolean first = true;
	
	public synchronized void use(String name) {
		if(first && name.equals("ȣ�쳯��11")) {
			try {
				wait();	// ������ �����·�
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		first = false;
		notify();	// �������� ������ ����
		
		System.out.println("====================");
		System.out.println(name + " �����մϴ�.");
		System.out.println(name + " ����մϴ�.");
		System.out.println(name + " �����մϴ�.");
	}
}

// ���� �帧
class MulCamThread extends Thread {
	BathRoom room;
	String std;
	
	MulCamThread(BathRoom room, String std) {
		this.room = room;
		this.std = std;
	}
	
	@Override
	public void run() {
		// 3�� ������ �غ���
		for(int i = 0; i < 3; i++) {
			room.use(std);
		}
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		BathRoom room = new BathRoom();	// ���� �ڿ� ���� 
		MulCamThread t1 = new MulCamThread(room, "ȣ�쳯��11");	// �ڿ� ������ ���
		MulCamThread t2 = new MulCamThread(room, "ȣ�쳯22");	// �ڿ� ������ ���
		MulCamThread t3 = new MulCamThread(room, "ȣ��33");		// �ڿ� ������ ���
		MulCamThread t4 = new MulCamThread(room, "ȣ�쳯�ο�44");	// �ڿ� ������ ���
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
