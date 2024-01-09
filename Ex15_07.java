package CH15;

class MyRunnable implements Runnable {
    private String threadName;
    private int runCount;

    public MyRunnable(String name, int count) {
        threadName = name;
        runCount = count;
    }

    public void run() {
        for (int i = 1; i <= runCount; i++) {
            System.out.println("Thread " + threadName + " is running...");
            try {
                if (threadName.equals("t1")) {
                    Thread.sleep(1000); // Sleep for 1 second (1000 milliseconds)
                } else if (threadName.equals("t2")) {
                    Thread.sleep(2500); // Sleep for 2.5 seconds (2500 milliseconds)
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Ex15_07 {
    public static void main(String[] args) {
        MyRunnable myRunnable1 = new MyRunnable("t1", 10);
        MyRunnable myRunnable2 = new MyRunnable("t2", 10);

        Thread t1 = new Thread(myRunnable1);
        Thread t2 = new Thread(myRunnable2);

        t1.start();
        t2.start();
    }
}

