class Sub implements Runnable {
    private int n;
    private int sum = 1;

    private Sub(int a) {
        n = a;
    }

    public synchronized void run() {
        calculateFactorial();
    }

    private void calculateFactorial() {
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        System.out.println("Factorial of " + n + ": " + sum);
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Sub(5));
        Thread thread2 = new Thread(new Sub(10));

        thread1.start();
        thread2.start();
    }
}
