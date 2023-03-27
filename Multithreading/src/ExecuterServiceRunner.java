import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {

	private int number;

	public Task(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		System.out.println("Task" + number + "Started ");
		for (int i = number * 100; i <= number * 100 + 99; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(i + " ");
		}
		System.out.println("\nTask" + number + "Done");
	}
}

public class ExecuterServiceRunner {
	public static void main(String[] args) {
		// ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		executorService.execute(new Task(1));// after finish task 1 , task2 will be executed
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));

//		System.out.println("Task3 Started ");
//		for (int i = 300; i <= 399; i++) {
//			System.out.print(i + " ");
//		}
		executorService.shutdown();

	}
}
