

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


    public int getDegres(String city, String country) throws IOException{
        String url = null;
        int resultDegres;
        url = "http://api.openweathermap.org/data/2.5/weather?q=city,country" + city + "," + country + "&units=metric";
        URL reqURL = new URL(url);

        InputStream in = reqURL.openStream();
        BufferedReader bReader = new BufferedReader(new InputStreamReader(in));
        JsonParser jp = new JsonParser(); //from gson
        JsonElement root = jp.parse(bReader); //convert the input stream to a json element
        JsonObject rootobj = root.getAsJsonObject();
        JsonObject main = rootobj.getAsJsonObject("main");
        JsonObject temp = main.getAsJsonObject("temp");
        String resultDegr = temp.toString();
        System.out.println(resultDegr);

        return degres;
    }



}
