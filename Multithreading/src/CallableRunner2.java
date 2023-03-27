import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CallableTask implements Callable<String> {
	private String name;

	public CallableTask(String name) {
		this.name = name;

	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		return "Hello" + name;
	}

}

public class CallableRunner2 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		System.out.println("callableTask thread executed");

		List<CallableTask> listCallable = List.of(new CallableTask("Milad1"), new CallableTask("Milad2"),
				new CallableTask("Milad3"));
		// Future<String> wlcomeFuture = executorService.submit(new
		// CallableTask("Milad"));
		String result = executorService.invokeAny(listCallable);

		System.out.println(result);

		// String WelcomeMessage = wlcomeFuture.get();
		// System.out.println(WelcomeMessage);

		System.out.println("main thread executed");
	}
}
