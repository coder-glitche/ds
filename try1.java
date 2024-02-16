class MultithreadDemo1 implements Runnable {
    public void run() {
        System.out.println("Thread 1");
        for (int i = 0; i <= 50; i++) {
            try {
                int counter = 0;
                for (int num = i; num >= 1; num--) {
                    if (i % num == 0) {
                        counter = counter + 1;
                    }
                }
                if (counter == 2) {
                    System.out.println("Prime Number (1 - 50): " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("Caught: " + e);
            }
        }
    }
}

class MultithreadDemo2 implements Runnable {
    public void run() {
        System.out.println("Thread 2");
        for (int i = 100; i <= 150; i++) {
            try {
                int counter = 0;
                for (int num = i; num >= 1; num--) {
                    if (i % num == 0) {
                        counter = counter + 1;
                    }
                }
                if (counter == 2) {
                    System.out.println("Prime Number (100 - 150): " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("Caught: " + e);
            }
        }
    }
}

public class try1 {
    public static void main(String args[]) {
        MultithreadDemo1 obj1 = new MultithreadDemo1();
        Thread threadobj1 = new Thread(obj1);
        threadobj1.start();
        MultithreadDemo2 obj2 = new MultithreadDemo2();
        Thread threadobj2 = new Thread(obj2);
        threadobj2.start();
    }
}
