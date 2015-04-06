import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.URL;
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

        Display disp = new Display();

        Document doc = generateXML("918981");
        disp.getConditions(doc);
        Weather weather = new Weather();
        weather.getDegres("dnipropetrovsk", "ukraine");
    }

    public static Document generateXML(String code) throws IOException {

        String url = null;
        String XmlData = null;

        // creating the URL
        url = "http://weather.yahooapis.com/forecastrss?w=" + code + "&u=c";
        URL xmlUrl = new URL(url);
        InputStream in = xmlUrl.openStream();

        // parsing the XmlUrl
        Document doc = parse(in);

        return doc;

    }

    public static Document parse(InputStream is) {
        Document doc = null;
        DocumentBuilderFactory domFactory;
        DocumentBuilder builder;

        try {
            domFactory = DocumentBuilderFactory.newInstance();
            domFactory.setValidating(false);
            domFactory.setNamespaceAware(false);
            builder = domFactory.newDocumentBuilder();

            doc = builder.parse(is);
        } catch (Exception ex) {
            System.err.println("unable to load XML: " + ex);
        }
        return doc;
    }
}