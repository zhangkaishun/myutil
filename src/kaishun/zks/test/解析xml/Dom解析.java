package kaishun.zks.test.解析xml;

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

public class Dom解析 {
	
	/**
	 * 生成xml文件
	 * @throws Exception
	 */
	@Test
    public void geneXmlByDom() throws Exception {  
        //step1:获得一个DocumentBuilderFactory  
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
        //step2:获得一个DocumentBuilder  
        DocumentBuilder db = factory.newDocumentBuilder();  
        //step3:新建一个Document对象  
        Document document = db.newDocument();  
        //step4:创建一个根节点  
        Element rootElement = document.createElement("Persons");  
        for (int i=0;i<5;i++) {  
            //step5:创建一个节点  
            Element person = document.createElement("person");  
            //step6:为该节点设定属性  
            person.setAttribute("id", "id_"+i);  
            Element name = document.createElement("name");  
            //为节点设定文本内容  
            name.setTextContent("name_"+i);  
            Element address = document.createElement("address");  
            address.setTextContent("address_"+i);  
            Element email = document.createElement("email");  
            email.setTextContent("email_"+i);  
            person.appendChild(name);  
            person.appendChild(address);  
            person.appendChild(email);  
            //step7:为某一元素节点设立子节点  
            rootElement.appendChild(person);  
        }  
        //step8:把刚刚建立的根节点添加到document对象中  
        document.appendChild(rootElement);  
        //step9:获得一个TransformerFactory对象  
        TransformerFactory transformerFactory = TransformerFactory.newInstance();  
        //step10:获得一个Transformer对象  
        Transformer transformer = transformerFactory.newTransformer();  
        //step11:把document对象用一个DOMSource对象包装起来  
        Source xmlSource = new DOMSource(document);  
        //step12:建立一个存储目标对象  
        Result outputTarget = new StreamResult(new File("persons.xml"));  
        //step13:生成相应的xml文件  
        transformer.transform(xmlSource, outputTarget);  
    }
	
		/**
		 * xml文件加载为docuemnt
		 * @throws Exception
		 */
	  public void parseXmlByDom() throws Exception {  
	        //step1:获得DocumentBuilderFactory  
	        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
	        //step2:获得DocumentBuilder  
	        DocumentBuilder db = factory.newDocumentBuilder();  
	        //step3:把需要解析的xml文件加载到一个document对象中  
	        Document document = db.parse("persons.xml");  
	        //获取所有名称为person的元素  
	        NodeList nodeList = document.getElementsByTagName("person");  
	        for (int i=0;i<nodeList.getLength();i++) {  
	            //因为这里我知道它就是一个Element对象，所以进行了强转  
	            Element person = (Element)nodeList.item(i);  
	            //获得Element对象的属性  
	            String id = person.getAttribute("id");  
	            //因为这里我知道只有一个对象，所以就直接item(0)了，  
	            //因为Dom是把每个对象都看做是一个节点的，所以如果在item(0)的时候直接取getNodeValue()是取不到值的，  
	            //只有是TextNode的时候用那个方法才可以取到值，如果想直接取值就用getTextContent()  
	            String name = person.getElementsByTagName("name").item(0).getTextContent();  
	            String address = person.getElementsByTagName("address").item(0).getTextContent();  
	            String email = person.getElementsByTagName("email").item(0).getTextContent();  
	            System.out.println(" id = "+id+" \r\n name = "+name+" \r\n address = "+address+" \r\n email = "+email);  
	            System.out.println("-------------------------------------");  
	        }  

	    } 
}
