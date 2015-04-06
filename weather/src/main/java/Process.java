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
import org.w3c.dom.Document;

public class Process {

    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<Integer>();
        Weather weather = new Weather(list, "http://api.openweathermap.org/data/2.5/weather?q=");
        weather.getDegres("dnipropetrovsk", "ukraine");
    }
}