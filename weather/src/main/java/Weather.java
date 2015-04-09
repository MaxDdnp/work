

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

/**
 * Created by mde on 4/2/2015.
 */
public class Weather implements Runnable{
    private volatile List listDegres;


    public Weather(List listDegres) {
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


    public synchronized Integer getDegres(String city, String country) throws IOException{
        String url = null;
        Integer resultTemp = null;
        url = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "," + country + "&units=metric";
        URL reqURL = new URL(url);

        InputStream in = reqURL.openStream();
        BufferedReader bReader = new BufferedReader(new InputStreamReader(in));
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(bReader);
        JsonObject rootobj = root.getAsJsonObject();
        JsonObject main = rootobj.getAsJsonObject("main");
        resultTemp = main.get("temp").getAsInt();
        return resultTemp;
    }



}
