package projectsidea.devdojo.maratonajava.java.core.ZZThreads;

class ThreadExample extends Thread{
private char x;

public ThreadExample(char x){
    this.x=x;
}

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(x);
            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }
}

class threadExampleRunnable implements Runnable{
    private char x;

    public threadExampleRunnable(char x){
        this.x=x;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(x);
            if (i % 100 == 0) {
                System.out.println();
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadsTest01 {
    public static void main(String[] args) {
//        ThreadExample t1 = new ThreadExample('a');
//        ThreadExample t2 = new ThreadExample('b');
//        ThreadExample t3 = new ThreadExample('c');
//        ThreadExample t4 = new ThreadExample('d');
        Thread t1 = new Thread(new threadExampleRunnable('a'));
        Thread t2 = new Thread(new threadExampleRunnable('b'));
        Thread t3 = new Thread(new threadExampleRunnable('c'));
        Thread t4 = new Thread(new threadExampleRunnable('d'));

        t4.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
