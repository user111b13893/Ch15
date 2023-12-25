class CData extends Thread {
    private static int sum = 30;
    private int n;
    private int sec;
    public CData(int a, int s) {
        n = a;
        sec = s;
    }

    public void run() {
        while (sum > 10)
            sub(n, sec);
    }

    public static void sub(int a, int s) {
        int tmp = sum - a;
        try {
            sleep(s);
        } catch (InterruptedException e) {}
        if (tmp > 0) {
            sum = tmp;
            System.out.println("減" + a + "後，餘數為" + sum);
        }
    }
}

public class Ex15_13 {
    public static void main(String arg[]) {
        CData d1 = new CData(5, 1500);
        CData d3 = new CData(9, 1000);
        CData d2 = new CData(8, 2000);
        d1.start();
        d2.start();
        d3.start();
    }
}
