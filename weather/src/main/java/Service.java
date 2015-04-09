import java.util.ArrayList;
import java.util.List;

/**
 * Created by mde on 4/6/2015.
 */
public class Service implements Runnable{
      private volatile List<Integer> allTemp = new ArrayList<Integer>();

    @Override
    public void run() {
        Thread t1 = new Thread(new Weather(allTemp));
        Thread t2 = new Thread(new Weather2(allTemp));
        t1.start();
        t2.start();
        try {
            t1.join(500);
            t2.join(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.calculateAverage(allTemp));
    }

    private synchronized int calculateAverage(List <Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (Integer mark : list) {
            sum += mark;
        }

        return sum / list.size();
    }
}
