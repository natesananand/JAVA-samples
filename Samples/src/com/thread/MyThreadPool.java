package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPool {
	public static void main(String args[]) {

		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable worker = new WorkThread("" + i);
			executor.execute(worker);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
		System.out.println("Finished all threads");
	}

}

class WorkThread implements Runnable {

	private String command;

	public WorkThread(String command) {
		this.command = command;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start. Command = " + command);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " End.");

	}

	public String toString() {
		return this.command;
	}

}