package kaishun.zks.test.流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kaishun.zks.test.vo.Student;

import org.junit.Test;

public class 对象流 {
	String url = "F:\\test\\test.txt";
	String url2 = "F:\\test\\test2.txt";
	@Test
	public void test1(){
		try{
		Student student=new Student();
		student.setName("zks");
		FileOutputStream fos=new FileOutputStream(url);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(student);
		FileInputStream fis=new FileInputStream(url);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student student2 = (Student) ois.readObject();
		System.out.println(student2.getName());
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
