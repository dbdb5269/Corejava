package XML.jaxpsax;

import XML.jaxpdom.FirstDomTest;
import com.ch04.advance.Student;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by dubo on 16/10/26.
 */
public class FirstSaxTest {
    private Student student;
    private List<Student> list=new ArrayList<>();
    public void parse(String fileName){
        SAXParserFactory factory=SAXParserFactory.newInstance();
        factory.setNamespaceAware(true);
        try {
            SAXParser parser=factory.newSAXParser();
            try {
                parser.parse(fileName,new DefaultHandler(){
                    private String incurren;

                    public String getIncurren() {
                        return incurren;
                    }

                    public void setIncurren(String incurren) {
                        this.incurren = incurren;
                    }

                    @Override
                    //遇到文档开始标签
                    public void startDocument() throws SAXException {
                        System.out.println("开始解析");
                    }

                    @Override
                    //遇到开始标签
                    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
//                        System.out.println("uri="+uri);
//                        System.out.println("localName="+localName);
//                        System.out.println("qName="+qName);
//                        System.out.println("attributes="+attributes);

                        if ("employee".equals(qName)) {

                            String idValue=attributes.getValue("id");
                            //System.out.println(idValue);
                            System.out.print("<"+qName +" id="+"\""+idValue+"\""+">");
                            student =new Student();
                            student.setId(Integer.parseInt(idValue));
                        }else {
                            System.out.print("<"+qName+">");
                        }
                        incurren=qName;
                    }

                    @Override
                    public void endElement(String uri, String localName, String qName) throws SAXException {
                        System.out.print("</"+qName+">");
                        if ("employee".equals(qName)){
                            list.add(student);
                        }
                    }

                    @Override
                    public void characters(char[] ch, int start, int length) throws SAXException {
                        String str=new String(ch,start,length);
                        System.out.print(str);
                        if (incurren.equals("name")){
                            student.setName(str);
                            incurren="";
                        }else if(incurren.equals("age")){
                            student.setAge(Integer.parseInt(str));
                            incurren="";
                        }
                    }

                    @Override
                    public void endDocument() throws SAXException {
                        System.out.println("xml解析完毕");
                    }
                });
                Iterator iterator=list.iterator();
                while (iterator.hasNext()){
                    Student tempstudent=new Student();
                    tempstudent=(Student)iterator.next();
                    System.out.println(tempstudent.getName());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FirstSaxTest firstSaxTest = new FirstSaxTest();
        firstSaxTest.parse("./employee.xml");

    }
}
