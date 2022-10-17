package com.ramusoft.automation.supports;

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

public class XmlReader {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		File file = new File("D:\\Selenium_workspace\\New10amBatch\\frameworks\\src\\com\\ramusoft\\automation\\supports\\Demo.xml");
		
	DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
	Document document=documentBuilder.parse(file);
	document.getDocumentElement().normalize();
	String nodename = document.getDocumentElement().getNodeName();
	System.out.println(nodename);
	NodeList nodelist=document.getElementsByTagName("emp");
	for (int i = 0; i < nodelist.getLength(); i++) {
		
	Node node = nodelist.item(i);
	System.out.println("get node name :"+node.getNodeName());	
		if (node.getNodeType()== Node.ELEMENT_NODE) {
		Element element	= (Element) node ;
		System.out.println("emp id:"+element.getElementsByTagName("empname").item(0).getTextContent());
		System.out.println("emp id:"+element.getElementsByTagName("empsla").item(0).getTextContent());
		System.out.println("emp id:"+element.getElementsByTagName("empdec").item(0).getTextContent());
		
		
		
		}
	}
		
		
		
		
		
	}
	
	
	
}
