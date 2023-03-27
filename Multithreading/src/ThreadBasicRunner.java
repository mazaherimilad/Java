class Task1 extends Thread {
	@Override
	public void run() {
		System.out.println("Task1 Started ");
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask1 Done");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Task2 Started ");
		for (int i = 200; i <= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask2  Done");
	}

}

public class ThreadBasicRunner {
	public static void main(String[] args) throws InterruptedException {
		// create and start Task1
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start();
		task1.sleep(10000);

		// create and start Task2
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);// task2 should be done before task1

		task1.join();// wait for task one to finish

		task2Thread.start();
		// create and start Task3
		// wait for task1 to complete
		// wait for all tasks to finish
		System.out.println("Task3 Started ");
		for (int i = 300; i <= 399; i++) {
			System.out.print(i + " ");

		}
		System.out.println("\nMain Done");

	}
}
