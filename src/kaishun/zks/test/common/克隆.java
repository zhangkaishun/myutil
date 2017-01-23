package kaishun.zks.test.common;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import kaishun.zks.test.vo.Clazz;
import kaishun.zks.test.vo.Student;

import org.junit.Test;

public class ��¡ {
	public static Clazz clazz;
	private static Student student3 = new Student(3, "zhangsan3", "�Ĵ�3");
	static {
		Student student1 = new Student(1, "zhangsan1", "�Ĵ�1");
		Student student2 = new Student(2, "zhangsan2", "�Ĵ�2");
		List<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		clazz = new Clazz();
		clazz.setName("�༶");
		clazz.setStudent(students);
		student3.setClazz(clazz);

	}

	/**
	 * ͨ�������clone����ǳ�ȿ�¡
	 */
	@Test
	public void testOne() {
		try {
			Clazz clone = clazz.clone();
			clazz.getStudent().get(0).setName("��¡��ı�ԭʼ��");
			for (Student student : clazz.getStudent()) {
				System.out.println(student.getName());
			}
			System.out.println("--------------");
			for (Student student : clone.getStudent()) {
				System.out.println(student.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * ��ѧ��������ȿ�¡����ʵֻ����ȿ�¡��һ�㣬��ע��Student�е�clone����
	 * 
	 * ������ʹ�ñ���ԭʼstudent�а༶�����֣�Ҳ����Ӱ�쵽��¡��student����İ༶��
	 */
	@Test
	public void testTwo() {
		try {
			Student clone = student3.clone();
			student3.getClazz().setName("��¡ǰ�ı�ԭʼ�༶��");
			System.out.println(student3.getClazz().getName());
			System.out.println("---------------------");
			System.out.println(clone.getClazz().getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * ��ȿ�¡�����۶��ٲ㣬�ı�ԭʼ���󶼲���Կ�¡��Ķ������Ӱ��
	 * ��֮��Ȼ
	 */
	@Test
	public void ������ȿ�¡() {
		Clazz absoluteClone = this.absoluteClone(clazz);
		clazz.getStudent().get(0).setName("�޸�");
		for(Student student:clazz.getStudent()){
			System.out.println(student.getName());
		}
		System.out.println("-------------");
		for(Student student:absoluteClone.getStudent()){
			System.out.println(student.getName());
		}
	}

	private Clazz absoluteClone(Clazz clazz) {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oo = new ObjectOutputStream(baos);
			oo.writeObject(clazz);
			
			ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream oi=new ObjectInputStream(bais);
			Clazz clazzClone = (Clazz) oi.readObject();
			
			oi.close();
			bais.close();
			oo.close();
			baos.close();
			return clazzClone;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		
	}

}
