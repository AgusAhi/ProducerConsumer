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
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
