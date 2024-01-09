package CH15;

class Add implements Runnable {
    private int n;
    private int sum = 0;

    public Add(int a) {
        n = a;
    }

    public void run() {
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of 1 to " + n + ": " + sum);
    }
}

public class Ex15_04 {
    public static void main(String[] args) {
        Add add5 = new Add(5);
        Add add10 = new Add(10);

        Thread thread1 = new Thread(add5);
        Thread thread2 = new Thread(add10);

        thread1.start();
        thread2.start();
    }
}
