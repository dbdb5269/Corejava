package XML.homework2;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by dubo on 16/10/26.
 */

public class Parse {
    public void parse(){
        DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document parse = documentBuilder.parse("cd.xml");
            Element root = parse.getDocumentElement();
            System.out.println(root.getNodeName());
            NodeList childNodes = root.getChildNodes();
            for(int i=0;i<childNodes.getLength();i++){
                Node node = childNodes.item(i);
                if(node.getNodeType()==Node.ELEMENT_NODE){
                    NamedNodeMap nodeAttributes = node.getAttributes();
                    Node code = nodeAttributes.getNamedItem("code");
                    System.out.print(node.getNodeName());
                    System.out.println("  code="+code.getNodeValue());
                    NodeList childNodes1 = node.getChildNodes();
                    for(int j=0;j<childNodes1.getLength();j++){

                        Node item = childNodes1.item(j);
                        if (item.getNodeType()==Node.ELEMENT_NODE){
                            String nodeName = item.getNodeName();
                            System.out.print(nodeName+"  ");
                            String textContent = item.getTextContent();
                            System.out.println(textContent);

                        }

                    }
                }
                System.out.println();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Parse parse = new Parse();
        parse.parse();
    }
}
