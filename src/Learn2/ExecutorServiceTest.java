package Learn2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i ++) {
			service.submit(new Runnable() {
				@Override
				public void run() {
					System.out.println("sdfsf");
				}
			});
		}
		service.shutdown();
    }
}
