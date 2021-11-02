package JAVA.XML_FILE_READER;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import JAVA.XML_FILES.*;
public class DomParser {


    public static void main(String[] args) {

        String filePath = "JAVA/XML_FILES/DomParser.xml";
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("student");
            // now XML is loaded as Document in memory, lets convert it to Object List
            List<StudentModel> students = new ArrayList<StudentModel>();
            for (int i = 0; i < nodeList.getLength(); i++) {
                students.add(getEmployee(nodeList.item(i)));
            }
            // lets print Employee list information
            for (StudentModel student : students) {
                System.out.println(student.getName()+" "+student.getId());
            }
        } catch (SAXException | ParserConfigurationException | IOException e1) {
            e1.printStackTrace();
        }

    }

    private static StudentModel getEmployee(Node node) {
        // XMLReaderDOM domReader = new XMLReaderDOM();
        StudentModel student = new StudentModel();
        CommonXml xml = new CommonXml();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            student.setName(xml.getTagValue("name", element));
            student.setId(Integer.parseInt(element.getAttribute("id")));
        }
        return student;
    }

}
