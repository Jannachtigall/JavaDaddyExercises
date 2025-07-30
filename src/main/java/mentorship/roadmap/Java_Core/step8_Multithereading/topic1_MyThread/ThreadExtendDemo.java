package mentorship.roadmap.Java_Core.step8_Multithereading.topic1_MyThread;

public class ThreadExtendDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("Все потоки завершили свою работу!");
    }
}
