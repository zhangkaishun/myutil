package kaishun.zks.test.���ģʽ.�ն���ģʽ;

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
