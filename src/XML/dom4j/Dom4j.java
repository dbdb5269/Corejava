package XML.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * Created by dubo on 16/10/27.
 */

public class Dom4j {
    public static void main(String[] args) {
        //构建解析器
        SAXReader saxReader = new SAXReader();
        try {
            Document document = saxReader.read("./cd.xml");
            Element rootElement = document.getRootElement();
            List<Element> elements = rootElement.elements();
            for (Element element:elements){
                System.out.println(element.getName());
                System.out.println("---------");
                List<Element> child = element.elements();
                for (Element element1:child){
                    System.out.println(element1.getName());
                    System.out.println(element1.getText());
                }
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }

    }
}
