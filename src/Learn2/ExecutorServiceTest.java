package Learn2;

import java.util.concurrent.*;

public class ExecutorServiceTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i ++) {
			service.submit(new Runnable() { //or Thread or Callable
				@Override
				public void run() {
					System.out.println("ExecutorService");
				}
			});
		}

		Future future = service.submit(new MyCallable()); //optional
		System.out.println(future.get());
		service.shutdown();


		new Thread() {
			@Override
			public void run() {
				System.out.println("Thread");
			}
		}.start();


		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable");
			}
		}).start();


		MyCallable myCallable = new MyCallable();
		FutureTask<Integer> futureTask = new FutureTask<Integer>(myCallable);
		new Thread(futureTask).start();
		System.out.println(futureTask.get());
    }

	static class MyCallable implements Callable {
		@Override
		public Object call() throws Exception {
			return 1;
		}
	}
}
