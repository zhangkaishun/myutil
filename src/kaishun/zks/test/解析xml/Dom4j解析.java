package kaishun.zks.test.����xml;

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

public class Dom4j���� {

	/**
	 * ����xml �ļ�
	 * @throws FileNotFoundException 
	 * @throws UnsupportedEncodingException 
	 * 
	 */
	@Test
	public void dom4jToXml() throws Exception{
		Document doc=DocumentHelper.createDocument();
		Element books=doc.addElement("books");
		//���Ӹ��ڵ�
		Element book1 = books.addElement("book");
		//�����Ԫ��
		Element title1 = book1.addElement("title");
		Element author1=book1.addElement("author");
		
		Element book2 = books.addElement("book");
		Element title2 = book2.addElement("title");
		Element author2=book2.addElement("author");
		
		//�������
		books.addAttribute("name","books");
		book1.addAttribute("ID", "1");
		book1.addAttribute("name", "book1");
		book2.addAttribute("ID", "2");
		book2.addAttribute("name","book2");
		
		//ΪԪ���������
		title1.setText("��һ������Ŀ");
		author1.setText("��һ��������");
		
		title2.setText("�ڶ�������Ŀ");
		author2.setText("�ڶ���������");
		//ʵ���������ʽ����
		OutputFormat format=OutputFormat.createPrettyPrint();
		//���ñ����ʽ
		format.setEncoding("UTF-8");
		//������Ҫд���File����
		File file=new File("F:\\demo\\dom4j\\book.xml");
		XMLWriter writer=new XMLWriter(new FileOutputStream(file),format);
		writer.write(doc);
		writer.flush();
		writer.close();
	}
	
	/**
	 * ���� ����xml ɾ��
	 * @throws Exception
	 */
	@Test
	public void updateXml() throws Exception{
		SAXReader reader =new SAXReader();
		Document doc=reader.read(new File("F:\\demo\\dom4j\\book.xml"));
		//��ø��ڵ�
		Element root=doc.getRootElement();
		//��øýڵ��µ�����book�ڵ�
		@SuppressWarnings("unchecked")         //ע��bookΪ��ǩ��
		List<Element> elements = root.elements("book");
		for(Element element:elements){
			Attribute attribute = element.attribute("key");
			//�Ƴ�����
			element.remove(attribute);
					// �������           �������id��ֵ
			element.addAttribute("key", element.attributeValue("ID")+element.attributeValue("name"));
			//���id����
			
		}
		
		//��ӽڵ�
		Element book3 = root.addElement("book3");
		book3.setText("123");
		//���root��IDΪ1�Ľڵ�,ע��id�����д
		Element ele=root.elementByID("1");
		//�Ƴ��ڵ�
		root.remove(ele);
		this.write(doc, "F:\\demo\\dom4j\\book.xml");
	}
	
	/**���ĳ���ڵ�
	 * selectSingleNode xPath 
	 */
	@Test
	public void getNode() throws Exception{
		String xPath="/books/book/title[text()='"+"�ڶ�������Ŀ"+"']";
		SAXReader reader =new SAXReader();
		Document doc=reader.read(new File("F:\\demo\\dom4j\\book.xml"));
		Element element = (Element)doc.selectSingleNode(xPath);
		System.out.println(element.getText());
		//doc.selectNodes(xPath);
	}
	
	/**
	 * ������ǰ�ڵ�Ԫ�����������(Ԫ�ص�)�ӽڵ� 
	 */
	@Test
	public void listNode2() throws Exception{
		SAXReader reader=new SAXReader();
		Document doc=reader.read(new File("F:\\demo\\dom4j\\book.xml"));
		Element root=doc.getRootElement();
		// �����ڵ��µ���������
		List<Attribute> attributes = root.attributes();
		for(Attribute attr:attributes){
			System.out.println(attr.getName()+"---"+attr.getValue());
		}
		//�����ڵ��µ��ӽڵ�
		Iterator<Element> it = root.elementIterator();
		while(it.hasNext()){
			Element e=it.next();
			System.out.println(e.attributeValue("name"));
		}
		
	}
	
	/**
	 * ����Element�е�element������elements������ʹ�� 
	 * @throws DocumentException 
	 */
	@Test
	public void elementMethod() throws DocumentException{
		SAXReader reader=new SAXReader();
		Document doc=reader.read(new File("F:\\demo\\dom4j\\book.xml"));
		Element root=doc.getRootElement();
		// ��ȡnode�ڵ��У��ӽڵ��Ԫ������Ϊ���μǵ�Ԫ�ؽڵ㡣  
        Element e = root.element("���μ�");  
        // ��ȡ���μ�Ԫ�ؽڵ��У��ӽڵ�Ϊ���ߵ�Ԫ�ؽڵ�(���Կ���ֻ�ܻ�ȡ��һ������Ԫ�ؽڵ�)  
        Element author = e.element("����");  
        System.out.println(e.getName() + "----" + author.getText());  

        // ��ȡ���μ����Ԫ�ؽڵ� �У������ӽڵ�����Ϊ����Ԫ�صĽڵ� ��  

        List<Element> authors = e.elements("����");  
        for (Element aut : authors) {  
            System.out.println(aut.getText());  
        }  

        // ��ȡ���μ����Ԫ�ؽڵ� ����Ԫ�ص��ӽڵ㡣  
        List<Element> elements = e.elements();  

        for (Element el : elements) {  
            System.out.println(el.getText());  
        }  

	}
	
	/**
	 * ����Ԫ��������
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

	       //δ֪�������������
	       /*Iterator attrIt = element.attributeIterator();
	       while (attrIt.hasNext()) {
	        Attribute a  = (Attribute) attrIt.next();
	        System.out.println(a.getValue());
	       }*/

	       //��֪�������������
	       System.out.println("id: " + element.attributeValue("id"));

	       //δ֪Ԫ���������
	       /*Iterator eleIt = element.elementIterator();
	       while (eleIt.hasNext()) {
	        Element e = (Element) eleIt.next();
	        System.out.println(e.getName() + ": " + e.getText());
	       }
	       System.out.println();*/

	       //��֪Ԫ���������
	       System.out.println("title: " + element.elementText("title"));
	       System.out.println("author: " + element.elementText("author"));
	       System.out.println();
	      }
	}
	
	
	private void write(Document document,String path) throws Exception{
		//createPrettyPrint �Ű�ѹ����ʽ   createCompactFormat ���ո�ʽ
 		OutputFormat format=OutputFormat.createPrettyPrint();
		format.setEncoding("UTF-8");
		XMLWriter writer=new XMLWriter(new FileOutputStream(new File(path)),format);
		writer.write(document);
		//����д��
		writer.flush();
		//�رղ���
		writer.close();
		
	}
}
