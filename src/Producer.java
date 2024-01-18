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
                list.add("Message n." + counter);
                counter++;
                if (counter == Integer.MAX_VALUE) {
                    counter = 0;
                }
                list.add("String number " + counter);


                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
