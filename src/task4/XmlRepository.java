package task4;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by TTN on 05.04.2017.
 */
public class XmlRepository implements Repository {

    @Override
    public List<Vegetable> getVegetables() {
        List<Vegetable> vegetables = new ArrayList<>();
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

            Document document = documentBuilder.parse(new File("resources/vegetables.xml"));

            document.normalizeDocument();

            Element root = document.getDocumentElement();

            NodeList vegetable = root.getElementsByTagName("vegetable");

            for (int i = 0; i < vegetable.getLength(); i++) {
                Element item = (Element) vegetable.item(i);
                String id = item.getAttribute("id");

                Element name = (Element) item.getElementsByTagName("name").item(0);
                Element calories = (Element) item.getElementsByTagName("calories").item(0);
                Element weight = (Element) item.getElementsByTagName("weight").item(0);

                vegetables.add(new Vegetable(Integer.valueOf(id), name.getTextContent(), Integer.valueOf(calories.getTextContent()), Integer.valueOf(weight.getTextContent())));
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return vegetables;
    }

}
