package mentorship.roadmap.Java_Core.step8_Multithereading.topic7_ThreadLocal;

public class ThreadLocalDemo {
    static final int finalCount = 100;
    static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < finalCount; i++) {
                threadLocal.set(threadLocal.get() + 1);
            }

            System.out.println("Итоговый результат потока "
                    + Thread.currentThread().getName()
                    + " = "
                    + threadLocal.get());
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("Потоки завершили свою работу!");
    }
}
