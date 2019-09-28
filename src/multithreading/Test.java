package multithreading;

import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {

		/*
		 * MyThread thread = new MyThread("Thread-1"); MyThread thread2 = new
		 * MyThread("Thread-2");
		 * 
		 * thread.start(); thread2.start();
		 * 
		 * for (int i = 0; i < 100; i++) {
		 * 
		 * Thread.currentThread().setName("MainThread"); //
		 * System.out.println(Thread.currentThread().getName()+"==>"+ i); try {
		 * Thread.sleep(10); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * System.out.println("MainThread"); }
		 * 
		 * System.out.println("Number of active Thread" + Thread.activeCount());
		 */

		Message msg = new Message("Waiter");

		Waiter w1 = new Waiter(msg);
		Notify w2 = new Notify(msg);
		Thread t1 = new Thread(w1);
		Thread t2 = new Thread(w2);

		t1.start();
		t2.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("End With Main Thread");

	}

}
