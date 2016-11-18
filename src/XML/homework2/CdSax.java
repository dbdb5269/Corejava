package XML.homework2;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.util.List;

/**
 * Created by dubo on 16/10/27.
 */
public class CdSax {
    public static void main(String[] args) {
        try {
            XMLReader reader= XMLReaderFactory.createXMLReader();
            CDHandler cdHandler = new CDHandler();
            reader.setContentHandler(cdHandler);
            reader.parse("./cd.xml");
            List<Cd> list = cdHandler.getList();
            int size = list.size();
            System.out.println(size);
            for(Cd cd:list){

                //System.out.println(cd.getTitle());
                //System.out.println(cd.getCode());
                System.out.println(cd.getTitle());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
