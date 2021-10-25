package assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class SaxParserTest {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, FileNotFoundException, IOException {
		SAXParser  saxParser = SAXParserFactory.newInstance().newSAXParser();
		saxParser.parse(new FileInputStream(new File("D:\\edureka_assignment_workspace\\Module6_assignment\\src\\assignment\\Student_Data.xml")), new SaxParserDemo());

	}

}
