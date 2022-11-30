package Week13;

import java.math.BigInteger;

class MultiThread1 extends Thread {
	@Override
	public void run() {
		long startTime = System.currentTimeMillis();
		for(int i=0; i < 300; i++) {
			System.out.print("-");
			for(long y=0; y<1000000000000L; y++);
		}
	}
}

class MultiThread2 extends Thread {
	@Override
	public void run() {
		long startTime = System.currentTimeMillis();
		for(int i=0; i < 300; i++) {
			System.out.print("|");
			for(long y=0; y<1000000000000L; y++);
		}
	}
}

public class Ex_MultiThread {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThread1 th = new MultiThread1();
		MultiThread2 th2 = new MultiThread2();
		th.setPriority(1); // �켱���� ���� 1~10
		th2.setPriority(10); 
		th.start();
		th2.start();
	}
}
