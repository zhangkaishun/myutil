package kaishun.zks.test.����.�ڲ���;

public class �����ڲ��� {

	public void sayHello() {
		System.out.println("hello world");
	}

	public static void main(String[] args) {
		�����ڲ��� object = new �����ڲ���() {
			@Override
			public void sayHello() {
				System.out.println("�����ڲ��� hello world");
			}
		};
		object.sayHello();

	}
}
