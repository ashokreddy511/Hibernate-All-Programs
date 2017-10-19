package com.tdl;
public class ThreadLocalExample {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable sharedRunnableIntance = new MyRunnable();
		Thread thread1 = new Thread(sharedRunnableIntance);
		Thread thread2 = new Thread(sharedRunnableIntance);
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
	}
	public static class MyRunnable implements Runnable {
		private ThreadLocal<Integer> threadlocal = new ThreadLocal<Integer>();
		public void run() {
			threadlocal.set((int) (Math.random() * 100D));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

			}
			System.out.println(threadlocal.get());
			System.out.println(threadlocal);
		}

	}
}
