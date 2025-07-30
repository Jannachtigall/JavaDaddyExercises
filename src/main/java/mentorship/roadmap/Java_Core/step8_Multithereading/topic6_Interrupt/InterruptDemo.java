package mentorship.roadmap.Java_Core.step8_Multithereading.topic6_Interrupt;

public class InterruptDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread workingThread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    System.out.println("Работаю...");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        workingThread.start();

        Thread.sleep(3000);

        workingThread.interrupt();

        System.out.println("Поток завершил работу!");
    }
}
