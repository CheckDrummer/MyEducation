package Learn6;

public class LessonThread {

    public static void threadTest() {
        Thread firstAdditionalThread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++)
                    System.out.println("привет из потока 1 - " + i + " раза!");
            }
        };
        firstAdditionalThread.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Это основной поток " + Thread.currentThread().getName());
        Thread.currentThread().interrupt();
//        Thread.currentThread().stop();

        Thread secondAdditionalThread = new Thread() {
            @Override
            public void run() {
                System.out.println("привет из потока 2");
            }
        };
        secondAdditionalThread.start();
    }

    public static void runnableTest() {

    }

    public static void callableTest() {

    }


    public static void main(String[] args){
        threadTest();

    }
}
