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

public class 克隆 {
	public static Clazz clazz;
	private static Student student3 = new Student(3, "zhangsan3", "四川3");
	static {
		Student student1 = new Student(1, "zhangsan1", "四川1");
		Student student2 = new Student(2, "zhangsan2", "四川2");
		List<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		clazz = new Clazz();
		clazz.setName("班级");
		clazz.setStudent(students);
		student3.setClazz(clazz);

	}

	/**
	 * 通过对象的clone发放浅度克隆
	 */
	@Test
	public void testOne() {
		try {
			Clazz clone = clazz.clone();
			clazz.getStudent().get(0).setName("克隆后改变原始名");
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
	 * 对学生对象深度克隆，其实只是深度克隆了一层，请注意Student中的clone方法
	 * 
	 * 这样即使该表了原始student中班级的名字，也不会影响到克隆的student对象的班级名
	 */
	@Test
	public void testTwo() {
		try {
			Student clone = student3.clone();
			student3.getClazz().setName("克隆前改变原始班级名");
			System.out.println(student3.getClazz().getName());
			System.out.println("---------------------");
			System.out.println(clone.getClazz().getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 深度克隆，无论多少层，改变原始对象都不会对克隆后的对象产生影响
	 * 反之亦然
	 */
	@Test
	public void 绝对深度克隆() {
		Clazz absoluteClone = this.absoluteClone(clazz);
		clazz.getStudent().get(0).setName("修改");
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
