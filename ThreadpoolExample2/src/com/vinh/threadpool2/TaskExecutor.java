package com.vinh.threadpool2;

public class TaskExecutor implements Runnable {

	BlockingQueue<Runnable> queue;

	public TaskExecutor(BlockingQueue<Runnable> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			while (true) {
				Runnable task = queue.dequeue();
				task.run();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}