package Day7;

public class JoinThreads extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        JoinThreads t1 = new JoinThreads();
        JoinThreads t2 = new JoinThreads();
        JoinThreads t3 = new JoinThreads();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }
}
