package XML.jaxpdom;


import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

/**
 * Created by dubo on 16/10/26.
 */
public class FirstDomTest {
    //使用原生DOM解析XML文件
    public void parse(){
        //获得dom解析器对象的DocumentBuilder
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            //解析文件
            Document document = documentBuilder.parse(new File("./employee.xml"));
            //获取根元素
            Element rootelement = document.getDocumentElement();
            System.out.println(rootelement.getNodeName());
            NodeList childNodes = rootelement.getChildNodes();
            for (int i=0;i<childNodes.getLength();i++){
                Node node=childNodes.item(i);

                if(node.getNodeType()==Node.ELEMENT_NODE){
                    NamedNodeMap nodeAttributes = node.getAttributes();
                    Node namedItem = nodeAttributes.getNamedItem("id");
                    NodeList childNodes1 = node.getChildNodes();
                    System.out.println(node.getNodeName());
                    System.out.println(namedItem.getNodeValue());
                    for(int j=0;j<childNodes1.getLength();j++){
                        Node node1=childNodes1.item(j);
                        if (node1.getNodeType()==Node.ELEMENT_NODE){
                            String textContent = node1.getTextContent();
                            System.out.println(textContent);
                        }
                    }


                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        FirstDomTest firstDomTest=new FirstDomTest();
        firstDomTest.parse();
    }
}
