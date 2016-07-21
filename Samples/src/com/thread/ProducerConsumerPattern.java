package com.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumerPattern {

	public static void main(String args[]) {

		
		BlockingQueue sharedQueue = new LinkedBlockingQueue(4);

		// Creating Producer and Consumer Thread
		Thread prodThread = new Thread(new Producer1(sharedQueue));
		Thread consThread = new Thread(new Consumer1(sharedQueue));

		// Starting producer and Consumer thread

		consThread.start();
		prodThread.start();
	}

}

// Producer Class in java
class Producer1 implements Runnable {

	private final BlockingQueue sharedQueue;

	public Producer1(BlockingQueue sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("Produced: " + i);
				sharedQueue.put(i);
				// Thread.sleep(50);
			} catch (InterruptedException ex) {
				Logger.getLogger(Producer.class.getName()).log(Level.SEVERE,
						null, ex);
			}
		}
	}

}

// Consumer Class in Java
class Consumer1 implements Runnable {

	private final BlockingQueue sharedQueue;

	public Consumer1(BlockingQueue sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		 while(true){
		try {
			 Thread.sleep(50);
			System.out.println("Consumed: " + sharedQueue.take());
		} catch (InterruptedException ex) {
			Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null,
					ex);
		}}
	}
}
