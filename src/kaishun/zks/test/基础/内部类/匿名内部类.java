package kaishun.zks.test.基础.内部类;

public class 匿名内部类 {

	public void sayHello() {
		System.out.println("hello world");
	}

	public static void main(String[] args) {
		匿名内部类 object = new 匿名内部类() {
			@Override
			public void sayHello() {
				System.out.println("匿名内部类 hello world");
			}
		};
		object.sayHello();

	}
}
