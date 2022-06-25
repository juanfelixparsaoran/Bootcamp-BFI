package com.learning.dom;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final String ALEXA_API = "http://data.alexa.com/data?cli=10&url=";
    private static final DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    public static void main( String[] args ) throws Exception
    {
        parseDomXmlFromFile();
        // readXmlfromDomain("bfi.co.id");
    }

    public static void parseDomXmlFromFile() throws Exception{
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document = builder.parse(new File("src/main/resources/employee.xml"));

        Element root = document.getDocumentElement();
        System.out.println(root.getNodeName());

        NodeList nList = document.getElementsByTagName("employee");
        System.out.println("=====================================");

        for (int temp = 0; temp<nList.getLength(); temp++){
            Node node = nList.item(temp);
            System.out.println();
            if(node.getNodeType() == Node.ELEMENT_NODE){
                Element eElement = (Element) node;
                System.out.println("Employee id : "+ eElement.getAttribute("id"));
                System.out.println("First Name : "+ eElement.getElementsByTagName("firstName").item(0).getTextContent());
                System.out.println("Last Name : "+ eElement.getElementsByTagName("lastName").item(0).getTextContent());
                System.out.println("Location : "+ eElement.getElementsByTagName("location").item(0).getTextContent());
            }

        }
    }

    public static void readXmlfromDomain(String domain) throws Exception{

        int alexaRangking = getAlexaRanking(domain);
        System.out.println("Ranking : "+alexaRangking);

    }

    public static int getAlexaRanking(String domain) throws Exception{

        int result = 0;
        String url = ALEXA_API + domain;

        try{
            URLConnection conn = new URL(url).openConnection();

            try (InputStream is = conn.getInputStream()){
                dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

                DocumentBuilder dBuilder = dbf.newDocumentBuilder();
                Document doc = dBuilder.parse(is);
                Element element = doc.getDocumentElement();

                NodeList nodeList = element.getElementsByTagName("POPULARITY");
                if (nodeList.getLength() > 0){
                    Element elementAttribute = (Element) nodeList.item(0);
                    String ranking = elementAttribute.getAttribute("TEXT");
                    if(!"".equals(ranking)){
                        result = Integer.parseInt(ranking);
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            throw new IllegalArgumentException("Invalid request for domain");
        }

        return result;

    }
}
