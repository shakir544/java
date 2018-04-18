package org.sgooty.jvm;

public class DeadLockSimulator {
	String str1 = "Thread_one";
	String str2 = "Thread_two";

	Thread thread1 = new Thread("My Thread 1") {
		public void run() {
			while (true) {
				synchronized (str1) {
					synchronized (str2) {
						System.out.println(str1);
					}
				}
			}
		}
	};

	Thread thread2 = new Thread("My Thread 2") {
		public void run() {
			while (true) {
				synchronized (str2) {
					synchronized (str1) {
						System.out.println(str2);
					}
				}
			}
		}
	};

	public static void main(String a[]) {
		DeadLockSimulator mdl = new DeadLockSimulator();
		mdl.thread1.start();
		mdl.thread2.start();
	}

}
