package mentorship.roadmap.Java_Core.step8_Multithereading.topic8_Deadlock;

public class DeadlockDemo {
    public static final Object lock1 = new Object();

    public static final Object lock2 = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Поток " + Thread.currentThread().getName() + " синхронизирован по lock1");
                synchronized (lock2) {
                    System.out.println("Поток " + Thread.currentThread().getName() + " синхронизирован ещё и по lock2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Поток " + Thread.currentThread().getName() + " синхронизирован по lock2");
                synchronized (lock1) {
                    System.out.println("Поток " + Thread.currentThread().getName() + " синхронизирован ещё и по lock1");
                }
            }
        });

        thread1.start();
        thread2.start();

        Thread.sleep(3000);
        if (thread1.isAlive() && thread2.isAlive()) {
            System.out.println("Потоки не могут продолжить работу! Произошёл Deadlock!");
        }
    }

}
