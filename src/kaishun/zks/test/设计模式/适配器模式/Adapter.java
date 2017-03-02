package kaishun.zks.test.设计模式.适配器模式;

public class Adapter extends SpecialClass implements Target {

	@Override
	public void say() {
		super.sayClassName();
	}

}
