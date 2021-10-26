package com.cg.oct12.day5.mt;

public class MtDemo extends Thread {
	
	public void myLoop() {
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	@Override
	public void run() {
		this.myLoop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MtDemo mt1 = new MtDemo();
		mt1.start();
		
		MtDemo mt2 = new MtDemo();
		mt2.start();
	}

}
