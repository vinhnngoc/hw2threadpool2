package com.vinh.threadpool2;

public class ThreadPool {

	BlockingQueue<Runnable> queue;

	public ThreadPool(int queueSize, int numberThread) {
		queue = new BlockingQueue<>(queueSize);
		String threadName = null;
		TaskExecutor task = null;
		for (int count = 0; count < numberThread; count++) {
			threadName = "Thread No " + count;
			task = new TaskExecutor(queue);
			Thread thread = new Thread(task, threadName);
			thread.start();
		}
	}

	public void submitTask(Runnable task) throws InterruptedException {
		queue.enqueue(task);
	}

}