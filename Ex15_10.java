class PrintStrings implements Runnable {
    private String message;
    private int interval;

    public PrintStrings(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + " " + i);

            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Ex15_10 {
    public static void main(String[] args) {
        Thread hi = new Thread(new PrintStrings("Hello", 1000)); // 每隔1秒印出一次
        Thread bye = new Thread(new PrintStrings("Good bye", 2500)); // 每隔2.5秒印出一次

        hi.start();
        bye.start();
    }
}
