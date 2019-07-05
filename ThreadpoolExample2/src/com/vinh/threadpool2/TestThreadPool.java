package com.vinh.threadpool2;

public class TestThreadPool {
	public static int CREATE_QUEUE_SIZE = 6;
	public static int NUMBER_OF_THREAD = 5;
	public static int NUMBER_OF_TASK = 50;

	public static void main(String[] args) throws InterruptedException {
		ThreadPool threadPool = new ThreadPool(CREATE_QUEUE_SIZE, NUMBER_OF_THREAD);

		for (int taskNumber = 1; taskNumber <= NUMBER_OF_TASK; taskNumber++) {
			TestTask task = new TestTask(taskNumber);
			threadPool.submitTask(task);
		}
	}
}