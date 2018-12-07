package Learn2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThread extends Thread {
    MyThread (String name) {
        super(name);
    }

    public void run() {
        System.out.printf("%s поток начал работу \n", Thread.currentThread().getName());
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println("Поток прерван");
        }
        System.out.printf("%s поток завершил работу \n", Thread.currentThread().getName());
    }
}

class MyRunnable implements Runnable {
    MyRunnable (){
    }

    public void run() {
        System.out.printf("%s поток начал работу \n", Thread.currentThread().getName());
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println("Поток прерван");
        }
        System.out.printf("%s поток завершил работу \n", Thread.currentThread().getName());
    }
}

class MyCallable implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        return 3;
    }
}

public class ThreadTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getPriority());



//		System.out.println("Главный поток начал работу...");
//		new LessonThread("Дочерний").start();
//		System.out.println("Главный поток завершил работу...");



//		System.out.println("Главный поток начал работу...");
//		LessonThread t = new LessonThread("Дочерний");
//		try {
//			t.start();
//			t.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Главный поток завершил работу...");



//		System.out.println("Главный поток начал работу...");
//		Thread t = new Thread(new MyRunnable(), "Дочерний 2");
//		try {
//			t.start();
//			t.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Главный поток завершил работу...");



        Callable<Integer> myCallable = new MyCallable();
        FutureTask futureTask = new FutureTask(myCallable);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }
}
