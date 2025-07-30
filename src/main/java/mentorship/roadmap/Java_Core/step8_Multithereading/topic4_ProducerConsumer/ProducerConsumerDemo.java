package mentorship.roadmap.Java_Core.step8_Multithereading.topic4_ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumerDemo {
    static final Random random = new Random();
    static final int capacity = 5;
    static final Queue<Integer> buffer = new LinkedList<>();

    public static void main(String[] args) {
        Thread producer = new Thread(() -> {
            while (true) {
                synchronized (buffer) {
                    try {
                        int num = random.nextInt()*100 + 1;
                        while (buffer.size() >= capacity) {
                            buffer.wait();
                        }
                        buffer.add(num);
                        System.out.println("В буфер добавлено число " + num);
                        buffer.notifyAll();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });

        Thread consumer = new Thread(() -> {
            while (true) {
                synchronized (buffer) {
                    try {
                        while (buffer.isEmpty()) {
                            buffer.wait();
                        }
                        System.out.println("Из буфера извлечено число " + buffer.poll());
                        buffer.notifyAll();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
