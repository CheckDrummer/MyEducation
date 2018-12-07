package Learn6;

import java.util.concurrent.*;

public class LessonThread {

    public static void sleepTest() {
        new Thread(() -> {
            for (int i = 0; i <= 100; i++)
                System.out.println("привет из потока 1 - " + i + " раз!");
        }).start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Это основной поток " + Thread.currentThread().getName());
        Thread.currentThread().interrupt();
//        Thread.currentThread().stop();
        if (!Thread.currentThread().isInterrupted()) {
            new Thread(() -> System.out.println("привет из потока 2!!!")).start();
        }
    }


    public static void threadTest() {
        new Thread() {
            @Override
            public void run() {
                System.out.println("Thread");
            }
        }.start();
    }

    public static void runnableTest() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable");
            }
        }).start();
    }

    public static void callableTest() throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(myCallable);
//        FutureTask<Integer> futureTask = new FutureTask<>(() -> {return 1;});
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }

    static class MyCallable implements Callable {
        @Override
        public Object call(){
            return 1;
        }
    }


    public static void ExecutorServiceTest() throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            service.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("ExecutorService");
                }
            });
        }

        Future future = service.submit(new LessonThread.MyCallable());
        System.out.println(future.get());
        service.shutdown();
    }

    public static void main(String[] args){
        threadTest();
    }
}
