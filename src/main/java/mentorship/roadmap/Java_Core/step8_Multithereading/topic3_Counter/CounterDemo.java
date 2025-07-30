package mentorship.roadmap.Java_Core.step8_Multithereading.topic3_Counter;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CounterDemo {

    public static void main(String[] args) {
        Counter counter = new Counter();
        int incsCount = 10;
        int threadsCount = 5; // Итоговый результат должен быть равен 50

        Runnable runnable = () -> IntStream.range(0, incsCount)
                .forEach(x -> counter.increment());

        Thread[] threads = new Thread[threadsCount];
        IntStream.range(0, threadsCount)
                .forEach(i -> {
                    threads[i] = new Thread(runnable);
                    threads[i].start();
                });

        IntStream.range(0, threadsCount)
                .forEach(i -> {
                    try {
                        threads[i].join();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });

        System.out.println("Все потоки завершили работу, итоговый результат = " + counter.getCount());
    }
}
