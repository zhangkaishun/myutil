package kaishun.zks.test.解析xml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

public class Dom4j解析 {

	/**
	 * 创建xml 文件
	 * @throws FileNotFoundException 
	 * @throws UnsupportedEncodingException 
	 * 
	 */
	@Test
	public void dom4jToXml() throws Exception{
		Document doc=DocumentHelper.createDocument();
		Element books=doc.addElement("books");
		//增加根节点
		Element book1 = books.addElement("book");
		//添加自元素
		Element title1 = book1.addElement("title");
		Element author1=book1.addElement("author");
		
		Element book2 = books.addElement("book");
		Element title2 = book2.addElement("title");
		Element author2=book2.addElement("author");
		
		//添加属性
		books.addAttribute("name","books");
		book1.addAttribute("ID", "1");
		book1.addAttribute("name", "book1");
		book2.addAttribute("ID", "2");
		book2.addAttribute("name","book2");
		
		//为元素添加内容
		title1.setText("第一本书题目");
		author1.setText("第一本书作者");
		
		title2.setText("第二本书题目");
		author2.setText("第二本书作者");
		//实例化输出格式对象
		OutputFormat format=OutputFormat.createPrettyPrint();
		//设置编码格式
		format.setEncoding("UTF-8");
		//创建需要写入的File对象
		File file=new File("F:\\demo\\dom4j\\book.xml");
		XMLWriter writer=new XMLWriter(new FileOutputStream(file),format);
		writer.write(doc);
		writer.flush();
		writer.close();
	}
	
	/**
	 * 遍历 更新xml 删除
	 * @throws Exception
	 */
	@Test
	public void updateXml() throws Exception{
		SAXReader reader =new SAXReader();
		Document doc=reader.read(new File("F:\\demo\\dom4j\\book.xml"));
		//获得根节点
		Element root=doc.getRootElement();
		//获得该节点下的所有book节点
		@SuppressWarnings("unchecked")         //注意book为标签名
		List<Element> elements = root.elements("book");
		for(Element element:elements){
			Attribute attribute = element.attribute("key");
			//移除属性
			element.remove(attribute);
					// 添加属性           获得属性id的值
			element.addAttribute("key", element.attributeValue("ID")+element.attributeValue("name"));
			//获得id属性
			
		}
		
		//添加节点
		Element book3 = root.addElement("book3");
		book3.setText("123");
		//获得root下ID为1的节点,注意id必须大写
		Element ele=root.elementByID("1");
		//移除节点
		root.remove(ele);
		this.write(doc, "F:\\demo\\dom4j\\book.xml");
	}
	
	/**获得某个节点
	 * selectSingleNode xPath 
	 */
	@Test
	public void getNode() throws Exception{
		String xPath="/books/book/title[text()='"+"第二本书题目"+"']";
		SAXReader reader =new SAXReader();
		Document doc=reader.read(new File("F:\\demo\\dom4j\\book.xml"));
		Element element = (Element)doc.selectSingleNode(xPath);
		System.out.println(element.getText());
		//doc.selectNodes(xPath);
	}
	
	/**
	 * 遍历当前节点元素下面的所有(元素的)子节点 
	 */
	@Test
	public void listNode2() throws Exception{
		SAXReader reader=new SAXReader();
		Document doc=reader.read(new File("F:\\demo\\dom4j\\book.xml"));
		Element root=doc.getRootElement();
		// 遍历节点下的所有属性
		List<Attribute> attributes = root.attributes();
		for(Attribute attr:attributes){
			System.out.println(attr.getName()+"---"+attr.getValue());
		}
		//遍历节点下的子节点
		Iterator<Element> it = root.elementIterator();
		while(it.hasNext()){
			Element e=it.next();
			System.out.println(e.attributeValue("name"));
		}
		
	}
	
	/**
	 * 介绍Element中的element方法和elements方法的使用 
	 * @throws DocumentException 
	 */
	@Test
	public void elementMethod() throws DocumentException{
		SAXReader reader=new SAXReader();
		Document doc=reader.read(new File("F:\\demo\\dom4j\\book.xml"));
		Element root=doc.getRootElement();
		// 获取node节点中，子节点的元素名称为西游记的元素节点。  
        Element e = root.element("西游记");  
        // 获取西游记元素节点中，子节点为作者的元素节点(可以看到只能获取第一个作者元素节点)  
        Element author = e.element("作者");  
        System.out.println(e.getName() + "----" + author.getText());  

        // 获取西游记这个元素节点 中，所有子节点名称为作者元素的节点 。  

        List<Element> authors = e.elements("作者");  
        for (Element aut : authors) {  
            System.out.println(aut.getText());  
        }  

        // 获取西游记这个元素节点 所有元素的子节点。  
        List<Element> elements = e.elements();  

        for (Element el : elements) {  
            System.out.println(el.getText());  
        }  

	}
	
	/**
	 * 遍历元素与属性
	 * @throws DocumentException
	 */
	@Test
	public void xmlToDom4j() throws DocumentException{
		  SAXReader reader = new SAXReader();
	      Document document = reader.read(new File("books.xml"));
	      Element root = document.getRootElement();

	      Iterator it = root.elementIterator();
	      while (it.hasNext()) {
	       Element element = (Element) it.next();

	       //未知属性名称情况下
	       /*Iterator attrIt = element.attributeIterator();
	       while (attrIt.hasNext()) {
	        Attribute a  = (Attribute) attrIt.next();
	        System.out.println(a.getValue());
	       }*/

	       //已知属性名称情况下
	       System.out.println("id: " + element.attributeValue("id"));

	       //未知元素名情况下
	       /*Iterator eleIt = element.elementIterator();
	       while (eleIt.hasNext()) {
	        Element e = (Element) eleIt.next();
	        System.out.println(e.getName() + ": " + e.getText());
	       }
	       System.out.println();*/

	       //已知元素名情况下
	       System.out.println("title: " + element.elementText("title"));
	       System.out.println("author: " + element.elementText("author"));
	       System.out.println();
	      }
	}
	
	
	private void write(Document document,String path) throws Exception{
		//createPrettyPrint 排版压缩格式   createCompactFormat 紧凑格式
 		OutputFormat format=OutputFormat.createPrettyPrint();
		format.setEncoding("UTF-8");
		XMLWriter writer=new XMLWriter(new FileOutputStream(new File(path)),format);
		writer.write(document);
		//立即写入
		writer.flush();
		//关闭操作
		writer.close();
		
	}
}
