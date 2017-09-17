package kaishun.zks.test.流;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kaishun.zks.test.vo.Clazz;
import kaishun.zks.test.vo.Student;

import org.junit.Test;

public class 字节数组流 {
	@Test
	public void test(){
		try{
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		baos.write("开".getBytes());
		baos.write("顺".getBytes());
		
		ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
		byte[] by=new byte[1024];
		int b=0;
		while((b=bais.read(by,0,1024))!=-1){
			System.out.println(new String(by));
		}
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void test2(){
		Student student=new Student();
		student.setName("zks");
		Clazz clazz=new Clazz();
		clazz.setName("班级1");
		student.setClazz(clazz);
		try{
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(baos);
		oos.writeObject(student);
		oos.flush();
		clazz.setName("班级2");
		
		ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(bais);
		Student student2 = (Student) ois.readObject();
		System.out.println(student2.getClazz().getName());
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
