import java.util.List;

/**
 * Created by mde on 4/2/2015.
 */
public class Weather implements Runnable{
    private List listDegres;
    private String url;
    private int degres;
    public Weather() {
    }


    public Weather(List listDegres, String url) {
        this.listDegres = listDegres;
        this.url = url;
    }


    @Override
    public void run() {

    }


    public int getDegres() {
        return degres;
    }
}
