package XML.homework2;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dubo on 16/10/27.
 */
public class CDHandler extends DefaultHandler {
    private List<Cd> list;
    private Cd cd;
    private String flag;
    public List<Cd> getList() {
        return list;
    }

    public void setList(List<Cd> list) {
        this.list = list;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.print("<"+qName);
        if(localName.equalsIgnoreCase("cd")){
            //System.out.println("new cd");
            cd=new Cd();
        }else {
            flag=localName;
        }
        for (int i=0;i<attributes.getLength();i++){
            String localName1 = attributes.getLocalName(i);
            String attributesValue = attributes.getValue(i);
            // set code
            if (localName1.equals("code")){
                cd.setCode(attributesValue);
            }
            System.out.print(" "+localName1+ "=\""+attributesValue+"\"");

        }
        System.out.print(">");


    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("parse start");
        System.out.println("<?xml version=\"1.0\" encoding=\"utf-8\" ?>");
        list=new ArrayList<>();
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String value=new String(ch,start,length);
        if (cd!=null && flag !=null &&!value.equals("")){
            //System.out.println("flag = ");
            //System.out.println(flag);
            switch (flag){
                case "TITLE":cd.setTitle(value);
                    break;
                case "ARTIST":cd.setArtist(value);
                    break;
                case "COMPANY":cd.setCompany(value);
                    break;
                case "YEAR":cd.setYear(value);
                    break;
                case "COUNTRY":cd.setCountry(value);
                    break;
                case "PRICE":cd.setPrice(Double.parseDouble(value));
                    break;

            }
            System.out.print(value);
        }

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.print("</"+qName+">");
        if ("cd".equals(qName)){
            System.out.println("add");
            list.add(cd);
        }else {
            flag=null;
        }
        System.out.println();
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println();
        System.out.println("parse end");
    }
}
