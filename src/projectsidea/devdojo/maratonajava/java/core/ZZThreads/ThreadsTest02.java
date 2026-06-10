package projectsidea.devdojo.maratonajava.java.core.ZZThreads;

class ThreadExample2 extends Thread {
    private String c;


    static class threadExampleRunnable2  implements Runnable {
        private String x;

        public threadExampleRunnable2 (String x) {
            this.x = x;
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


    public static class ThreadsTest02 {
        public static void main(String[] args) throws InterruptedException {
           Thread t1 = new Thread(new threadExampleRunnable2("KA"));
           Thread t2 = new Thread(new threadExampleRunnable2("ME"));
           t1.setPriority(Thread.MAX_PRIORITY);
           t1.start();
           t1.join();
           t2.start();

        }
//
    }
}
