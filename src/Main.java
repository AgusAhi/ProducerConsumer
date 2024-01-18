import java.util.List;
import java.util.Vector;


public class Main {
    public static void main(String[] args) {
        List<String> list = new Vector<String>();
        Producer producer = new Producer(list);
        Consumer consumer = new Consumer(list);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
