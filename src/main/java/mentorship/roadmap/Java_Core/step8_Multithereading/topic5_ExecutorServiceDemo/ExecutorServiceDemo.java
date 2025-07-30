package mentorship.roadmap.Java_Core.step8_Multithereading.topic5_ExecutorServiceDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        IntStream
                .range(0, 5)
                .forEach(x -> executorService.execute(() -> {
                    System.out.println("Номер задачи = " + (x+1)
                            + ", выполняется в потоке "
                            + Thread.currentThread().getName());
                }));

        executorService.shutdown();
    }
}
