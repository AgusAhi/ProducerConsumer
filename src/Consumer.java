import java.util.List;

public class Consumer implements Runnable {
    List<String> list;

    public Consumer(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (!list.isEmpty()) {
                    String message = list.remove(0);
                    System.out.println(message + " (" + list.size() + " remaining) ");
                }
                int sleepTime = (int) (Math.random() * 1001 + 1000);
                Thread.sleep(sleepTime);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
