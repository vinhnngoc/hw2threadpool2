package com.vinh.threadpool2;

public class TestTask implements Runnable {
	private int number;

	public TestTask(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		System.out.println("Start task number :" + number);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End task number :" + number);
	}
}