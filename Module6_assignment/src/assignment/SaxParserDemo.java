package assignment;

import java.io.File;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParserDemo extends DefaultHandler{

	@Override
	public void startDocument() throws SAXException {
		System.out.println("Document Start..");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		//System.out.println("<"+qName+">");
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		System.out.println(new String(ch,start,length));
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		//System.out.println("</"+qName+">");
	}
	
	@Override
	public void endDocument() throws SAXException {
		System.out.println("Document ends...");
	}
	
	

}
