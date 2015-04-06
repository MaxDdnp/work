import java.io.IOException;
import java.util.List;

/**
 * Created by mde on 4/6/2015.
 */
public class Weather2 implements Runnable{
    private List listDegres;

    public Weather2(List listDegres) {
        this.listDegres = listDegres;
    }


    @Override
    public void run() {
        try {
            listDegres.add(this.getDegres("dnipropetrovsk", "ukraine"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public Integer getDegres(String latitude, String longtitude) throws IOException{
        String url = null;
        Integer resultTemp = null;
        url = "https://api.forecast.io/forecast/0d00fe8369cb480ceab3ec8950dd8aab/" + latitude + "," + longtitude;


        return resultTemp;
    }
}
