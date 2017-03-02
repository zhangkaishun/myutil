package kaishun.zks.test.设计模式.适配器模式;

public class Test {

	public static void main(String[] args) {
		
		Target target=new Adapter();
		target.say();
	}
}
