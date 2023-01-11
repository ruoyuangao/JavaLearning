import java.util.concurrent.locks.ReentrantLock;

public class Main {
    private static final ReentrantLock lock = new ReentrantLock();
    private static int num = 1;
    private static char c = 'a';
    private static volatile boolean flag = true;

    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(()->{
            while (num <= 26) {
                if (flag) {
                    try {
                        lock.lock();
                        System.out.println(Thread.currentThread().getName()+":"+num);
                        ++num;
                        flag = false;
                    } finally {
                        lock.unlock();
                    }

                }
            }
        });

        Thread t2 = new Thread(()->{
            while (c <= 'z') {
                if (!flag) {
                    try {
                        lock.lock();
                        System.out.println(Thread.currentThread().getName()+":"+c);
                        ++c;
                        flag = true;
                    } finally {
                        lock.unlock();
                    }
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}