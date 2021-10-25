package assignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class WriteDomParserDemo {

	public static void main(String[] args) throws ParserConfigurationException, TransformerFactoryConfigurationError, FileNotFoundException, TransformerException {

		// Create a factory obj
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		// Create a DocumentBuilder obj
		DocumentBuilder builder = factory.newDocumentBuilder();

		// Get Document
		Document document = builder.newDocument();

		// create root element
		Element rootE = document.createElement("employees");

		// create branch
		Element employeeE = document.createElement("employee");
		
		//create attribute
        Attr attr = document.createAttribute("emp_id");
        attr.setValue("001");
        employeeE.setAttributeNode(attr);

		// create leaf and append text to leaf
		Element nameE = document.createElement("emp_name");
		Text textname = document.createTextNode("Rohit");
		nameE.appendChild(textname);
		
		Element deptE = document.createElement("emp_dept");
		Text textdept = document.createTextNode("HR");
		deptE.appendChild(textdept);
		

		// append leaves to it branch
		employeeE.appendChild(nameE);
		employeeE.appendChild(deptE);


		// append branch to root
		rootE.appendChild(employeeE);

		// append root to document
		document.appendChild(rootE);

		// tranform docuent obj to XML file
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		transformer.transform(new DOMSource(document), new StreamResult(new FileOutputStream("D:\\edureka_assignment_workspace\\Module6_assignment\\src\\assignment\\Employee_data.xml")));
		System.out.println("XML fil Created");
	}

}
