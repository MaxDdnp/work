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
    }
}
