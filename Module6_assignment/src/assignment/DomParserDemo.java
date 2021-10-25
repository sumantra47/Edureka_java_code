package assignment;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomParserDemo {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//Create File obj
		File file = new File("D:\\edureka_assignment_workspace\\Module6_assignment\\src\\assignment\\Student_Data.xml");
		
		//Create a factory obj
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();	
		
		//Create a DocumentBuilder obj
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		//parse xml file
		Document document = builder.parse(file);
		
		//get root element
		System.out.println("Root element :" + document.getDocumentElement().getNodeName());
		
		//get the node list	
		NodeList list = document.getElementsByTagName("student");
		int length = list.getLength();
		System.out.println("Node element list :" + length);
		
		//get each element
		for(int i=0;i<length;i++) {
			Node node = list.item(i);
			System.out.println("Node Element :"+ node.getNodeName());
			Element element = (Element)node;// to fetch the tagnames and context
			System.out.println("Attribute id: "+ element.getAttribute("stud_id"));
			System.out.println(element.getElementsByTagName("stud_name").item(0).getTextContent());
			System.out.println(element.getElementsByTagName("name_last").item(0).getTextContent());
			System.out.println(element.getElementsByTagName("stud_std").item(0).getTextContent());
			System.out.println(element.getElementsByTagName("stud_gender").item(0).getTextContent());
			System.out.println(element.getElementsByTagName("stud_marks").item(0).getTextContent());
			System.out.println(element.getElementsByTagName("stud_address").item(0).getTextContent());
			System.out.println("***************************************");
			
		}
		}

}
