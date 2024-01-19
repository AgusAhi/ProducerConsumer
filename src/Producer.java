import java.util.List;


public class Producer implements Runnable {
    private List<String> list;


    public Producer(List<String> list) {
        this.list = list;
    }


    @Override
    public void run() {
        try {
            int counter = 0;
            while (true) {
                if (list.size() < 10) {
                    list.add("Message n." + counter);
                    counter++;
                    if (counter == Integer.MAX_VALUE) {
                        counter = 0;
                    }
                }
                int sleepTime = (int) (Math.random() * 1001 + 500);
                Thread.sleep(sleepTime);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
