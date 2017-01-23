package kaishun.zks.test.����xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Dom���� {
	
	/**
	 * ����xml�ļ�
	 * @throws Exception
	 */
	@Test
    public void geneXmlByDom() throws Exception {  
        //step1:���һ��DocumentBuilderFactory  
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
        //step2:���һ��DocumentBuilder  
        DocumentBuilder db = factory.newDocumentBuilder();  
        //step3:�½�һ��Document����  
        Document document = db.newDocument();  
        //step4:����һ�����ڵ�  
        Element rootElement = document.createElement("Persons");  
        for (int i=0;i<5;i++) {  
            //step5:����һ���ڵ�  
            Element person = document.createElement("person");  
            //step6:Ϊ�ýڵ��趨����  
            person.setAttribute("id", "id_"+i);  
            Element name = document.createElement("name");  
            //Ϊ�ڵ��趨�ı�����  
            name.setTextContent("name_"+i);  
            Element address = document.createElement("address");  
            address.setTextContent("address_"+i);  
            Element email = document.createElement("email");  
            email.setTextContent("email_"+i);  
            person.appendChild(name);  
            person.appendChild(address);  
            person.appendChild(email);  
            //step7:ΪĳһԪ�ؽڵ������ӽڵ�  
            rootElement.appendChild(person);  
        }  
        //step8:�Ѹոս����ĸ��ڵ���ӵ�document������  
        document.appendChild(rootElement);  
        //step9:���һ��TransformerFactory����  
        TransformerFactory transformerFactory = TransformerFactory.newInstance();  
        //step10:���һ��Transformer����  
        Transformer transformer = transformerFactory.newTransformer();  
        //step11:��document������һ��DOMSource�����װ����  
        Source xmlSource = new DOMSource(document);  
        //step12:����һ���洢Ŀ�����  
        Result outputTarget = new StreamResult(new File("persons.xml"));  
        //step13:������Ӧ��xml�ļ�  
        transformer.transform(xmlSource, outputTarget);  
    }
	
		/**
		 * xml�ļ�����Ϊdocuemnt
		 * @throws Exception
		 */
	  public void parseXmlByDom() throws Exception {  
	        //step1:���DocumentBuilderFactory  
	        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
	        //step2:���DocumentBuilder  
	        DocumentBuilder db = factory.newDocumentBuilder();  
	        //step3:����Ҫ������xml�ļ����ص�һ��document������  
	        Document document = db.parse("persons.xml");  
	        //��ȡ��������Ϊperson��Ԫ��  
	        NodeList nodeList = document.getElementsByTagName("person");  
	        for (int i=0;i<nodeList.getLength();i++) {  
	            //��Ϊ������֪��������һ��Element�������Խ�����ǿת  
	            Element person = (Element)nodeList.item(i);  
	            //���Element���������  
	            String id = person.getAttribute("id");  
	            //��Ϊ������֪��ֻ��һ���������Ծ�ֱ��item(0)�ˣ�  
	            //��ΪDom�ǰ�ÿ�����󶼿�����һ���ڵ�ģ����������item(0)��ʱ��ֱ��ȡgetNodeValue()��ȡ����ֵ�ģ�  
	            //ֻ����TextNode��ʱ�����Ǹ������ſ���ȡ��ֵ�������ֱ��ȡֵ����getTextContent()  
	            String name = person.getElementsByTagName("name").item(0).getTextContent();  
	            String address = person.getElementsByTagName("address").item(0).getTextContent();  
	            String email = person.getElementsByTagName("email").item(0).getTextContent();  
	            System.out.println(" id = "+id+" \r\n name = "+name+" \r\n address = "+address+" \r\n email = "+email);  
	            System.out.println("-------------------------------------");  
	        }  

	    } 
}
