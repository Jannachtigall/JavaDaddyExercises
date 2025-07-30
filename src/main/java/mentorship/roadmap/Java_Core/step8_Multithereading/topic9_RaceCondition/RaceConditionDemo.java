package mentorship.roadmap.Java_Core.step8_Multithereading.topic9_RaceCondition;

import java.util.stream.IntStream;

public class RaceConditionDemo {

    static int count;

    public static void main(String[] args) throws InterruptedException {
        // Пример несинхронизированного увеличения
        count = 0;

        Runnable counting = () -> IntStream
                .range(0, 1000)
                .forEach(x -> counting());

        Thread thread1 = new Thread(counting);
        Thread thread2 = new Thread(counting);

        thread2.start();
        thread1.start();

        thread1.join();
        thread2.join();

        System.out.println("Результат вычисления переменной count = "
                + count
                + " (ожидаемое значение = 2000).");

        // Пример синхронизированного увеличения
        count = 0;

        Runnable synchronizedCounting = () -> IntStream
                .range(0, 1000)
                .forEach(x -> synchronizedCounting());

        Thread thread3 = new Thread(synchronizedCounting);
        Thread thread4 = new Thread(synchronizedCounting);

        thread3.start();
        thread4.start();

        thread3.join();
        thread4.join();

        System.out.println("Результат синхронизированного вычисления переменной count = "
                + count
                + " (ожидаемое значение = 2000).");
    }

    public static void counting() {
        count++;
    }

    public static synchronized void synchronizedCounting() {
        count++;
    }
}
