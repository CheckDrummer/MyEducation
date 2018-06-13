package Learn2;

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


public class ThreadTest {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getPriority());



		System.out.println("Главный поток начал работу...");
		new MyThread("Дочерний").start();
		System.out.println("Главный поток завершил работу...");



		System.out.println("Главный поток начал работу...");
		MyThread t = new MyThread("Дочерний");
		try {
			t.start();
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Главный поток завершил работу...");


//		System.out.println("Главный поток начал работу...");
//		Thread t = new Thread(new MyRunnable(), "Дочерний 2");
//		try {
//			t.start();
//			t.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Главный поток завершил работу...");
    }
}
