import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.w3c.dom.Document;

public class Process {

    public static void main(String[] args) throws IOException, UnirestException {
        List<Integer> list = new ArrayList<Integer>();
        Weather weather = new Weather(list);
        Weather2 weather2 = new Weather2(list);
        weather.getDegres("dnipropetrovsk", "ukraine");
        weather2.getDegres("Dnipropetrovsk");
    }
}