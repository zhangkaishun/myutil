package kaishun.zks.test.设计模式.空对象模式;

public class NullCustomer extends AbstractCustomer{

	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getName() {
		return "no name is available";
	}

}
