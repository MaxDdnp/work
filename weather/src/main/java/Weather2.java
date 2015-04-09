import com.google.gson.*;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;


import java.io.IOException;
import java.util.List;

/**
 * Created by mde on 4/6/2015.
 */
public class Weather2 implements Runnable{
    private volatile List listDegres;

    public Weather2(List listDegres) {
        this.listDegres = listDegres;
    }


    @Override
    public void run() {
        try {
            listDegres.add(this.getDegres("dnipropetrovsk"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnirestException e) {
            e.printStackTrace();
        }

    }


    public synchronized Integer getDegres(String city) throws IOException, UnirestException {
        String url = null;
        Integer resultTemp = null;
        url = "https://george-vustrey-weather.p.mashape.com/api.php?location=" + city;
        HttpResponse<JsonNode> response = Unirest.get(url)
                .header("X-Mashape-Key", "73HyEdpDw5msh06bgh5cM9Pdnudop1Z5F5Vjsng7U64aCgPngl")
                .header("Accept", "application/json")
                .asJson();
        Gson gson = new Gson();
        String responseJSONString = response.getBody().toString();
        JsonElement jelem = new JsonParser().parse(responseJSONString);
        JsonArray rootarray = jelem.getAsJsonArray();
        JsonObject rootobj = rootarray.get(0).getAsJsonObject();
        resultTemp = rootobj.get("high_celsius").getAsInt();
        System.out.println(rootobj.get("high_celsius").getAsInt());
        return resultTemp;
    }
}
